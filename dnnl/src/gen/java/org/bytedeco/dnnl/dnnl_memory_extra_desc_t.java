// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Description of extra information stored in memory */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_memory_extra_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_memory_extra_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_memory_extra_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_memory_extra_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_memory_extra_desc_t position(long position) {
        return (dnnl_memory_extra_desc_t)super.position(position);
    }
    @Override public dnnl_memory_extra_desc_t getPointer(long i) {
        return new dnnl_memory_extra_desc_t(this).position(position + i);
    }

    /** The flags contain arbitrary extra information, such as compensation.
     *  @see dnnl_memory_extra_flags_t */
    public native @Cast("uint64_t") long flags(); public native dnnl_memory_extra_desc_t flags(long setter);
    /** Compensation mask */
    public native int compensation_mask(); public native dnnl_memory_extra_desc_t compensation_mask(int setter);
    /** Scale applied to the data */
    public native float scale_adjust(); public native dnnl_memory_extra_desc_t scale_adjust(float setter);
    /** For future backwards compatibility */
    public native @Cast("char") byte reserved(int i); public native dnnl_memory_extra_desc_t reserved(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer reserved();
}
