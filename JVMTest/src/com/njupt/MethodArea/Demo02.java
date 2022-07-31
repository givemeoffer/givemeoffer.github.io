package com.njupt.MethodArea;

public class Demo02 {
    //串池：["a","b","ab"]
    public static void main(String[] args) {
        //此时字符串 "ab" 并没有放入到串池中，只放入到了堆当中
        String s = new String("a") + new String("b"); // new String("ab")
        //想要放入到串池中，则需要调用 intern() 方法
        //将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池中，会把串池中的对象返回
        //调用 s 的 intern 方法，这时串池中没有 "ab" ，则会将该字符串对象放入到串池中，此时堆内存与串池中的 "ab" 是同一个对象，因此s=="ab"-->true\
        //s2 中的 "ab" 就是串池中的 "ab" ，因此返回true
        String s2 = s.intern();

        System.out.println(s2 == "ab");//true
        //此时堆中的 "ab" 和串池中的 "ab" 是同一个对象
        System.out.println(s == "ab");//true
        System.out.println(s == s2);//true
    }
}
