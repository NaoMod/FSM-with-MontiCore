package fsm._cocos.hwc;

import java.util.Optional;

import de.se_rwth.commons.logging.Log;
import fsm._ast.ASTFSM;
import fsm._cocos.FSMASTFSMCoCo;
import fsm._symboltable.StateSymbol;

/**
 * Checks if the initial and final states exist.
 */
public class FSMReferencesExistingStatesCoCo implements FSMASTFSMCoCo {

	@Override
	public void check(ASTFSM node) {
		for (Optional<StateSymbol> finalStateSymbol : node.getFinalStatesSymbolList()) {
			if (!finalStateSymbol.isPresent() || !finalStateSymbol.get().isPresentAstNode()) {
				Log.error("The FSM references an undefined final state");
				return;
			}
		}
		
		if (!node.getInitialStateSymbol().isPresentAstNode()) Log.error("The FSM references an undefined initial state");
	}

}
