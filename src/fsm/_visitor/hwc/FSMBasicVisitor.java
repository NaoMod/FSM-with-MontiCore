package fsm._visitor.hwc;

import fsm._ast.ASTTransition;
import fsm._visitor.FSMVisitor2;
import fsm.interpreter.Context;
import fsm.interpreter.StepResult;

public class FSMBasicVisitor implements FSMVisitor2 {

    private Context context;

    public FSMBasicVisitor(Context context) {
        this.context = context;
    }

    @Override
    public void visit(ASTTransition node) {
        context.setLastStepResult(new StepResult(true, node.getOutput().getValue(), node.getNameDefinition()));
    }
}
