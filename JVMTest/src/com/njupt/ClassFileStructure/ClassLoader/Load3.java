package com.njupt.ClassFileStructure.ClassLoader;

public class Load3 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Load3.class.getClassLoader());
        Class<?> aClass = Load3.class.getClassLoader().loadClass("com.njupt.ClassFileStructure.ClassLoader.H");
        System.out.println(aClass.getClassLoader());
    }
}
