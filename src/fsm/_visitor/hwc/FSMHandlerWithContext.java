package fsm._visitor.hwc;

import fsm._ast.ASTState;
import fsm._ast.ASTTransition;
import fsm._visitor.FSMHandler;
import fsm._visitor.FSMTraverser;
import fsm.interpreter.Context;
import fsm.interpreter.StepResult;

public class FSMHandlerWithContext implements FSMHandler {
    
    private FSMTraverser traverser;
    private Context context;

    public FSMHandlerWithContext(Context context) {
        super();
        this.context = context;
    }

    @Override
    public FSMTraverser getTraverser() {
        return traverser;
    }

    @Override
    public void setTraverser(FSMTraverser traverser) {
        this.traverser = traverser;
    }

    @Override
    public void handle(ASTState node) {
        getTraverser().traverse(node);
    }

    @Override
    public void handle(ASTTransition node) {
        getTraverser().visit(node);
    }

    @Override
    public void traverse(ASTState node) {
        ASTTransition candidateTransition = node.findOutgoingTransitionWithInput(context.getCurrentInput());
        if (candidateTransition==null) {
            context.setLastStepResult(new StepResult(false));
            return;
        }
        candidateTransition.accept(getTraverser());
    }

    @Override
    public void traverse(ASTTransition node) {
        return;
    }
}
