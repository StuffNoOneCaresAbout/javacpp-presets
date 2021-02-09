package org.bytedeco.lsquic.presets;

import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;
import org.bytedeco.javacpp.tools.*;

@Properties(value = {
        @Platform(include = "<lsquic_types.h>", link = "lsquic") }, target = "org.bytedeco.lsquic", global = "org.bytedeco.lsquic.global.lsquic_types")
public class lsquic_types implements InfoMapper {
    static {
        Loader.checkVersion("org.bytedeco", "lsquic");
    }

    public void map(InfoMap infoMap) {
        infoMap.put(new Info("uint_fast8_t").cast().valueTypes("int").pointerTypes("IntPointer"))
                .put(new Info("idbuf").define(false));
    }
}
