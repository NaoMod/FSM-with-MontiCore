/* generated from model FSM */
/* generated by template core.Interface*/

/* (c) https://github.com/MontiCore/monticore */
package fsm._cocos;

/* generated by template core.Imports*/

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;
import de.se_rwth.commons.logging.Log;
import de.monticore.ast.ASTNode;
import de.monticore.ast.Comment;
import de.se_rwth.commons.SourcePosition;
import de.monticore.symboltable.*;


 public  interface FSMASTFSMNodeCoCo extends fsm._visitor.FSMVisitor2  { 


  /* generated by template core.Method*/
 abstract  public  void check (fsm._ast.ASTFSMNode node)

;
  default /* generated by template core.Method*/
 public  void visit (fsm._ast.ASTFSMNode node)

 {
      check(node);
}

}
