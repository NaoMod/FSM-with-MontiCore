/* generated from model FSM */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package fsm;

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


 public  class FSMMill  {

    /* generated by template core.Attribute*/
 protected  static  FSMMill mill ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millASTFSMBuilder ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millASTStateBuilder ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millASTTransitionBuilder ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMTraverserImplementation ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMInheritanceHandler ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millStateSymbolBuilder ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMScope ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millStateSymbolSurrogateBuilder ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMScopesGenitorDelegator ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMArtifactScope ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMGlobalScope ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMScopesGenitor ;

    /* generated by template core.Attribute*/
 protected  fsm._symboltable.IFSMGlobalScope fSMGlobalScope ;

    /* generated by template core.Attribute*/
 protected  static  FSMMill millFSMParser ;


    /* generated by template core.Constructor*/
 protected  FSMMill()
 {
  /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 protected  static  FSMMill getMill ()

 {
      /* generated by template mill.GetMillMethod*/

  if (mill == null) {
    mill = new FSMMill();
  }
  return mill;
}

    /* generated by template core.Method*/
 public  static  void init ()

 {
      /* generated by template mill.InitMethod*/

    mill = new FSMMill();
    de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.initMe(new fsm._auxiliary.MCCommonLiteralsMillForFSM());
    de.monticore.mcbasics.MCBasicsMill.initMe(new fsm._auxiliary.MCBasicsMillForFSM());
    de.monticore.literals.mcliteralsbasis.MCLiteralsBasisMill.initMe(new fsm._auxiliary.MCLiteralsBasisMillForFSM());

}

    /* generated by template core.Method*/
 public  static  fsm._ast.ASTFSMBuilder fSMBuilder ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millASTFSMBuilder == null) {
    millASTFSMBuilder = getMill();
  }
  return millASTFSMBuilder._fSMBuilder();

}

    /* generated by template core.Method*/
 protected  fsm._ast.ASTFSMBuilder _fSMBuilder ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._ast.ASTFSMBuilder();
}

    /* generated by template core.Method*/
 public  static  fsm._ast.ASTStateBuilder stateBuilder ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millASTStateBuilder == null) {
    millASTStateBuilder = getMill();
  }
  return millASTStateBuilder._stateBuilder();

}

    /* generated by template core.Method*/
 protected  fsm._ast.ASTStateBuilder _stateBuilder ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._ast.ASTStateBuilder();
}

    /* generated by template core.Method*/
 public  static  fsm._ast.ASTTransitionBuilder transitionBuilder ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millASTTransitionBuilder == null) {
    millASTTransitionBuilder = getMill();
  }
  return millASTTransitionBuilder._transitionBuilder();

}

    /* generated by template core.Method*/
 protected  fsm._ast.ASTTransitionBuilder _transitionBuilder ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._ast.ASTTransitionBuilder();
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.StateSymbolBuilder stateSymbolBuilder ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millStateSymbolBuilder == null) {
    millStateSymbolBuilder = getMill();
  }
  return millStateSymbolBuilder._stateSymbolBuilder();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.StateSymbolBuilder _stateSymbolBuilder ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.StateSymbolBuilder();
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.StateSymbolSurrogateBuilder stateSymbolSurrogateBuilder ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millStateSymbolSurrogateBuilder == null) {
    millStateSymbolSurrogateBuilder = getMill();
  }
  return millStateSymbolSurrogateBuilder._stateSymbolSurrogateBuilder();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.StateSymbolSurrogateBuilder _stateSymbolSurrogateBuilder ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.StateSymbolSurrogateBuilder();
}

    /* generated by template core.Method*/
 public  static  fsm._visitor.FSMTraverser traverser ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMTraverserImplementation == null) {
    millFSMTraverserImplementation = getMill();
  }
  return millFSMTraverserImplementation._traverser();

}

    /* generated by template core.Method*/
 protected  fsm._visitor.FSMTraverser _traverser ()

 {
      return new fsm._visitor.FSMTraverserImplementation();
}

    /* generated by template core.Method*/
 public  static  fsm._visitor.FSMTraverser inheritanceTraverser ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMInheritanceHandler == null) {
    millFSMInheritanceHandler = getMill();
  }
  return millFSMInheritanceHandler._inheritanceTraverser();

}

    /* generated by template core.Method*/
 protected  fsm._visitor.FSMTraverser _inheritanceTraverser ()

 {
      /* generated by template mill.InheritanceHandlerMethod*/

  fsm._visitor.FSMTraverserImplementation traverser = new fsm._visitor.FSMTraverserImplementation();
  traverser.setFSMHandler(new fsm._visitor.FSMInheritanceHandler());
  traverser.setMCCommonLiteralsHandler(new de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsInheritanceHandler());
  traverser.setMCBasicsHandler(new de.monticore.mcbasics._visitor.MCBasicsInheritanceHandler());
  traverser.setMCLiteralsBasisHandler(new de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisInheritanceHandler());
  return traverser;
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.IFSMGlobalScope globalScope ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMGlobalScope == null) {
    millFSMGlobalScope = getMill();
  }
  return millFSMGlobalScope._globalScope();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMGlobalScope _globalScope ()

 {
      /* generated by template mill.ProtectedGlobalScopeMethod*/

  if(null == fSMGlobalScope){
    fSMGlobalScope = new fsm._symboltable.FSMGlobalScope();
  }
  return fSMGlobalScope;

}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.IFSMArtifactScope artifactScope ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMArtifactScope == null) {
    millFSMArtifactScope = getMill();
  }
  return millFSMArtifactScope._artifactScope();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMArtifactScope _artifactScope ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.FSMArtifactScope();
}

    /* generated by template core.Method*/
 public  static  fsm._parser.FSMParser parser ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMParser == null) {
    millFSMParser = getMill();
  }
  return millFSMParser._parser();

}

    /* generated by template core.Method*/
 protected  fsm._parser.FSMParser _parser ()

 {
      /* generated by template mill.ProtectedParserMethod*/

  return new fsm._parser.FSMParser();
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.IFSMScope scope ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMScope == null) {
    millFSMScope = getMill();
  }
  return millFSMScope._scope();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.IFSMScope _scope ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.FSMScope();
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.FSMScopesGenitor scopesGenitor ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMScopesGenitor == null) {
    millFSMScopesGenitor = getMill();
  }
  return millFSMScopesGenitor._scopesGenitor();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.FSMScopesGenitor _scopesGenitor ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.FSMScopesGenitor();
}

    /* generated by template core.Method*/
 public  static  fsm._symboltable.FSMScopesGenitorDelegator scopesGenitorDelegator ()

 {
      /* generated by template mill.BuilderMethod*/

  if (millFSMScopesGenitorDelegator == null) {
    millFSMScopesGenitorDelegator = getMill();
  }
  return millFSMScopesGenitorDelegator._scopesGenitorDelegator();

}

    /* generated by template core.Method*/
 protected  fsm._symboltable.FSMScopesGenitorDelegator _scopesGenitorDelegator ()

 {
      /* generated by template mill.ProtectedBuilderMethod*/

  return new fsm._symboltable.FSMScopesGenitorDelegator();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNullLiteralBuilder nullLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.nullLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteralBuilder booleanLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.booleanLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTCharLiteralBuilder charLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.charLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTStringLiteralBuilder stringLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.stringLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTNatLiteralBuilder natLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.natLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteralBuilder signedNatLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedNatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteralBuilder basicLongLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicLongLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteralBuilder signedBasicLongLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicLongLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteralBuilder basicFloatLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicFloatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteralBuilder signedBasicFloatLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicFloatLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteralBuilder basicDoubleLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.basicDoubleLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteralBuilder signedBasicDoubleLiteralBuilder ()

 {
      /* generated by template mill.BuilderDelegatorMethod*/

  return de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.signedBasicDoubleLiteralBuilder();
}

    /* generated by template core.Method*/
 public  static  void initMe (FSMMill a)

 {
      /* generated by template mill.InitMeMethod*/

    mill = a;
    millASTFSMBuilder = a;
    millASTStateBuilder = a;
    millASTTransitionBuilder = a;
    millFSMTraverserImplementation = a;
    millFSMInheritanceHandler = a;
    millStateSymbolBuilder = a;
    millFSMScope = a;
    millStateSymbolSurrogateBuilder = a;
    millFSMScopesGenitorDelegator = a;
    millFSMArtifactScope = a;
    millFSMGlobalScope = a;
    millFSMScopesGenitor = a;
    millFSMParser = a;

}

    /* generated by template core.Method*/
 public  static  void reset ()

 {
      /* generated by template mill.ResetMethod*/

    mill = null;
    millASTFSMBuilder = null;
    millASTStateBuilder = null;
    millASTTransitionBuilder = null;
    millFSMTraverserImplementation = null;
    millFSMInheritanceHandler = null;
    millStateSymbolBuilder = null;
    millFSMScope = null;
    millStateSymbolSurrogateBuilder = null;
    millFSMScopesGenitorDelegator = null;
    millFSMArtifactScope = null;
    millFSMGlobalScope = null;
    millFSMScopesGenitor = null;
    millFSMParser = null;
    de.monticore.literals.mccommonliterals.MCCommonLiteralsMill.reset();
    de.monticore.mcbasics.MCBasicsMill.reset();
    de.monticore.literals.mcliteralsbasis.MCLiteralsBasisMill.reset();

}

}
