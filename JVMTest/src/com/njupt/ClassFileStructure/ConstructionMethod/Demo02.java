package com.njupt.ClassFileStructure.ConstructionMethod;

public class Demo02 {

    private String a = "s1";

    {
        b = 20;
    }

    private int b = 10;

    {
        a = "s2";
    }

    public Demo02 (String a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        Demo02 d = new Demo02("s3",30);
        System.out.println(d.a);
        System.out.println(d.b);
    }
}
