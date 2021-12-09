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


 public  class ASTFSMBuilder extends de.monticore.ast.ASTNodeBuilder<ASTFSMBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTFSMBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  java.util.List<fsm._ast.ASTState> states = new java.util.ArrayList<>();

    /* generated by template core.Attribute*/
 protected  String initialState ;

    /* generated by template core.Attribute*/
 protected  java.util.List<String> finalStates = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 public  ASTFSMBuilder()
 {
  this.realBuilder = (ASTFSMBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTFSM build ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA4522 name of type String must not be null");
            }
            if (initialState == null) {
                Log.error("0xA4522 initialState of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTFSM value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTFSM();
    value.setName(this.name);
    value.setStateList(this.states);
    value.setInitialState(this.initialState);
    value.setFinalStatesList(this.finalStates);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

    /* generated by template core.Method*/
 public  boolean isValid ()

 {
      /* generated by template _ast.builder.IsValidMethod*/

        if (name == null) {
            return false;
        }
        if (initialState == null) {
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
 public  boolean containsState (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllStates (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<fsm._ast.ASTState> iteratorStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().size();

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTState[] toArrayStates (fsm._ast.ASTState[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<fsm._ast.ASTState> spliteratorStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<fsm._ast.ASTState> streamStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().stream();

}

    /* generated by template core.Method*/
 public  Stream<fsm._ast.ASTState> parallelStreamStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().parallelStream();

}

    /* generated by template core.Method*/
 public  fsm._ast.ASTState getState (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfState (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfState (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsStates (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<fsm._ast.ASTState> listIteratorStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<fsm._ast.ASTState> listIteratorStates (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<fsm._ast.ASTState> subListStates (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getStateList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<fsm._ast.ASTState> getStateList ()

 {
      /* generated by template methods.Get*/

return this.states;

}

    /* generated by template core.Method*/
 public  String getInitialState ()

 {
      /* generated by template methods.Get*/

return this.initialState;

}

    /* generated by template core.Method*/
 public  boolean containsFinalStates (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().contains(element);

}

    /* generated by template core.Method*/
 public  boolean containsAllFinalStates (Collection<?> collection)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().containsAll(collection);

}

    /* generated by template core.Method*/
 public  boolean isEmptyFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().isEmpty();

}

    /* generated by template core.Method*/
 public  Iterator<String> iteratorFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().iterator();

}

    /* generated by template core.Method*/
 public  int sizeFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().size();

}

    /* generated by template core.Method*/
 public  String[] toArrayFinalStates (String[] array)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().toArray(array);

}

    /* generated by template core.Method*/
 public  Object[] toArrayFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().toArray();

}

    /* generated by template core.Method*/
 public  Spliterator<String> spliteratorFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().spliterator();

}

    /* generated by template core.Method*/
 public  Stream<String> streamFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().stream();

}

    /* generated by template core.Method*/
 public  Stream<String> parallelStreamFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().parallelStream();

}

    /* generated by template core.Method*/
 public  String getFinalStates (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().get(index);

}

    /* generated by template core.Method*/
 public  int indexOfFinalStates (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().indexOf(element);

}

    /* generated by template core.Method*/
 public  int lastIndexOfFinalStates (Object element)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().lastIndexOf(element);

}

    /* generated by template core.Method*/
 public  boolean equalsFinalStates (Object o)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().equals(o);

}

    /* generated by template core.Method*/
 public  int hashCodeFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().hashCode();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorFinalStates ()

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().listIterator();

}

    /* generated by template core.Method*/
 public  ListIterator<String> listIteratorFinalStates (int index)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().listIterator(index);

}

    /* generated by template core.Method*/
 public  List<String> subListFinalStates (int start,int end)

 {
      /* generated by template methods.MethodDelegate*/

return this.getFinalStatesList().subList(start, end);

}

    /* generated by template core.Method*/
 public  List<String> getFinalStatesList ()

 {
      /* generated by template methods.Get*/

return this.finalStates;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setName (String name)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder clearStates ()

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addState (fsm._ast.ASTState element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAllStates (Collection<? extends fsm._ast.ASTState> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeState (Object element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeAllStates (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder retainAllStates (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeIfState (Predicate<? super fsm._ast.ASTState> filter)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder forEachStates (Consumer<? super fsm._ast.ASTState> action)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addState (int index,fsm._ast.ASTState element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAllStates (int index,Collection<? extends fsm._ast.ASTState> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeState (int index)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setState (int index,fsm._ast.ASTState element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder replaceAllStates (UnaryOperator<fsm._ast.ASTState> operator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder sortStates (Comparator<? super fsm._ast.ASTState> comparator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getStateList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setStatesList (List<fsm._ast.ASTState> states)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.states = states;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setInitialState (String initialState)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.initialState = initialState;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder clearFinalStates ()

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addFinalStates (String element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAllFinalStates (Collection<? extends String> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeFinalStates (Object element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeAllFinalStates (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder retainAllFinalStates (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeIfFinalStates (Predicate<? super String> filter)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder forEachFinalStates (Consumer<? super String> action)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addFinalStates (int index,String element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAllFinalStates (int index,Collection<? extends String> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeFinalStates (int index)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setFinalStates (int index,String element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder replaceAllFinalStates (UnaryOperator<String> operator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder sortFinalStates (Comparator<? super String> comparator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getFinalStatesList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder setFinalStatesList (List<String> finalStates)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.finalStates = finalStates;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_SourcePositionEnd (SourcePosition end)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_SourcePositionEndAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_SourcePositionStart (SourcePosition start)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_SourcePositionStartAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder clear_PreComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder add_PreComment (Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder add_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAll_PreComments (Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder remove_PreComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder remove_PreComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder retainAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_PreCommentList (List<Comment> preComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder clear_PostComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder add_PostComment (Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder add_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder remove_PostComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder remove_PostComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder retainAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_PostCommentList (List<Comment> postComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSMBuilder set_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTFSM uncheckedBuild ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        ASTFSM value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTFSM();
    value.setName(this.name);
    value.setStateList(this.states);
    value.setInitialState(this.initialState);
    value.setFinalStatesList(this.finalStates);
    if (this.sourcePositionEnd.isPresent()) {
      value.set_SourcePositionEnd(this.sourcePositionEnd.get());
    } else {
      value.set_SourcePositionEndAbsent();
    }
    if (this.sourcePositionStart.isPresent()) {
      value.set_SourcePositionStart(this.sourcePositionStart.get());
    } else {
      value.set_SourcePositionStartAbsent();
    }
    value.set_PreCommentList(this.precomments);
    value.set_PostCommentList(this.postcomments);

        return value;

}

}