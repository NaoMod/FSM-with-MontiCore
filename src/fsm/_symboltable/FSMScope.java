/* generated from model FSM */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package fsm._symboltable;

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


 public  class FSMScope  implements fsm._symboltable.IFSMScope {

    /* generated by template core.Attribute*/
 protected  com.google.common.collect.LinkedListMultimap<String,fsm._symboltable.StateSymbol> stateSymbols = com.google.common.collect.LinkedListMultimap.create();

    /* generated by template core.Attribute*/
 protected  boolean stateSymbolsAlreadyResolved = false;

    /* generated by template core.Attribute*/
 protected  fsm._symboltable.IFSMScope enclosingScope ;

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.symboltable.IScopeSpanningSymbol> spanningSymbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  boolean shadowing ;

    /* generated by template core.Attribute*/
 protected  boolean exportingSymbols = true;

    /* generated by template core.Attribute*/
 protected  boolean ordered ;

    /* generated by template core.Attribute*/
 protected  Optional<String> name = Optional.empty();

    /* generated by template core.Attribute*/
 protected  Optional<de.monticore.ast.ASTNode> astNode = Optional.empty();

    /* generated by template core.Attribute*/
 protected  List<fsm._symboltable.IFSMScope> subScopes = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 public  FSMScope()
 {
  super();
    this.name = Optional.empty();
}

    /* generated by template core.Constructor*/
 public  FSMScope(boolean shadowing)
 {
  this.shadowing = shadowing;
    this.name = Optional.empty();
}

    /* generated by template core.Constructor*/
 public  FSMScope(fsm._symboltable.IFSMScope enclosingScope)
 {
  this(enclosingScope, false);
}

    /* generated by template core.Constructor*/
 public  FSMScope(fsm._symboltable.IFSMScope enclosingScope,boolean shadowing)
 {
  this.setEnclosingScope(enclosingScope);
    this.shadowing = shadowing; 
    this.name = Optional.empty();
}


    /* generated by template core.Method*/
 public  void add (fsm._symboltable.StateSymbol symbol)

 {
      this.stateSymbols.put(symbol.getName(), symbol);
    symbol.setEnclosingScope(this);
}

    /* generated by template core.Method*/
 public  void remove (fsm._symboltable.StateSymbol symbol)

 {
      this.stateSymbols.remove(symbol.getName(), symbol);
}

    /* generated by template core.Method*/
 public  com.google.common.collect.LinkedListMultimap<String,fsm._symboltable.StateSymbol> getStateSymbols ()

 {
      return this.stateSymbols;
}

    /* generated by template core.Method*/
 public  boolean isStateSymbolsAlreadyResolved ()

 {
      /* generated by template methods.Get*/

return this.stateSymbolsAlreadyResolved;

}

    /* generated by template core.Method*/
 public  void setStateSymbolsAlreadyResolved (boolean stateSymbolsAlreadyResolved)

 {
      /* generated by template methods.Set*/

this.stateSymbolsAlreadyResolved = stateSymbolsAlreadyResolved;

}

    /* generated by template core.Method*/
 public  fsm._symboltable.IFSMScope getEnclosingScope ()

 {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (fsm._symboltable.IFSMScope enclosingScope)

 {
      /* generated by template _symboltable.scope.SetEnclosingScope*/
if (this.enclosingScope != null && enclosingScope != null) {
if (this.enclosingScope == enclosingScope) {
      return;
    }
    Log.warn("0xA1042 Scope \"" + getName() + "\" has already an enclosing scope.");
  }

  // remove this scope from current (old) enclosing scope, if exists.
if (this.enclosingScope != null) {
this.enclosingScope.removeSubScope(this);
  }

  // add this scope to new enclosing scope, if exists.
if (enclosingScope != null) {
enclosingScope.addSubScope(this);
  }

  // set new enclosing scope (or empty)
  this.enclosingScope = enclosingScope;
}

    /* generated by template core.Method*/
 public  de.monticore.symboltable.IScopeSpanningSymbol getSpanningSymbol ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentSpanningSymbol()) {
        return this.spanningSymbol.get();
    }
    Log.error("0xA7003x73188 get for SpanningSymbol can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSpanningSymbol ()

 {
      /* generated by template methods.opt.IsPresent4Opt*/

return this.spanningSymbol.isPresent();

}

    /* generated by template core.Method*/
 public  void setSpanningSymbol (de.monticore.symboltable.IScopeSpanningSymbol spanningSymbol)

 {
      /* generated by template _symboltable.scope.SetSpanningSymbol*/

  /* generated by template methods.opt.Set4Opt*/

this.spanningSymbol = Optional.ofNullable(spanningSymbol);

  setName(spanningSymbol.getName());
}

    /* generated by template core.Method*/
 public  void setSpanningSymbolAbsent ()

 {
      /* generated by template _symboltable.scope.SetSpanningSymbolAbsent*/

  /* generated by template methods.opt.SetAbsent*/

this.spanningSymbol = Optional.empty();

  setNameAbsent();
}

    /* generated by template core.Method*/
 public  boolean isShadowing ()

 {
      /* generated by template methods.Get*/

return this.shadowing;

}

    /* generated by template core.Method*/
 public  void setShadowing (boolean shadowing)

 {
      /* generated by template methods.Set*/

this.shadowing = shadowing;

}

    /* generated by template core.Method*/
 public  boolean isExportingSymbols ()

 {
      /* generated by template methods.Get*/

return this.exportingSymbols;

}

    /* generated by template core.Method*/
 public  void setExportingSymbols (boolean exportingSymbols)

 {
      /* generated by template methods.Set*/

this.exportingSymbols = exportingSymbols;

}

    /* generated by template core.Method*/
 public  boolean isOrdered ()

 {
      /* generated by template methods.Get*/

return this.ordered;

}

    /* generated by template core.Method*/
 public  void setOrdered (boolean ordered)

 {
      /* generated by template methods.Set*/

this.ordered = ordered;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentName()) {
        return this.name.get();
    }
    Log.error("0xA7003x70139 get for Name can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentName ()

 {
      /* generated by template methods.opt.IsPresent4Opt*/

return this.name.isPresent();

}

    /* generated by template core.Method*/
 public  void setName (String name)

 {
      /* generated by template methods.opt.Set4Opt*/

this.name = Optional.ofNullable(name);

}

    /* generated by template core.Method*/
 public  void setNameAbsent ()

 {
      /* generated by template methods.opt.SetAbsent*/

this.name = Optional.empty();

}

    /* generated by template core.Method*/
 public  de.monticore.ast.ASTNode getAstNode ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentAstNode()) {
        return this.astNode.get();
    }
    Log.error("0xA7003x38341 get for AstNode can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentAstNode ()

 {
      /* generated by template methods.opt.IsPresent4Opt*/

return this.astNode.isPresent();

}

    /* generated by template core.Method*/
 public  void setAstNode (de.monticore.ast.ASTNode astNode)

 {
      /* generated by template methods.opt.Set4Opt*/

this.astNode = Optional.ofNullable(astNode);

}

    /* generated by template core.Method*/
 public  void setAstNodeAbsent ()

 {
      /* generated by template methods.opt.SetAbsent*/

this.astNode = Optional.empty();

}

    /* generated by template core.Method*/
 public  void addSubScope (fsm._symboltable.IFSMScope subScope)

 {
      /* generated by template _symboltable.scope.AddSubScope*/
  if (!this.subScopes.contains(subScope)) {
    this.subScopes.add(subScope);
    subScope.setEnclosingScope(this);
  }
}

    /* generated by template core.Method*/
 public  void removeSubScope (fsm._symboltable.IFSMScope subScope)

 {
      /* generated by template _symboltable.scope.RemoveSubScope*/
  if (this.subScopes.contains(subScope)) {
    this.subScopes.remove(subScope);
    if (subScope.getEnclosingScope() != null && subScope.getEnclosingScope() == this) {
      subScope.setEnclosingScope(null);
    }
  }
}

    /* generated by template core.Method*/
 public  List<fsm._symboltable.IFSMScope> getSubScopes ()

 {
      /* generated by template _symboltable.scope.GetSubScopes*/
  return com.google.common.collect.ImmutableList.copyOf(subScopes);
}

    /* generated by template core.Method*/
 public  void setSubScopes (List<fsm._symboltable.IFSMScope> subScopes)

 {
      /* generated by template _symboltable.scope.SetSubScopes*/
  this.subScopes.forEach(this::removeSubScope);
  subScopes.forEach(this::addSubScope);
}

    /* generated by template core.Method*/
 public  void accept (fsm._visitor.FSMTraverser visitor)

 {
      visitor.handle(this);
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
      /* generated by template _symboltable.scope.AcceptScope*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7012x11049 Scope node type FSMScope expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser.");
  }
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
      /* generated by template _symboltable.scope.AcceptScope*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7012x54042 Scope node type FSMScope expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser.");
  }
}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
      /* generated by template _symboltable.scope.AcceptScope*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    throw new UnsupportedOperationException("0xA7012x66024 Scope node type FSMScope expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser.");
  }
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)

 {
      this.addSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope subScope)

 {
      this.removeSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope newEnclosingScope)

 {
      this.setEnclosingScope((fsm._symboltable.IFSMScope) newEnclosingScope);
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)

 {
      this.addSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.mcbasics._symboltable.IMCBasicsScope subScope)

 {
      this.removeSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope newEnclosingScope)

 {
      this.setEnclosingScope((fsm._symboltable.IFSMScope) newEnclosingScope);
}

    /* generated by template core.Method*/
 public  void addSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)

 {
      this.addSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void removeSubScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope subScope)

 {
      this.removeSubScope((fsm._symboltable.IFSMScope) subScope);
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope newEnclosingScope)

 {
      this.setEnclosingScope((fsm._symboltable.IFSMScope) newEnclosingScope);
}

    /* generated by template core.Method*/
 public  List<fsm._symboltable.StateSymbol> resolveStateSubKinds (boolean foundSymbols,String name,de.monticore.symboltable.modifiers.AccessModifier modifier,java.util.function.Predicate<fsm._symboltable.StateSymbol> predicate)

 {
      /* generated by template _symboltable.scope.ResolveSubKinds*/

  List<fsm._symboltable.StateSymbol> res = new ArrayList<>();
  return res;
}

}