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


 public  class StateSymbolBuilder  {

    /* generated by template core.Attribute*/
 protected  StateSymbolBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  String fullName ;

    /* generated by template core.Attribute*/
 protected  String packageName ;

    /* generated by template core.Attribute*/
 protected  Optional<fsm._ast.ASTState> astNode = Optional.empty();

    /* generated by template core.Attribute*/
 protected  de.monticore.symboltable.modifiers.AccessModifier accessModifier ;

    /* generated by template core.Attribute*/
 protected  fsm._symboltable.IFSMScope enclosingScope ;


    /* generated by template core.Constructor*/
 public  StateSymbolBuilder()
 {
  this.realBuilder = (StateSymbolBuilder) this;
}


    /* generated by template core.Method*/
 public  StateSymbol build ()

 {
      /* generated by template _symboltable.symbol.BuildSymbol*/

StateSymbol symbol = new StateSymbol(name);
  symbol.setName(this.name);
  symbol.setFullName(this.fullName);
  symbol.setPackageName(this.packageName);
  if (this.astNode.isPresent()) {
    symbol.setAstNode(this.astNode.get());
  } else {
    symbol.setAstNodeAbsent();
  }
  symbol.setAccessModifier(this.accessModifier);
  symbol.setEnclosingScope(this.enclosingScope);
  symbol.setName(this.name);
  symbol.setFullName(this.fullName);
  symbol.setPackageName(this.packageName);
  if (this.astNode.isPresent()) {
    symbol.setAstNode(this.astNode.get());
  } else {
    symbol.setAstNodeAbsent();
  }
  symbol.setAccessModifier(this.accessModifier);
  symbol.setEnclosingScope(this.enclosingScope);
return symbol;

}

    /* generated by template core.Method*/
 public  boolean isValid ()

 {
      /* generated by template _ast.builder.IsValidMethod*/

        if (name == null) {
            return false;
        }
        if (fullName == null) {
            return false;
        }
        if (packageName == null) {
            return false;
        }
        if (accessModifier == null) {
            return false;
        }
        if (enclosingScope == null) {
            return false;
        }
        return true;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  String getFullName ()

 {
      /* generated by template methods.Get*/

return this.fullName;

}

    /* generated by template core.Method*/
 public  String getPackageName ()

 {
      /* generated by template methods.Get*/

return this.packageName;

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTState getAstNode ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentAstNode()) {
        return this.astNode.get();
    }
    Log.error("0xA7003x69650 get for AstNode can't return a value. Attribute is empty.");
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
 public  de.monticore.symboltable.modifiers.AccessModifier getAccessModifier ()

 {
      /* generated by template methods.Get*/

return this.accessModifier;

}

    /* generated by template core.Method*/
 public  fsm._symboltable.IFSMScope getEnclosingScope ()

 {
      /* generated by template methods.Get*/

return this.enclosingScope;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setName (String name)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setFullName (String fullName)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.fullName = fullName;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setPackageName (String packageName)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.packageName = packageName;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setAstNode (fsm._ast.ASTState astNode)

 {
      /* generated by template _ast.builder.opt.Set4ASTBuilderOpt*/

    this.astNode = Optional.ofNullable(astNode);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setAstNodeAbsent ()

 {
      /* generated by template _ast.builder.opt.SetAbsent4ASTBuilderOpt*/

    this.astNode = Optional.empty();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setAccessModifier (de.monticore.symboltable.modifiers.AccessModifier accessModifier)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.accessModifier = accessModifier;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  StateSymbolBuilder setEnclosingScope (fsm._symboltable.IFSMScope enclosingScope)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.enclosingScope = enclosingScope;
    return this.realBuilder;

}

}
