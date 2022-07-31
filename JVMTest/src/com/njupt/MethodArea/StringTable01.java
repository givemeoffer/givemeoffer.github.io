package com.njupt.MethodArea;

// StringTable["a","b","ab"]    使用HashTable实现的
public class StringTable01 {
    // 常量池中的信息，都会被加载到运行时常量池中，这时 a b ab 都是常量池中的符号，还没有变为 java 字符串对象
    // ldc #2 会把 a 符号变为 "a" 字符串对象
    // ldc #3 会把 b 符号变为 "b" 字符串对象
    // ldc #4 会把 ab 符号变为 "ab" 字符串对象

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;//new StringBuilder().append("a").append("b").toString()
        String s5 = "a" + "b";
//        System.out.println(s3 == s4);//false
//        System.out.println(s3 == s5);//true
    }
}
