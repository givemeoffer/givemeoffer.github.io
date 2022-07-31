package com.njupt.ClassFileStructure.ClassLoader;

public class Load1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.njupt.ClassFileStructure.ClassLoader.F");
        System.out.println(aClass.getClassLoader());
    }
}
