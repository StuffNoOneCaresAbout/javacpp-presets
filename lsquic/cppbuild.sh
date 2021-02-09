#!/bin/bash
# This file is meant to be included by the parent cppbuild.sh script
if [[ -z "$PLATFORM" ]]; then
    pushd ..
    bash cppbuild.sh "$@" lsquic
    popd
    exit
fi

BORINGSSL_VERSION=b117a3a0b7bd11fe6ebd503ec6b45d6b910b41a1
download https://github.com/google/boringssl/archive/$BORINGSSL_VERSION.tar.gz boringssl-$BORINGSSL_VERSION.tar.gz
mkdir -p $PLATFORM
cd $PLATFORM
tar -xzvf ../boringssl-$BORINGSSL_VERSION.tar.gz
cd boringssl-$BORINGSSL_VERSION
cmake -DBUILD_SHARED_LIBS=1 -DCMAKE_BUILD_TYPE=Release . && make
BORINGSSL=$PWD

cd ..

LSQUIC_VERSION=2.27.5
ls lsquic || git clone --branch v$LSQUIC_VERSION https://github.com/litespeedtech/lsquic.git
cd lsquic
git submodule init
git submodule update
cmake -DBORINGSSL_INCLUDE=$BORINGSSL/include -DBORINGSSL_DIR=$BORINGSSL -DLSQUIC_SHARED_LIB=1 -DCMAKE_BUILD_TYPE=Release .
cp -r include ../include/
mkdir -p ../lib

case $PLATFORM in
android-arm)
    CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS"
    make -j $MAKEJ
    ;;
android-arm64)
    CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS"
    make -j $MAKEJ
    ;;
android-x86)
    CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS"
    make -j $MAKEJ
    ;;
android-x86_64)
    CC="$ANDROID_CC" CFLAGS="$ANDROID_FLAGS"
    make -j $MAKEJ
    ;;
linux-x86)
    CC="gcc -m32 -fPIC"
    make -j $MAKEJ
    ;;
linux-x86_64)
    CC="gcc -m64 -fPIC"
    make -j $MAKEJ
    cp src/liblsquic/liblsquic.so ../lib/liblsquic.so
    ;;
macosx-x86_64)
    make -j $MAKEJ
    ;;
windows-x86)
    nmake -f win32/Makefile.msc lsquic.lib
    mkdir -p ../include ../lib
    cp zconf.h lsquic.h ../include/
    cp lsquic.lib ../lib/
    ;;
windows-x86_64)
    nmake -f win32/Makefile.msc lsquic.lib
    mkdir -p ../include ../lib
    cp zconf.h lsquic.h ../include/
    cp lsquic.lib ../lib/
    ;;
*)
    echo "Error: Platform \"$PLATFORM\" is not supported"
    ;;
esac

cd ../..
