## JNI Example
---
A simple Android JNI example for demo purposes.

### Using native libraries with .so files
---
Just throw them in this directory structure and you're done:

```
src
    main
        jniLibs
            armeabi
                libTest.so
            armeabi-v7a
                ...
            mips
                ...
            x86
                ...
```

### Compiling your own c code
---
Make files can be generated for you if you have the following in your app module's build.gradle file:

```
android {
    ...
    
    defaultConfig {
        ...

        ndk {
            moduleName "JniExample"
        }
    }

   ...
}
```

There is a corresponding JniExample.c file in src/main/jni.

Alternatively, you can run ndk-build to use your custom Android.mk makefile as described in the below resource.

#### Resources
---
[http://ph0b.com/android-studio-gradle-and-ndk-integration/](http://ph0b.com/android-studio-gradle-and-ndk-integration/)
