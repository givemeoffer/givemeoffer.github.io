package com.njupt.ClassFileStructure.ReflectCompilation;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射优化
public class Demo01 {
    public static void foo() {
        System.out.println("foo...");
    }

    public static void main(String[] args) throws Exception {
        Method foo = Demo01.class.getMethod("foo");
        for (int i = 0; i <= 16; i++) {
            System.out.printf("%d\t",i);
            foo.invoke(null);
        }
        System.in.read();
    }
}
