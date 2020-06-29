// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Opaque @Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _frame extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public _frame() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _frame(Pointer p) { super(p); }
}
