package fsm._cocos.hwc;

import java.util.HashSet;
import java.util.Set;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTFSM;
import fsm._ast.ASTState;
import fsm._cocos.FSMASTFSMCoCo;

/**
 * Checks if all states have a different name.
 */
public class StatesHaveUniqueNamesCoCo implements FSMASTFSMCoCo {

	@Override
	public void check(ASTFSM node) {
		Set<String> existingNames = new HashSet<>();
		
		for (ASTState state : node.getStateList()) {
			if (!existingNames.add(state.getName())) {
				Log.error("Every state must have a different name.", state.get_SourcePositionStart());
				return;
			}
		}
	}

}
