package com.njupt.ClassFileStructure.translater;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo04 {
    public static void main(String[] args) throws NoSuchMethodException {
        // 1. 拿到方法
        Method method = Candy3.class.getMethod("test", List.class, Map.class);
        // 2. 得到泛型参数的类型信息
        Type[] types = method.getGenericParameterTypes();
        for(Type type : types) {
            // 3. 判断参数类型是否，带泛型的类型。
            if(type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                // 4. 得到原始类型
                System.out.println("原始类型 - " + parameterizedType.getRawType());
                // 5. 拿到泛型类型
                Type[] arguments = parameterizedType.getActualTypeArguments();
                for(int i = 0; i < arguments.length; i++) {
                    System.out.printf("泛型参数[%d] - %s\n", i, arguments[i]);
                }
            }
        }
    }

    public Set<Integer> test(List<String> list, Map<Integer, Object> map) {
        return null;
    }
}
