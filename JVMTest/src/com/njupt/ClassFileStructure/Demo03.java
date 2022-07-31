package com.njupt.ClassFileStructure;

//从字节码角度分析 a++ 相关问题
public class Demo03 {
    public static void main(String[] args) {
        int a = 10;
        int b = a++ + ++a + a--;
        System.out.println(a);
        System.out.println(b);
    }
}
