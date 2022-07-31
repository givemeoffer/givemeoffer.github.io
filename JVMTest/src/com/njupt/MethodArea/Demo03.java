package com.njupt.MethodArea;

public class Demo03 {
    //串池：["ab","a","b"]
    public static void main(String[] args) {

        String x = "ab";
        //此时字符串 "ab" 并没有放入到串池中，只放入到了堆当中
        String s = new String("a") + new String("b"); // new String("ab")--> 暂时放入堆中，没放入串池中
        //想要放入到串池中，则需要调用 intern() 方法
        //将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池中，会把串池中的对象返回
        //调用 s 的 intern 方法，因为串池中有了 "ab" ，因此调用该方法失败，此时在堆中的 "ab" 和在串池中的 "ab" 不是同一个对象，因此s==x-->false
        //但是 s2 返回的是串池中的对象，因此 s2 中的 "ab" 和 x 中的 "ab" 相同
        String s2 = s.intern();

        System.out.println(s == x);//false
        System.out.println(s2 == x);//true
    }
}
