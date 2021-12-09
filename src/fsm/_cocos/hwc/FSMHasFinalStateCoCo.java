package fsm._cocos.hwc;

import java.util.Optional;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTFSM;
import fsm._ast.ASTState;
import fsm._cocos.FSMASTFSMCoCo;

/**
 * Checks if the FSM has at least a final state.
 */
public class FSMHasFinalStateCoCo implements FSMASTFSMCoCo {

	@Override
	public void check(ASTFSM node) {
		for (Optional<ASTState> state : node.getFinalStatesDefinitionList()) {
			if (state.isPresent()) return;
		}
		
		Log.error("An FSM must have at least one final state.");
	}

}
