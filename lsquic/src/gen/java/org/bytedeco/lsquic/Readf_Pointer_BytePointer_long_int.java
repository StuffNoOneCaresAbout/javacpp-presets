// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.lsquic;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.lsquic.global.lsquic.*;


/**
 * This function allows user-supplied callback to read the stream contents.
 * It is meant to be used for zero-copy stream processing.
 *
 * Return value and errors are same as in \ref lsquic_stream_read().
 */
@Properties(inherit = org.bytedeco.lsquic.presets.lsquic.class)
public class Readf_Pointer_BytePointer_long_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Readf_Pointer_BytePointer_long_int(Pointer p) { super(p); }
    protected Readf_Pointer_BytePointer_long_int() { allocate(); }
    private native void allocate();
    public native @Cast("size_t") long call(Pointer ctx, @Cast("const unsigned char*") BytePointer buf, @Cast("size_t") long len, int fin);
}
