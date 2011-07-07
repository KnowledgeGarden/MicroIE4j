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
public class Not
    implements Inferable {
  private String _id;
  private Inferable _object;

  public Not() {
  }

  public Not(String id) {
    setId(id);
  }

  public Not(String id, Inferable i) {
    setId(id);
    setInferable(i);
  }

  /**
   * <p>Perform negation on the result of the {@link Inferable} object</p>
   * @return boolean
   * @throws RuntimeException if <code>_object</code> is not set
   */
  public boolean eval() {
    if (_object==null)
      throw new RuntimeException("Not missing Inferable "+_id);
    return (!_object.eval());
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
   * Without an inferable, this class will not work
   * @param i Inferable
   */
  public void setInferable(Inferable i) {
    _object = i;
  }

}
