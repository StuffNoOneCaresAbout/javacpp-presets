// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif


/* OrderedDict */
/* This API is optional and mostly redundant. */

// #ifndef Py_LIMITED_API

@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyODictObject extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PyODictObject() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyODictObject(Pointer p) { super(p); }
}
