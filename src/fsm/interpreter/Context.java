package fsm.interpreter;

import fsm._ast.ASTState;

/**
 * Stores the runtime data when running {@link Interpreter}.
 */
public class Context {
	private ASTState currentState;
	private String currentInput;
	private StepResult lastStepResult;

	public Context(ASTState initialState) {
		currentState = initialState;
	}

	public ASTState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ASTState currentState) {
		this.currentState = currentState;
	}

	public String getCurrentInput() {
		return currentInput;
	}

	public void setCurrentInput(String currentInput) {
		this.currentInput = currentInput;
	}

	public StepResult getLastStepResult() {
		return lastStepResult;
	}

	public void setLastStepResult(StepResult lastStepResult) {
		this.lastStepResult = lastStepResult;
	}
}
