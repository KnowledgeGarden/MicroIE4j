package org.nex.microie4j.impl;

import org.nex.microie4j.api.*;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public class SimpleMemoryInferable
    implements ISimpleMemoryInferable {
  private String _id;
  private String _key;
  private String _value;

  public SimpleMemoryInferable() {
  }

  public SimpleMemoryInferable(String id) {
    setId(id);
  }
  /**
   * Compare <code>_value</code> to that which is fetched from
   * {@link ISimpleMemory}
   * @return boolean
   */
  public boolean eval() {
    String val = SimpleMemory.getInstance().recall(_key);
    return (val != null && val.equals(_value));
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

  /**
   *
   * @param key String
   */
  public void setKey(String key) {
    _key = key;
  }

  /**
   *
   * @param value String
    */
  public void setValueToCompare(String value) {
    _value = value;
  }

}
