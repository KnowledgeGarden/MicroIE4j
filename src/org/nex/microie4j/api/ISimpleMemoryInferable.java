package org.nex.microie4j.api;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public interface ISimpleMemoryInferable
    extends Inferable {

    /**
     * <code>key</code> for recall from {@link ISimpleMemory}
     * @param key String
     */
    void setKey(String key);

    /**
     * <code>value</code> to compare with value recalled from
     * {@link ISimpleMemory}
     * @param value String
     */
    void setValueToCompare(String value);
}
