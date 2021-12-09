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


 public  class ASTStateBuilder extends de.monticore.ast.ASTNodeBuilder<ASTStateBuilder>  {

    /* generated by template core.Attribute*/
 protected  ASTStateBuilder realBuilder ;

    /* generated by template core.Attribute*/
 protected  String name ;

    /* generated by template core.Attribute*/
 protected  java.util.List<fsm._ast.ASTTransition> transitions = new java.util.ArrayList<>();


    /* generated by template core.Constructor*/
 public  ASTStateBuilder()
 {
  this.realBuilder = (ASTStateBuilder) this;
}


    /* generated by template core.Method*/
 public  ASTState build ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        if (!isValid()) {
            if (name == null) {
                Log.error("0xA4522 name of type String must not be null");
            }
          throw new IllegalStateException();
        }
        ASTState value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTState();
    value.setName(this.name);
    value.setTransitionList(this.transitions);
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
        return true;

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
 public  ASTStateBuilder setName (String name)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.name = name;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clearTransitions ()

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().clear();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addTransition (fsm._ast.ASTTransition element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().add(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAllTransitions (Collection<? extends fsm._ast.ASTTransition> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().addAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeTransition (Object element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().remove(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAllTransitions (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().removeAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAllTransitions (Collection<?> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().retainAll(collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIfTransition (Predicate<? super fsm._ast.ASTTransition> filter)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().removeIf(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEachTransitions (Consumer<? super fsm._ast.ASTTransition> action)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().forEach(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addTransition (int index,fsm._ast.ASTTransition element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().add(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAllTransitions (int index,Collection<? extends fsm._ast.ASTTransition> collection)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().addAll(index, collection);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeTransition (int index)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().remove(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setTransition (int index,fsm._ast.ASTTransition element)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().set(index, element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAllTransitions (UnaryOperator<fsm._ast.ASTTransition> operator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().replaceAll(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sortTransitions (Comparator<? super fsm._ast.ASTTransition> comparator)

 {
      /* generated by template _ast.builder.MethodDelegate4ASTBuilder*/

    this.getTransitionList().sort(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder setTransitionsList (List<fsm._ast.ASTTransition> transitions)

 {
      /* generated by template _ast.builder.Set4ASTBuilder*/

    this.transitions = transitions;
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionEnd (SourcePosition end)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEnd(end);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionEndAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionEndAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionStart (SourcePosition start)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStart(start);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_SourcePositionStartAbsent ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_SourcePositionStartAbsent();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clear_PreComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PreComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PreComment (Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PreComments (Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PreComments (int index,Collection<Comment> precomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PreComments(index, precomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PreComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PreComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PreComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAll_PreComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PreComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIf_PreComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PreComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEach_PreComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PreComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAll_PreComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PreComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sort_PreComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PreComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PreCommentList (List<Comment> preComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreCommentList(preComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PreComment (int index,Comment precomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PreComment(index, precomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder clear_PostComments ()

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.clear_PostComments();
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PostComment (Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder add_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.add_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PostComments (Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder addAll_PostComments (int index,Collection<Comment> postcomments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.addAll_PostComments(index, postcomments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PostComment (Object element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder remove_PostComment (int index)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.remove_PostComment(index);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder retainAll_PostComments (Collection<?> element)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.retainAll_PostComments(element);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder removeIf_PostComment (Predicate<? super Comment> filter)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.removeIf_PostComment(filter);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder forEach_PostComments (Consumer<? super Comment> action)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.forEach_PostComments(action);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder replaceAll_PostComments (UnaryOperator<Comment> operator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.replaceAll_PostComments(operator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder sort_PostComments (Comparator<? super Comment> comparator)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.sort_PostComments(comparator);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PostCommentList (List<Comment> postComments)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostCommentList(postComments);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTStateBuilder set_PostComment (int index,Comment postcomment)

 {
      /* generated by template _ast.ast_class.builder.ASTCNodeMethodDelegate*/

    super.set_PostComment(index, postcomment);
    return this.realBuilder;

}

    /* generated by template core.Method*/
 public  ASTState uncheckedBuild ()

 {
      /* generated by template _ast.builder.BuildMethod*/

        ASTState value;
        /* generated by template _ast.ast_class.builder.ASTCNodeInit*/

    value = new ASTState();
    value.setName(this.name);
    value.setTransitionList(this.transitions);
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