package com.njupt.ClassFileStructure.ClassLoadingPhase;

import java.io.IOException;

//解析的含义
public class load {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = load.class.getClassLoader();
        // loadClass 方法不会导致类的解析和初始化
        Class<?> c = classLoader.loadClass("com.njupt.ClassFileStructure.ClassLoadingPhase.C");
        System.in.read();
    }
}

class C {
    D d = new D();
}

class D {

}