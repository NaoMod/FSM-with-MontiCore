package fsm._cocos.hwc;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTTransition;
import fsm._cocos.FSMASTTransitionCoCo;

/**
 * Checks if the target state of a transition is defined.
 */
public class TransitionReferencesExistingStateCoCo implements FSMASTTransitionCoCo {

	@Override
	public void check(ASTTransition node) {
		if (!node.getNameSymbol().isPresentAstNode()) {
			Log.error("The transition references an undefined target state.", node.get_SourcePositionStart());
		}
	}

}
