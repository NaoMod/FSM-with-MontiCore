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


 public  class StateSymbolSurrogate extends fsm._symboltable.StateSymbol  {

    /* generated by template core.Attribute*/
 protected  Optional<fsm._symboltable.StateSymbol> delegate = Optional.empty();


    /* generated by template core.Constructor*/
 public  StateSymbolSurrogate(String name)
 {
  /* generated by template _symboltable.symbolsurrogate.ConstructorSymbolSurrogate*/
  super(name);
  this.name = name;
}


    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  void setName (String name)

 {
      /* generated by template _symboltable.symbolsurrogate.Set4SymbolSurrogate*/

  /* generated by template methods.Set*/

this.name = name;

  if(delegate.isPresent()){
    lazyLoadDelegate().setName(name);
  }

}

    /* generated by template core.Method*/
 public  String getFullName ()

 {
      /* generated by template _symboltable.symbolsurrogate.GetFullName*/
  if(!de.se_rwth.commons.Names.getQualifier(name).isEmpty()){
    fullName = name;
  }
    if (fullName == null) {
    fullName = determineFullName();
  }
  return fullName;
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (fsm._symboltable.IFSMScope enclosingScope)

 {
      /* generated by template _symboltable.symbolsurrogate.SetEnclosingScope4SymbolSurrogate*/

  /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

  if(delegate.isPresent()){
    lazyLoadDelegate().setEnclosingScope((IFSMScope) enclosingScope);
  }

}

    /* generated by template core.Method*/
 public  fsm._symboltable.IFSMScope getEnclosingScope ()

 {
      /* generated by template _symboltable.symbolsurrogate.GetEnclosingScopeSymbolSurrogate*/

  if(delegate.isPresent()){
    return lazyLoadDelegate().getEnclosingScope();
  }
  return (IFSMScope) enclosingScope;
}

    /* generated by template core.Method*/
 public  boolean checkLazyLoadDelegate ()

 {
      /* generated by template _symboltable.symbolsurrogate.CheckLazyLoadDelegate*/

  if(!delegate.isPresent()){
    Log.debug("Load full information of '" + name + "' (Kind " + "fsm._symboltable.StateSymbol" + ").", StateSymbolSurrogate.class.getSimpleName());
    if(!(this.enclosingScope instanceof fsm._symboltable.IFSMScope)){
      Log.error("0xA4071x14571 The enclosingScope needs to be a subtype of fsm._symboltable.IFSMScope.");
    }
    Optional<fsm._symboltable.StateSymbol> resolvedSymbol = ((fsm._symboltable.IFSMScope) enclosingScope).resolveState(name);

    if (resolvedSymbol.isPresent()) {
      Log.debug("Loaded full information of '" + name + "' successfully.",
      StateSymbolSurrogate.class.getSimpleName());
      delegate = Optional.of(resolvedSymbol.get());
    }
  }
  return delegate.isPresent();

}

    /* generated by template core.Method*/
 public  fsm._symboltable.StateSymbol lazyLoadDelegate ()

 {
      /* generated by template _symboltable.symbolsurrogate.LazyLoadDelegate*/

  if(!delegate.isPresent()){
    com.google.common.base.Preconditions.checkArgument(!com.google.common.base.Strings.isNullOrEmpty(name), " 0xA4070x85705 Symbol name may not be null or empty.");

    Log.debug("Load full information of '" + name + "' (Kind " + "fsm._symboltable.StateSymbol" + ").", StateSymbolSurrogate.class.getSimpleName());
    if(!(this.enclosingScope instanceof fsm._symboltable.IFSMScope)){
      Log.error("0xA4070x84743 The enclosingScope needs to be a subtype of fsm._symboltable.IFSMScope.");
    }
    Optional<fsm._symboltable.StateSymbol> resolvedSymbol = ((fsm._symboltable.IFSMScope) enclosingScope).resolveState(name);

    if (resolvedSymbol.isPresent()) {
      Log.debug("Loaded full information of '" + name + "' successfully.",
      StateSymbolSurrogate.class.getSimpleName());
      delegate = Optional.of(resolvedSymbol.get());
      return delegate.get();
    } else {
      Log.error("0xA1038 " + StateSymbolSurrogate.class.getSimpleName() + " Could not load full information of '" +
        name + "' (Kind " + "fsm._symboltable.StateSymbol" + ").");
      return this;
    }
  }else{
    return delegate.get();
  }
}

}
