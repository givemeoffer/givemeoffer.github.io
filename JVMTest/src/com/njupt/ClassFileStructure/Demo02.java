package com.njupt.ClassFileStructure;

//演示 字节码指令和操作数栈、常量池的关系
public class Demo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = Short.MAX_VALUE + 1;
        int c = a + b;
        System.out.println(c);
    }
}
