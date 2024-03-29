/* generated from model FSM */
/* generated by template core.Class*/

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
import de.monticore.ast.ASTCNode;


 public  class FSMCoCoChecker  {

    /* generated by template core.Attribute*/
 protected  fsm._visitor.FSMTraverser traverser ;


    /* generated by template core.Constructor*/
 public  FSMCoCoChecker()
 {
  /* generated by template _cocos.CoCoCheckerConstructor*/

  traverser = fsm.FSMMill.inheritanceTraverser();
}


    /* generated by template core.Method*/
 public  fsm._visitor.FSMTraverser getTraverser ()

 {
      /* generated by template methods.Get*/

return this.traverser;

}

    /* generated by template core.Method*/
 public  void setTraverser (fsm._visitor.FSMTraverser traverser)

 {
      /* generated by template methods.Set*/

this.traverser = traverser;

}

    /* generated by template core.Method*/
 public  void addChecker (fsm._cocos.FSMCoCoChecker checker)

 {
      /* generated by template _cocos.AddChecker*/


  checker.getTraverser().getFSMVisitorList().forEach(s -> traverser.add4FSM(s));
  checker.getTraverser().getMCCommonLiteralsVisitorList().forEach(s -> traverser.add4MCCommonLiterals(s));
  checker.getTraverser().getMCBasicsVisitorList().forEach(s -> traverser.add4MCBasics(s));
  checker.getTraverser().getMCLiteralsBasisVisitorList().forEach(s -> traverser.add4MCLiteralsBasis(s));

}

    /* generated by template core.Method*/
 public  void checkAll (fsm._ast.ASTFSMNode node)

 {
      node.accept(getTraverser());
}

    /* generated by template core.Method*/
 public  void addCoCo (fsm._cocos.FSMASTFSMCoCo coco)

 {
      traverser.add4FSM(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (fsm._cocos.FSMASTStateCoCo coco)

 {
      traverser.add4FSM(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (fsm._cocos.FSMASTTransitionCoCo coco)

 {
      traverser.add4FSM(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (fsm._cocos.FSMASTFSMNodeCoCo coco)

 {
      traverser.add4FSM(coco);
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsCoCoChecker checker)

 {
      /* generated by template _cocos.AddChecker*/


  checker.getTraverser().getMCCommonLiteralsVisitorList().forEach(s -> traverser.add4MCCommonLiterals(s));
  checker.getTraverser().getMCBasicsVisitorList().forEach(s -> traverser.add4MCBasics(s));
  checker.getTraverser().getMCLiteralsBasisVisitorList().forEach(s -> traverser.add4MCLiteralsBasis(s));

}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.literals.mccommonliterals._ast.ASTMCCommonLiteralsNode node)

 {
      node.accept(getTraverser());
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNullLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBooleanLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTCharLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTStringLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNatLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedNatLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicLongLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicLongLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicFloatLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicFloatLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTBasicDoubleLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedBasicDoubleLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTNumericLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTSignedNumericLiteralCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mccommonliterals._cocos.MCCommonLiteralsASTMCCommonLiteralsNodeCoCo coco)

 {
      traverser.add4MCCommonLiterals(coco);
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.mcbasics._cocos.MCBasicsCoCoChecker checker)

 {
      /* generated by template _cocos.AddChecker*/


  checker.getTraverser().getMCBasicsVisitorList().forEach(s -> traverser.add4MCBasics(s));

}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.mcbasics._ast.ASTMCBasicsNode node)

 {
      node.accept(getTraverser());
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.mcbasics._cocos.MCBasicsASTMCBasicsNodeCoCo coco)

 {
      traverser.add4MCBasics(coco);
}

    /* generated by template core.Method*/
 public  void addChecker (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisCoCoChecker checker)

 {
      /* generated by template _cocos.AddChecker*/


  checker.getTraverser().getMCLiteralsBasisVisitorList().forEach(s -> traverser.add4MCLiteralsBasis(s));

}

    /* generated by template core.Method*/
 public  void checkAll (de.monticore.literals.mcliteralsbasis._ast.ASTMCLiteralsBasisNode node)

 {
      node.accept(getTraverser());
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisASTLiteralCoCo coco)

 {
      traverser.add4MCLiteralsBasis(coco);
}

    /* generated by template core.Method*/
 public  void addCoCo (de.monticore.literals.mcliteralsbasis._cocos.MCLiteralsBasisASTMCLiteralsBasisNodeCoCo coco)

 {
      traverser.add4MCLiteralsBasis(coco);
}

}
