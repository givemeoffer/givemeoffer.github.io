package com.njupt.ClassFileStructure.ConstructionMethod;

public class Demo03 {
    public Demo03() { }

    private void test1() { }

    private final void test2() { }

    public void test3() { }

    public static void test4() { }

    public static void main(String[] args) {
        Demo03 d = new Demo03();
        d.test1();
        d.test2();
        d.test3();
        d.test4();
        Demo03.test4();
    }
}
