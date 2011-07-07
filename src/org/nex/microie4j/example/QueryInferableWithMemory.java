package org.nex.microie4j.example;

import org.nex.microie4j.api.*;
import org.nex.microie4j.impl.SimpleMemory;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public class QueryInferableWithMemory
    implements Inferable {
  private boolean result = false;
  private boolean isKnown = false;
  private String _id;

  public QueryInferableWithMemory() {
  }

  public QueryInferableWithMemory(String id) {
    setId(id);
  }

  /**
   * A test guaranteed to fail, and remember its results
   * @return boolean
   */
  public boolean eval() {
    if (isKnown)
      return result;
    ISimpleMemory m = SimpleMemory.getInstance();
    String val = m.recall(SimpleExample.COLOR_1_KEY);
    if( val != null) {
      result = val.equals(SimpleExample.COLOR_2_VAL);
      isKnown = true;
    }
    return result;
  }

  /**
   *
   * @return String
    */
  public String getId() {
    return _id;
  }

  /**
   *
   * @param id String
   */
  public void setId(String id) {
    _id = id;
  }

  /**
   *
   * @param i Inferable
   */
  public void setInferable(Inferable i) {
    //ignore
  }

}
