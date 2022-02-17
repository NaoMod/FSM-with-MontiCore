package fsm.interpreter;

import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;

import fsm._ast.ASTFSM;
import fsm._ast.ASTState;
import fsm._visitor.FSMTraverser;
import fsm._visitor.FSMTraverserImplementation;
import fsm._visitor.hwc.FSMBasicVisitor;
import fsm._visitor.hwc.FSMHandlerWithContext;

/**
 * Takes an FSM complying to the grammar described in FSM.mc4 and allows the user
 * to give inputs via the console and trigger corresponding transitions.
 */
public class Interpreter {
	private Context context;
	private ASTFSM fsm;
	
	public Interpreter(ASTFSM fsm) {
		context = new Context(fsm.getInitialStateDefinition());
		this.fsm = fsm;
	}
	
	/**
	 * Launches the interpreter.
	 */
	public void interpret() {
		FSMTraverser traverser = new FSMTraverserImplementation();
		traverser.setFSMHandler(new FSMHandlerWithContext(context));
		traverser.add4FSM(new FSMBasicVisitor(context));

		Scanner scanner = new Scanner(System.in);
		String input = readInput(scanner);
		context.setCurrentInput(input);
		
		while (!input.isEmpty()) {
			traverser.handle(context.getCurrentState());
			StepResult stepResult = context.getLastStepResult();

			if (!stepResult.isPossible()) {
				System.out.println("Execution failed ! No transition with input " + input + " from the current state.");
				return;
			}
			
			context.setCurrentState(stepResult.getCurrentState());
			System.out.println("Output : " + stepResult.getOutput());			
			System.out.println("-------");
			
			input = readInput(scanner);
			context.setCurrentInput(input);
		}
		
		if (checkFinalState(context.getCurrentState())) {
			System.out.println("Execution successful !");
		} else {
			System.out.println("Execution failed ! The current state is not final.");
		}
		
		scanner.close();
	}

	/**
	 * @param scanner the scanner used to read console inputs
	 * @return the string inputed by the user
	 */
	private String readInput(Scanner scanner) {
		System.out.println("Current state : " + context.getCurrentState().getName());
		System.out.println("Input (empty to stop execution) : ");
		String input = scanner.nextLine();
		return input;
	}
	
	/**
	 * @param state the state to check
	 * @return true if the {@link ASTState} is final, false otherwise
	 */
	private boolean checkFinalState(ASTState state) {
		boolean isFinal = false;
		Iterator<Optional<ASTState>> ite = fsm.getFinalStatesDefinitionList().iterator();
		
		while (ite.hasNext() && !isFinal) {
			ASTState currentState = ite.next().get();
			if (currentState == state) isFinal = true;
		}
		
		return isFinal;
	}
}
