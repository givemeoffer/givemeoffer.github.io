package com.njupt.ClassFileStructure.translater;

public class Candy5 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; // 数组赋初值的简化写法也是语法糖
        for (int e : array) {
            System.out.println(e);
        }
    }
}
