// Targeted by JavaCPP version 1.5.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Vanilla RNN forward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class vanilla_rnn_forward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public vanilla_rnn_forward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public vanilla_rnn_forward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public vanilla_rnn_forward position(long position) {
        return (vanilla_rnn_forward)super.position(position);
    }
    @Override public vanilla_rnn_forward getPointer(long i) {
        return new vanilla_rnn_forward(this).position(position + i);
    }

    /** Descriptor for a vanilla RNN forward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        ///
        ///
        public native @ByRef dnnl_rnn_desc_t data(); public native desc data(dnnl_rnn_desc_t setter);

        /** Constructs a descriptor for a vanilla RNN forward propagation
         *  primitive.
         * 
         *  The following arguments may point to a zero memory descriptor:
         *  - \p src_iter_desc,
         *  - \p bias_desc,
         *  - \p dst_iter_desc.
         * 
         *  This would then indicate that the RNN forward propagation primitive
         *  should not use them and should default to zero values instead.
         * 
         *  \note
         *      All memory descriptors except \p src_iter_desc can be
         *      initialized with an #dnnl::memory::format_tag::any value of \p
         *      format_tag.
         * 
         *  @param aprop_kind Propagation kind. Possible values are
         *      #dnnl::prop_kind::forward_training, and
         *      #dnnl::prop_kind::forward_inference.
         *  @param activation Activation kind. Possible values are
         *      #dnnl::algorithm::eltwise_relu,
         *      #dnnl::algorithm::eltwise_tanh, or
         *      #dnnl::algorithm::eltwise_logistic.
         *  @param direction RNN direction. See \ref dnnl::rnn_direction for
         *      more info.
         *  @param src_layer_desc Memory descriptor for the input vector.
         *  @param src_iter_desc Memory descriptor for the input recurrent
         *      hidden state vector.
         *  @param weights_layer_desc Memory descriptor for the weights
         *      applied to the layer input.
         *  @param weights_iter_desc Memory descriptor for the weights applied
         *      to the recurrent input.
         *  @param bias_desc Bias memory descriptor.
         *  @param dst_layer_desc Memory descriptor for the output vector.
         *  @param dst_iter_desc Memory descriptor for the output recurrent
         *      hidden state vector.
         *  @param flags Unused.
         *  @param alpha Negative slope if activation is
         *      #dnnl::algorithm::eltwise_relu.
         *  @param beta Unused. */
        public desc(prop_kind aprop_kind, algorithm activation,
                        rnn_direction direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/, float alpha/*=0.0f*/,
                        float beta/*=0.0f*/) { super((Pointer)null); allocate(aprop_kind, activation, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, flags, alpha, beta); }
        private native void allocate(prop_kind aprop_kind, algorithm activation,
                        rnn_direction direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        rnn_flags flags/*=dnnl::rnn_flags::undef*/, float alpha/*=0.0f*/,
                        float beta/*=0.0f*/);
        public desc(prop_kind aprop_kind, algorithm activation,
                        rnn_direction direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, activation, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc); }
        private native void allocate(prop_kind aprop_kind, algorithm activation,
                        rnn_direction direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int activation,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/, float alpha/*=0.0f*/,
                        float beta/*=0.0f*/) { super((Pointer)null); allocate(aprop_kind, activation, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, flags, alpha, beta); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int activation,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc,
                        @Cast("dnnl::rnn_flags") int flags/*=dnnl::rnn_flags::undef*/, float alpha/*=0.0f*/,
                        float beta/*=0.0f*/);
        public desc(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int activation,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc) { super((Pointer)null); allocate(aprop_kind, activation, direction, src_layer_desc, src_iter_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc); }
        private native void allocate(@Cast("dnnl::prop_kind") int aprop_kind, @Cast("dnnl::algorithm") int activation,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef memory.desc src_layer_desc,
                        @Const @ByRef memory.desc src_iter_desc,
                        @Const @ByRef memory.desc weights_layer_desc,
                        @Const @ByRef memory.desc weights_iter_desc,
                        @Const @ByRef memory.desc bias_desc,
                        @Const @ByRef memory.desc dst_layer_desc,
                        @Const @ByRef memory.desc dst_iter_desc);
    }

    /** Primitive descriptor for a vanilla RNN forward propagation primitive. */
    public static class primitive_desc extends rnn_primitive_desc_base {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc(this).position(position + i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for a vanilla RNN forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a vanilla RNN forward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a vanilla RNN forward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for a vanilla RNN forward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine, @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine) { super((Pointer)null); allocate(adesc, attr, aengine); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine);

        /** Constructs a primitive descriptor for a vanilla RNN forward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for a vanilla RNN forward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::rnn_primitive_desc_base::src_layer_desc()const */
        public native @ByVal memory.desc src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::src_iter_desc()const */
        public native @ByVal memory.desc src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_layer_desc()const */
        public native @ByVal memory.desc weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_iter_desc()const */
        public native @ByVal memory.desc weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::bias_desc()const */
        public native @ByVal memory.desc bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_layer_desc()const */
        public native @ByVal memory.desc dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_iter_desc()const */
        public native @ByVal memory.desc dst_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::workspace_desc()const */
        public native @ByVal memory.desc workspace_desc();
    }

    /** Default constructor. Produces an empty object. */
    public vanilla_rnn_forward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs a vanilla RNN forward propagation primitive.
     *  @param pd Primitive descriptor for a vanilla RNN forward
     *      propagation primitive. */
    public vanilla_rnn_forward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
