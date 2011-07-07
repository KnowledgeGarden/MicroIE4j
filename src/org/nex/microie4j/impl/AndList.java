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
public class AndList extends ArrayList<Inferable>
    implements Inferable {
  private String _id;
  private Inferable _object;
  private boolean isVerbose = false;

  public AndList() {
    super();
  }

  public AndList(String id) {
    super();
    setId(id);
  }
  /**
   * Use this to turn on verbose
   * @param t boolean
   */
  public void setIsVerbose(boolean t) {
    isVerbose = t;
  }

  /**
   * All elements must return <code>true</code> for this to return
   * <code>true</code>
   * @return boolean
   */
  public boolean eval() {
    if (isVerbose)
      System.out.println("AndList "+_id+" starting ");
    Iterator<Inferable>itr = super.iterator();
    Inferable x;
    while (itr.hasNext()) {
      x = itr.next();
      if (isVerbose)
        System.out.println("AndList "+_id+" evaluating "+x.getId());
      if (!x.eval())
        return false;
    }
    if (isVerbose)
      System.out.println("AndList "+_id+" returning true ");
    return true;
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
    _object = i;
  }

}
