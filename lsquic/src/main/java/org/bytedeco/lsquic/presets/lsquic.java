package org.bytedeco.lsquic.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(value = {
        @Platform(include = "<lsquic.h>", link = "lsquic") }, target = "org.bytedeco.lsquic", global = "org.bytedeco.lsquic.global.lsquic")
public class lsquic implements InfoMapper {
    static {
        Loader.checkVersion("org.bytedeco", "lsquic");
    }

    public void map(InfoMap infoMap) {
        infoMap.put(new Info("uint_fast8_t").cast().valueTypes("int").pointerTypes("IntPointer"))
                .put(new Info("lsquic_lookup_cert_f", "lsquic_stream_id_t", "iovec").define(false))
                .put(new Info("LSQUIC_USE_Q098").define(false));
    }
}
