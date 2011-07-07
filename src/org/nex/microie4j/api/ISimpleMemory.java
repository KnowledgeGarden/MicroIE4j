package org.nex.microie4j.api;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @license Apache2.0
 */
public interface ISimpleMemory {

    /**
     * <p>Save something for later recall. Note, this will
     * overwrite anything already stored with the same <code>key</code>.</p>
     * <p>{@link org.nex.microie4j.api.Inferable} objects can use this as
     * a memory for collecting and reusing information resources.</p>
     * @param key String
     * @param value String
     */
    void remember(String key, String value);

    /**
     * Recall something. Can return <code>null</code>
     * @param key String
     * @return String
     */
    String recall(String key);
}
