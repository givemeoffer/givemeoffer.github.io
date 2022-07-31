package com.njupt.MethodArea;

public class InterviewTest {

    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "b";
        String s3 = "a" + "b";
        //调用StringBuilder方法拼接字符串，最后调用toString()方法创建一个新的String对象，放入堆中
        //因此s4和s3不是同一个对象，一个在常量池中，一个在堆中
        String s4 = s1 + s2;
        String s5 = "ab";
        //因为串池(常量池)中存在"ab"，因此此次堆中的"ab"放入串池中是失败的，因此堆中的"ab"和串池中的"ab"是同一个对象
        //但是返回的串池对象是"ab"，此时s6和s3指向同一个对象
        String s6 = s4.intern();

        //问
        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//te
        System.out.println(s3 == s6);//true

        //堆中对象"cd"
        String x2 = new String("c") + new String("d");
        //常量池对象"cd"
        String x1 = "cd";
        //因为常量池中已经有了"ab"，因此x2入池失败，因此x1和x2不是同一个对象
        x2.intern();

        System.out.println(x1 == x2);//false
        //问：如果调换x1和x2的位置呢，jdk1.6呢
        //答：（String x1 = "cd";）和（x2.intern();）调换位置则返回ture，因为x2会先入池，此时池中的对象和堆中对象是一样的
        // 使用jdk1.6，再进行交换，返回的是false，
        // 因为jdk1.6不会直接把创建的堆对象直接入池，而是会做一个对象的副本入池，x2还是在堆中，x1中的"cd"是在池中的，因此这两个对象不相同
    }
}
