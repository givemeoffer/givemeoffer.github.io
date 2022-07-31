package com.njupt.ClassFileStructure.ClassLoadingPhase;

public class load3 {
    public static void main(String[] args) {
        //调用 a 和 b 不会让 E 初始化，因为静态常量（基本类型和字符串）不会触发初始化
        System.out.println(E.a);
        System.out.println(E.b);
        //调用 c 会让 E 初始化，因为 c 是一个包装类型，底层会进行一个自动装箱操作(Integer.valueOf(20))
        //如果 static 变量是 final 的，但属于引用类型，那么赋值也会在初始化阶段完成将常量池中的符号引用解析为直接引用
        System.out.println(E.c);
    }
}

class E {
    public static final int a = 10;
    public static final String b = "hello";
    public static final Integer c = 20;
    static {
        System.out.println("init E");
    }
}
