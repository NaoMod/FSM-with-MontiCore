package fsm._cocos.hwc;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTFSM;
import fsm._cocos.FSMASTFSMCoCo;

/**
 * Checks if the FSM has an unique initial state.
 */
public class FSMHasUniqueInitialStateCoCo implements FSMASTFSMCoCo {

	@Override
	public void check(ASTFSM node) {
		if (!node.isPresentInitialStateDefinition()) Log.error("An FSM must have at exactly one initial state.");
	}
}
