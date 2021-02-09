// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.lsquic;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.lsquic.global.lsquic.*;


@Properties(inherit = org.bytedeco.lsquic.presets.lsquic.class)
public class lsquic_cids_update_f extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    lsquic_cids_update_f(Pointer p) { super(p); }
    protected lsquic_cids_update_f() { allocate(); }
    private native void allocate();
    public native void call(Pointer ctx, @Cast("void**") PointerPointer peer_ctx,
                                @Const lsquic_cid_t cids, @Cast("unsigned") int n_cids);
}
