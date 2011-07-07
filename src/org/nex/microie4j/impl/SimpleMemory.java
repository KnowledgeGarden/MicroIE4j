package org.nex.microie4j.impl;

import org.nex.microie4j.api.*;
import java.util.*;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public class SimpleMemory
    implements ISimpleMemory {
  private static SimpleMemory instance;
  private Map<String,String>memory;

  public SimpleMemory() {
    memory = new HashMap<String,String>();
    instance = this;
  }

  public static SimpleMemory getInstance() {
    if (instance==null)
      instance = new SimpleMemory();
    return instance;
  }

  /**
   * Recall something.
   *
   * @param key String
   * @return String
   */
  public String recall(String key) {
    return memory.get(key);
  }

  /**
   *
   * @param key String
   * @param value String
   */
  public void remember(String key, String value) {
    memory.put(key,value);
  }

}
