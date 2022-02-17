package fsm.interpreter;

import fsm._ast.ASTState;

public class StepResult {
    private String output;
    private boolean isPossible;
    private ASTState currentState;

    public StepResult(boolean isPossible, String output, ASTState currentState) {
        this.isPossible = isPossible;
        this.output = output;
        this.currentState = currentState;
    }

    public StepResult(boolean isPossible) {
        this.isPossible = isPossible;
    }

    public String getOutput() {
        return output;
    }

    public boolean isPossible() {
        return isPossible;
    }

    public ASTState getCurrentState() {
        return currentState;
    }
}
