package org.nex.microie4j.example;
import org.nex.microie4j.api.Inferable;
import org.nex.microie4j.api.ISimpleMemory;
import org.nex.microie4j.api.ISimpleMemoryInferable;
import org.nex.microie4j.impl.AndList;
import org.nex.microie4j.impl.OrList;
import org.nex.microie4j.impl.Not;
import org.nex.microie4j.impl.SimpleMemory;
import org.nex.microie4j.impl.SimpleMemoryInferable;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public class SimpleExample {
  public static final String
      COLOR_1_KEY  = "color1",
      COLOR_2_KEY  = "color2",
      COLOR_1_VAL  = "green",
      COLOR_2_VAL  = "blue";

  private ISimpleMemory brain;
  private OrList root = null;

  public SimpleExample() {
    brain = new SimpleMemory();
    //remember some values to play with
    brain.remember(SimpleExample.COLOR_1_KEY,SimpleExample.COLOR_1_VAL);
    brain.remember(SimpleExample.COLOR_2_KEY, SimpleExample.COLOR_2_VAL);
    //build an inference engine for those values
    buildInferenceNetwork();
    //watch it run
    System.out.println("Starting");
    boolean result = root.eval();
    System.out.println("Ending "+result);
  }

  void buildInferenceNetwork() {
    root = new OrList("root");
    root.setIsVerbose(true);
    //guaranteed to return false
    QueryInferableWithMemory qim = new QueryInferableWithMemory("qim");
    root.add(qim);
    AndList al = new AndList("FirstAndList");
    al.setIsVerbose(true);
    //negate qim to return true
    Not n = new Not("FirstNot");
    n.setInferable(qim);
    al.add(n);
    //this one will return true
    SimpleMemoryInferable smi = new SimpleMemoryInferable("FirstSimple");
    smi.setKey(SimpleExample.COLOR_2_KEY);
    smi.setValueToCompare(SimpleExample.COLOR_2_VAL);
    al.add(smi);
    root.add(al);
  }

  public static void main(String[] args) {
    SimpleExample simpleexample = new SimpleExample();
  }
}
