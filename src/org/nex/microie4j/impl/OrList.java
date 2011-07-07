package org.nex.microie4j.impl;
import java.util.*;
import org.nex.microie4j.api.*;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public class OrList extends ArrayList<Inferable>
    implements Inferable {
  private String _id;
  private Inferable _object;
  private boolean isVerbose = false;

  public OrList() {
    super();
  }

  public OrList(String id) {
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
   * First element to return <code>true</code> wins. If no element returns
   * <code>true</code>, then return <code>false</code>
   * @return boolean
   */
  public boolean eval() {
    if (isVerbose)
      System.out.println("OrList "+_id+" starting ");
    Iterator<Inferable>itr = super.iterator();
    Inferable x;
    while (itr.hasNext()) {
      x = itr.next();
      if (isVerbose)
        System.out.println("OrList "+_id+" evaluating "+x.getId());
      if (x.eval())
        return true;
    }
    if (isVerbose)
      System.out.println("OrList "+_id+" returning false ");
    return false;
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
