// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.lsquic;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.lsquic.global.lsquic.*;


@Opaque @Properties(inherit = org.bytedeco.lsquic.presets.lsquic.class)
public class ssl_ctx_st extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ssl_ctx_st() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ssl_ctx_st(Pointer p) { super(p); }
}
