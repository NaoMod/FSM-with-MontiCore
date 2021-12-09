package fsm.interpreter;

import fsm._ast.ASTState;

/**
 * Stores the runtime data when running {@link Interpreter}.
 */
public class Context {
	private ASTState currentState;

	public Context(ASTState initialState) {
		currentState = initialState;
	}

	public ASTState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(ASTState currentState) {
		this.currentState = currentState;
	}
}
