package com.njupt.ClassFileStructure.ClassLoader;

public class Load2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.njupt.ClassFileStructure.ClassLoader.G");
        System.out.println(aClass.getClassLoader());
    }
}
