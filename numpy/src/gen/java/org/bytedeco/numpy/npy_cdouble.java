// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;

// #endif
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class npy_cdouble extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public npy_cdouble() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public npy_cdouble(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public npy_cdouble(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public npy_cdouble position(long position) {
        return (npy_cdouble)super.position(position);
    }
    @Override public npy_cdouble getPointer(long i) {
        return new npy_cdouble(this).position(position + i);
    }
 public native double real(); public native npy_cdouble real(double setter);
public native double imag(); public native npy_cdouble imag(double setter); }
