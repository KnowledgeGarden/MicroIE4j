package org.nex.microie4j.api;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license  Apache2.0
 */
public interface Inferable {

    /**
     * <p>Optional value, useful for database persistence or tracing
     * inference behaviors</p>
     * @param id String
     */
    void setId(String id);

    /**
     * Can return <code>null</code> if not set
     * @return String
     */
    String getId();

    /**
     * <p>Optional class that can be used to perform inference
     * or to perform tasks without inference</p>
     * @param i Inferable
     */
    void setInferable(Inferable i);

    /**
     * <p>Perform the tasks associated with this object and return
     * the result</p>
     * @return boolean
     */
    boolean eval();

}
