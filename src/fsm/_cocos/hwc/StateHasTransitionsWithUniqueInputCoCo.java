package fsm._cocos.hwc;

import java.util.HashSet;
import java.util.Set;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTState;
import fsm._ast.ASTTransition;
import fsm._cocos.FSMASTStateCoCo;

/**
 * Checks if the outgoing transitions from a state all
 * have a different input.
 */
public class StateHasTransitionsWithUniqueInputCoCo implements FSMASTStateCoCo {

	@Override
	public void check(ASTState node) {
		Set<String> existingInputs = new HashSet<>();
		
		for (ASTTransition transition : node.getTransitionList()) {
			if (!existingInputs.add(transition.getInput().getValue())) {
				Log.error("For each state, all outgoing transitions must have different inputs." , node.get_SourcePositionStart());
				return;
			}
		}
	}

}
