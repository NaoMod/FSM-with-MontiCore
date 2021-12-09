/* generated from model FSM */
/* generated by template core.Class*/

/* (c) https://github.com/MontiCore/monticore */
package fsm._parser;

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


 public  class FSMParser extends de.monticore.antlr4.MCConcreteParser  {



    /* generated by template core.Method*/
 protected  FSMAntlrParser create (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.Create*/

  FSMAntlrLexer lexer = new FSMAntlrLexer(org.antlr.v4.runtime.CharStreams.fromFileName(fileName));
  org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
  FSMAntlrParser parser = new FSMAntlrParser(tokens);
  lexer.setMCParser(parser);
  lexer.removeErrorListeners();
  lexer.addErrorListener(new de.monticore.antlr4.MCErrorListener(parser));
  parser.setFilename(fileName);
  setError(false);
  return parser;
}

    /* generated by template core.Method*/
 protected  FSMAntlrParser create (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.CreateReader*/

  FSMAntlrLexer lexer = new FSMAntlrLexer(org.antlr.v4.runtime.CharStreams.fromReader(reader));
  org.antlr.v4.runtime.CommonTokenStream tokens = new org.antlr.v4.runtime.CommonTokenStream(lexer);
  FSMAntlrParser parser = new FSMAntlrParser(tokens);
  lexer.setMCParser(parser);
  lexer.removeErrorListeners();
  lexer.addErrorListener(new de.monticore.antlr4.MCErrorListener(parser));
  parser.setFilename("StringReader");
  setError(false);
  return parser;
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parse (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.Parse*/

  return parseFSM(fileName);
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parse (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseReader*/

  return parseFSM(reader);
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parse_String (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseString*/

  return parse_StringFSM(str);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parseSignedBasicDoubleLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ast;
  ast = parser.signedBasicDoubleLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parseSignedBasicDoubleLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral ast;
  ast = parser.signedBasicDoubleLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicDoubleLiteral> parse_StringSignedBasicDoubleLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedBasicDoubleLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parseNatLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ast;
  ast = parser.natLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parseNatLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTNatLiteral ast;
  ast = parser.natLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNatLiteral> parse_StringNatLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseNatLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTState> parseState (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  fsm._ast.ASTState ast;
  ast = parser.state().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTState> parseState (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  fsm._ast.ASTState ast;
  ast = parser.state().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTState> parse_StringState (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseState(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parseBooleanLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ast;
  ast = parser.booleanLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parseBooleanLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral ast;
  ast = parser.booleanLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBooleanLiteral> parse_StringBooleanLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseBooleanLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parseSignedNatLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ast;
  ast = parser.signedNatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parseSignedNatLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral ast;
  ast = parser.signedNatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNatLiteral> parse_StringSignedNatLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedNatLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parseLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ast;
  ast = parser.literal().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parseLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mcliteralsbasis._ast.ASTLiteral ast;
  ast = parser.literal().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mcliteralsbasis._ast.ASTLiteral> parse_StringLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parseBasicDoubleLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ast;
  ast = parser.basicDoubleLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parseBasicDoubleLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral ast;
  ast = parser.basicDoubleLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicDoubleLiteral> parse_StringBasicDoubleLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseBasicDoubleLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parseSignedBasicFloatLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ast;
  ast = parser.signedBasicFloatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parseSignedBasicFloatLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral ast;
  ast = parser.signedBasicFloatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicFloatLiteral> parse_StringSignedBasicFloatLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedBasicFloatLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTTransition> parseTransition (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  fsm._ast.ASTTransition ast;
  ast = parser.transition().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTTransition> parseTransition (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  fsm._ast.ASTTransition ast;
  ast = parser.transition().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTTransition> parse_StringTransition (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseTransition(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parseBasicFloatLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ast;
  ast = parser.basicFloatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parseBasicFloatLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral ast;
  ast = parser.basicFloatLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicFloatLiteral> parse_StringBasicFloatLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseBasicFloatLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parseFSM (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  fsm._ast.ASTFSM ast;
  ast = parser.fSM().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parseFSM (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  fsm._ast.ASTFSM ast;
  ast = parser.fSM().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<fsm._ast.ASTFSM> parse_StringFSM (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseFSM(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parseNumericLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ast;
  ast = parser.numericLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parseNumericLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral ast;
  ast = parser.numericLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNumericLiteral> parse_StringNumericLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseNumericLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parseSignedNumericLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ast;
  ast = parser.signedNumericLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parseSignedNumericLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral ast;
  ast = parser.signedNumericLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedNumericLiteral> parse_StringSignedNumericLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedNumericLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parseSignedBasicLongLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ast;
  ast = parser.signedBasicLongLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parseSignedBasicLongLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral ast;
  ast = parser.signedBasicLongLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedBasicLongLiteral> parse_StringSignedBasicLongLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedBasicLongLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parseSignedLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ast;
  ast = parser.signedLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parseSignedLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral ast;
  ast = parser.signedLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTSignedLiteral> parse_StringSignedLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseSignedLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parseCharLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ast;
  ast = parser.charLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parseCharLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTCharLiteral ast;
  ast = parser.charLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTCharLiteral> parse_StringCharLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseCharLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parseStringLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ast;
  ast = parser.stringLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parseStringLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTStringLiteral ast;
  ast = parser.stringLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTStringLiteral> parse_StringStringLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseStringLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parseNullLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ast;
  ast = parser.nullLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parseNullLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTNullLiteral ast;
  ast = parser.nullLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTNullLiteral> parse_StringNullLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseNullLiteral(new java.io.StringReader(str));
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parseBasicLongLiteral (String fileName)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRule*/

  FSMAntlrParser parser = create(fileName);
  de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ast;
  ast = parser.basicLongLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);

}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parseBasicLongLiteral (java.io.Reader reader)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleReader*/

  FSMAntlrParser parser = create(reader);
  de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral ast;
  ast = parser.basicLongLiteral().ret;
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  parser.mc_eof();
  if (parser.hasErrors()) {
    setError(true);
    return Optional.empty();
  }
  return Optional.of(ast);
}

    /* generated by template core.Method*/
 public  Optional<de.monticore.literals.mccommonliterals._ast.ASTBasicLongLiteral> parse_StringBasicLongLiteral (String str)
 throws java.io.IOException
 {
      /* generated by template _parser.ParseRuleString*/

  return parseBasicLongLiteral(new java.io.StringReader(str));
}

}
