/* generated from model FSM */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package fsm._ast;

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


 public  class ASTState extends ASTCNode  implements fsm._ast.ASTFSMNode {

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  java.util.List<fsm._ast.ASTTransition> transitions = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  Optional<fsm._symboltable.StateSymbol> symbol = Optional.empty();

    /* generated by template core.Attribute*/
 protected  fsm._symboltable.IFSMScope enclosingScope ;


    /* generated by template core.Constructor*/
 protected  ASTState()
 {
  /* generated by template core.EmptyBody*/
// empty body

}


    /* generated by template core.Method*/
 public  boolean deepEquals (Object o)

 {
           return deepEquals(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEquals (Object o,boolean forceSameOrder)

 {
      /* generated by template data.DeepEqualsWithOrder*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing transitions
    if (this.transitions.size() != comp.transitions.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<fsm._ast.ASTTransition> it1 = this.transitions.iterator();
        Iterator<fsm._ast.ASTTransition> it2 = comp.transitions.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEquals(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<fsm._ast.ASTTransition> it1 = this.transitions.iterator();
        while (it1.hasNext()) {
          fsm._ast.ASTTransition oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<fsm._ast.ASTTransition> it2 = comp.transitions.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEquals(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     


}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o)

 {
           return deepEqualsWithComments(o, true);
}

    /* generated by template core.Method*/
 public  boolean deepEqualsWithComments (Object o,boolean forceSameOrder)

 {
      /* generated by template data.DeepEqualsWithComments*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
    if (!equalsWithComments(comp)) {
      return false;
    }
    // comparing transitions
    if (this.transitions.size() != comp.transitions.size()) {
      return false;
    } else {
      if (forceSameOrder) {
        Iterator<fsm._ast.ASTTransition> it1 = this.transitions.iterator();
        Iterator<fsm._ast.ASTTransition> it2 = comp.transitions.iterator();
        while (it1.hasNext() && it2.hasNext()) {
          if (!it1.next().deepEqualsWithComments(it2.next(), forceSameOrder)) {
            return false;
          }
        }
      } else {
        java.util.Iterator<fsm._ast.ASTTransition> it1 = this.transitions.iterator();
        while (it1.hasNext()) {
          fsm._ast.ASTTransition oneNext = it1.next();
          boolean matchFound = false;
          java.util.Iterator<fsm._ast.ASTTransition> it2 = comp.transitions.iterator();
          while (it2.hasNext()) {
            if (oneNext.deepEqualsWithComments(it2.next(), forceSameOrder)) {
              matchFound = true;
              break;
            }
          }
          if (!matchFound) {
            return false;
          }
        }
      }
    }
    return true;     

}

    /* generated by template core.Method*/
 public  boolean equalAttributes (Object o)

 {
      /* generated by template data.EqualAttributes*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
	// comparing name 
    if ( (this.name == null && comp.name != null) 
      || (this.name != null && !this.name.equals(comp.name)) ) {
      return false;
    }
    return true;


}

    /* generated by template core.Method*/
 public  boolean equalsWithComments (Object o)

 {
      /* generated by template data.EqualsWithComments*/

      ASTState comp;
    if ((o instanceof ASTState)) {
      comp = (ASTState) o;
    } else {
      return false;
    }
    if (!equalAttributes(comp)) {
      return false;
    }
    // comparing comments
    if (get_PreCommentList().size() == comp.get_PreCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PreCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PreCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    
    if (get_PostCommentList().size() == comp.get_PostCommentList().size()) {
      java.util.Iterator<de.monticore.ast.Comment> one = get_PostCommentList().iterator();
      java.util.Iterator<de.monticore.ast.Comment> two = comp.get_PostCommentList().iterator();
      while (one.hasNext()) {
        if (!one.next().equals(two.next())) {
          return false;
        }
      }
    } else {
      return false;
    }
    return true;

}

    /* generated by template core.Method*/
 public  ASTState deepClone ()

 {
          return deepClone(_construct());
}

    /* generated by template core.Method*/
 public  ASTState deepClone (ASTState result)

 {
      /* generated by template data.DeepCloneWithParameters*/

    super.deepClone(result);

      result.setName(getName());
      getTransitionList().forEach(s -> result.transitions.add(s.deepClone()));
    
    return result;

}

    /* generated by template core.Method*/
 public  String getName ()

 {
      /* generated by template methods.Get*/

return this.name;

}

    /* generated by template core.Method*/
 public  boolean containsTransition (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllTransitions (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<fsm._ast.ASTTransition> iteratorTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().size();

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTTransition[] toArrayTransitions (fsm._ast.ASTTransition[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<fsm._ast.ASTTransition> spliteratorTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<fsm._ast.ASTTransition> streamTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().stream();

}

    /* generated by template core.Method*/
 public  Stream<fsm._ast.ASTTransition> parallelStreamTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().parallelStream();

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTTransition getTransition (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfTransition (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfTransition (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsTransitions (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<fsm._ast.ASTTransition> listIteratorTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<fsm._ast.ASTTransition> listIteratorTransitions (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<fsm._ast.ASTTransition> subListTransitions (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<fsm._ast.ASTTransition> getTransitionList ()

 {
      /* generated by template methods.Get*/

return this.transitions;

}

    /* generated by template core.Method*/
 public  void setName (String name)

 {
      /* generated by template methods.Set*/

this.name = name;

}

    /* generated by template core.Method*/
 public  void clearTransitions ()

 {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().clear();

}

    /* generated by template core.Method*/
 public  boolean addTransition (fsm._ast.ASTTransition element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().add(element);

}

    /* generated by template core.Method*/
 public  boolean addAllTransitions (Collection<? extends fsm._ast.ASTTransition> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().addAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeTransition (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().remove(element);

}

    /* generated by template core.Method*/
 public  boolean removeAllTransitions (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().removeAll(collection);

}

    /* generated by template core.Method*/
 public  boolean retainAllTransitions (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().retainAll(collection);

}

    /* generated by template core.Method*/
 public  boolean removeIfTransition (Predicate<? super fsm._ast.ASTTransition> filter)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().removeIf(filter);

}

    /* generated by template core.Method*/
 public  void forEachTransitions (Consumer<? super fsm._ast.ASTTransition> action)

 {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().forEach(action);

}

    /* generated by template core.Method*/
 public  void addTransition (int index,fsm._ast.ASTTransition element)

 {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().add(index, element);

}

    /* generated by template core.Method*/
 public  boolean addAllTransitions (int index,Collection<? extends fsm._ast.ASTTransition> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().addAll(index, collection);

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTTransition removeTransition (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().remove(index);

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTTransition setTransition (int index,fsm._ast.ASTTransition element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getTransitionList().set(index, element);

}

    /* generated by template core.Method*/
 public  void replaceAllTransitions (UnaryOperator<fsm._ast.ASTTransition> operator)

 {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().replaceAll(operator);

}

    /* generated by template core.Method*/
 public  void sortTransitions (Comparator<? super fsm._ast.ASTTransition> comparator)

 {
      /* generated by template methods.MethodDelegate*/

this.getTransitionList().sort(comparator);

}

    /* generated by template core.Method*/
 public  void setTransitionList (List<fsm._ast.ASTTransition> transitions)

 {
      /* generated by template methods.Set*/

this.transitions = transitions;

}

    /* generated by template core.Method*/
 public  void accept (fsm._visitor.FSMTraverser visitor)

 {
      /* generated by template _ast.ast_class.Accept*/

      visitor.handle(this);

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x17985 AST node type ASTState expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.literals.mccommonliterals._visitor.MCCommonLiteralsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.mcbasics._visitor.MCBasicsTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x18172 AST node type ASTState expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.mcbasics._visitor.MCBasicsTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x93707 AST node type ASTState expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.literals.mcliteralsbasis._visitor.MCLiteralsBasisTraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 public  void accept (de.monticore.visitor.ITraverser visitor)

 {
      /* generated by template _ast.ast_class.AcceptSuper*/

  if (visitor instanceof fsm._visitor.FSMTraverser) {
    accept((fsm._visitor.FSMTraverser) visitor);
  } else {
    de.se_rwth.commons.logging.Log.error("0xA7000x98035 AST node type ASTState expected a visitor of type fsm._visitor.FSMTraverser, but got de.monticore.visitor.ITraverser. Visitors of a super language may not be used on ASTs containing nodes of the sub language. Use a visitor of the sub language.");
  }

}

    /* generated by template core.Method*/
 protected  ASTState _construct ()

 {
      return fsm.FSMMill.stateBuilder().uncheckedBuild();
}

    /* generated by template core.Method*/
 public  fsm._symboltable.StateSymbol getSymbol ()

 {
      /* generated by template methods.opt.Get4Opt*/

    if (isPresentSymbol()) {
        return this.symbol.get();
    }
    Log.error("0xA7003x94295 get for Symbol can't return a value. Attribute is empty.");
    // Normally this statement is not reachable
    throw new IllegalStateException();

}

    /* generated by template core.Method*/
 public  boolean isPresentSymbol ()

 {
      /* generated by template methods.opt.IsPresent4Opt*/

return this.symbol.isPresent();

}

    /* generated by template core.Method*/
 public  void setSymbol (fsm._symboltable.StateSymbol symbol)

 {
      /* generated by template methods.opt.Set4Opt*/

this.symbol = Optional.ofNullable(symbol);

}

    /* generated by template core.Method*/
 public  void setSymbolAbsent ()

 {
      /* generated by template methods.opt.SetAbsent*/

this.symbol = Optional.empty();

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
      /* generated by template methods.Set*/

this.enclosingScope = enclosingScope;

}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof fsm._symboltable.IFSMScope){
    this.enclosingScope = (fsm._symboltable.IFSMScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x23105 The EnclosingScope form type de.monticore.literals.mccommonliterals._symboltable.IMCCommonLiteralsScope could not be casted to the type fsm._symboltable.IFSMScope. Please call the Method setEnclosingScope with a parameter form type fsm._symboltable.IFSMScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.mcbasics._symboltable.IMCBasicsScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof fsm._symboltable.IFSMScope){
    this.enclosingScope = (fsm._symboltable.IFSMScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x23104 The EnclosingScope form type de.monticore.mcbasics._symboltable.IMCBasicsScope could not be casted to the type fsm._symboltable.IFSMScope. Please call the Method setEnclosingScope with a parameter form type fsm._symboltable.IFSMScope");
  }
}

    /* generated by template core.Method*/
 public  void setEnclosingScope (de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope enclosingScope)

 {
      /* generated by template _ast.ast_class.symboltable.InheritedSetEnclosingScope*/

  if (enclosingScope instanceof fsm._symboltable.IFSMScope){
    this.enclosingScope = (fsm._symboltable.IFSMScope) enclosingScope;
  }else {
    de.se_rwth.commons.logging.Log.error("0xA7005x23103 The EnclosingScope form type de.monticore.literals.mcliteralsbasis._symboltable.IMCLiteralsBasisScope could not be casted to the type fsm._symboltable.IFSMScope. Please call the Method setEnclosingScope with a parameter form type fsm._symboltable.IFSMScope");
  }
}
 
 public ASTTransition findOutgoingTransitionWithInput(String input) {
	 for (ASTTransition transition : getTransitionList()) {
		 if (input.equals(transition.getInput().getValue())) return transition;
	 }
	 
	 return null;
 }

}