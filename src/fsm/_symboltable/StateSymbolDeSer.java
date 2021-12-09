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


 public  class StateSymbolDeSer  implements de.monticore.symboltable.serialization.ISymbolDeSer<fsm._symboltable.StateSymbol, fsm._symboltable.FSMSymbols2Json> {



    /* generated by template core.Method*/
 public  String getSerializedKind ()

 {
      return "fsm._symboltable.StateSymbol";
}

    /* generated by template core.Method*/
 public  String serialize (fsm._symboltable.StateSymbol toSerialize,fsm._symboltable.FSMSymbols2Json s2j)

 {
      /* generated by template _symboltable.serialization.symbolDeSer.Serialize4SymbolDeSer*/

  de.monticore.symboltable.serialization.JsonPrinter p = s2j.getJsonPrinter();
  p.beginObject();
  p.member(de.monticore.symboltable.serialization.JsonDeSers.KIND, getSerializedKind());
  p.member(de.monticore.symboltable.serialization.JsonDeSers.NAME, toSerialize.getName());

  // serialize symbolrule attributes


  serializeAddons(toSerialize, s2j);
  p.endObject();

  return p.toString();

}

    /* generated by template core.Method*/
 protected  void serializeAddons (fsm._symboltable.StateSymbol toSerialize,fsm._symboltable.FSMSymbols2Json s2j)

 {
      /* generated by template core.EmptyBody*/
// empty body

}

    /* generated by template core.Method*/
 public  fsm._symboltable.StateSymbol deserialize (de.monticore.symboltable.serialization.json.JsonObject symbolJson)

 {
      /* generated by template _symboltable.serialization.symbolDeSer.Deserialize4SymbolDeSer*/

  fsm._symboltable.StateSymbolBuilder builder = fsm.FSMMill.stateSymbolBuilder();
  builder.setName(symbolJson.getStringMember(de.monticore.symboltable.serialization.JsonDeSers.NAME));


  fsm._symboltable.StateSymbol symbol = builder.build();

  deserializeAddons(symbol, symbolJson);
  return symbol;
}

    /* generated by template core.Method*/
 protected  void deserializeAddons (fsm._symboltable.StateSymbol symbol,de.monticore.symboltable.serialization.json.JsonObject symbolJson)

 {
      /* generated by template core.EmptyBody*/
// empty body

}

}