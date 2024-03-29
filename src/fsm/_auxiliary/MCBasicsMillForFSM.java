/* generated from model FSM */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package fsm._auxiliary;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;
import de.monticore.ast.ASTCNode;


 public  class MCBasicsMillForFSM extends de.monticore.mcbasics.MCBasicsMill  {



    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMArtifactScope _artifactScope ()

 {
      /* generated by template mill.ProtectedMethodForSuper*/

  return fsm.FSMMill.artifactScope();
}

    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMGlobalScope _globalScope ()

 {
      /* generated by template mill.ProtectedMethodForSuper*/

  return fsm.FSMMill.globalScope();
}

    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMScope _scope ()

 {
      /* generated by template mill.ProtectedMethodForSuper*/

  return fsm.FSMMill.scope();
}

    /* generated by template core.Method*/
 protected  de.monticore.mcbasics._visitor.MCBasicsTraverser _traverser ()

 {
      /* generated by template mill.ProtectedMethodForSuper*/

  return fsm.FSMMill.traverser();
}

    /* generated by template core.Method*/
 protected  de.monticore.mcbasics._visitor.MCBasicsTraverser _inheritanceTraverser ()

 {
      /* generated by template mill.ProtectedMethodForSuper*/

  return fsm.FSMMill.inheritanceTraverser();
}

}
