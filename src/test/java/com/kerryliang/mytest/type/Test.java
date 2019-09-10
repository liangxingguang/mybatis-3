package com.kerryliang.mytest.type;

import org.apache.ibatis.type.TypeException;
import org.apache.ibatis.type.TypeReference;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Test {

    @org.junit.jupiter.api.Test
    public void test1(String[] args) {
        System.out.println("Student.class.getSuperclass()\t"
                + Student.class.getSuperclass());
        System.out.println("Student.class.getGenericSuperclass()\t"
                + Student.class.getGenericSuperclass());

        System.out.println("Li.class.getSuperclass()\t"
                + Li.class.getSuperclass());
        System.out.println("Li.class.getGenericSuperclass()\t"
                + Li.class.getGenericSuperclass());

        System.out.println("Test.class.getSuperclass()\t"
                + Test.class.getSuperclass());
        System.out.println("Test.class.getGenericSuperclass()\t"
                + Test.class.getGenericSuperclass());

        System.out.println("Object.class.getGenericSuperclass()\t"
                + Object.class.getGenericSuperclass());
        System.out.println("Object.class.getSuperclass()\t"
                + Object.class.getSuperclass());

        System.out.println("void.class.getSuperclass()\t"
                + void.class.getSuperclass());
        System.out.println("void.class.getGenericSuperclass()\t"
                + void.class.getGenericSuperclass());

        System.out.println("Class.class.getSuperclass()\t"
                + Class.class.getSuperclass());
        System.out.println("Class.class.getGenericSuperclass()\t"
                + Class.class.getGenericSuperclass());

        System.out.println("Li2.class.getSuperclass()\t"
                + Li2.class.getSuperclass());
        System.out.println("Li2.class.getGenericSuperclass()\t"
                + Li2.class.getGenericSuperclass());

        System.out.println("Li3.class.getSuperclass()\t"
                + Li3.class.getSuperclass());
        System.out.println("Li3.class.getGenericSuperclass()\t"
                + Li3.class.getGenericSuperclass());

        System.out.println("Li4.class.getSuperclass()\t"
                + Li4.class.getSuperclass());
        System.out.println("Li4.class.getGenericSuperclass()\t"
                + Li4.class.getGenericSuperclass());

        System.out.println("int[].class.getSuperclass()\t"
                + int[].class.getSuperclass());
        System.out.println("int[].class.getGenericSuperclass()\t"
                + int[].class.getGenericSuperclass());
    }

    @org.junit.jupiter.api.Test
    public void Test2() {
//        System.out.println("int[].SuperclassType\t"
//                + getSuperclassTypeParameter(int[].class));
//        System.out.println("Person.SuperclassType\t"
//                + getSuperclassTypeParameter(Person.class));
        System.out.println("Student.SuperclassType\t"
                + getSuperclassTypeParameter(Student.class));
        System.out.println("Li4].SuperclassType\t"
                + getSuperclassTypeParameter(Li4.class));

        System.out.println("Li3.SuperclassType\t"
                + getSuperclassTypeParameter(Li3.class));

        System.out.println("Li.SuperclassType\t"
                + getSuperclassTypeParameter(Li.class));
    }

    public Type getSuperclassTypeParameter(Class<?> clazz) {
        //获取泛型父类的类型
        Type genericSuperclass = clazz.getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            // try to climb up the hierarchy until meet something useful
            if (TypeReference.class != genericSuperclass) {
                return getSuperclassTypeParameter(clazz.getSuperclass());
            }

            throw new TypeException("'" + clazz + "' extends TypeReference but misses the type parameter. "
                    + "Remove the extension or add a type parameter to it.");
        }

        Type rawType = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
        // TODO remove this when Reflector is fixed to return Types
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType) rawType).getRawType();
        }

        return rawType;
    }

}

class Person<T> {

}
class Student extends Person<Test> {

}
class Li extends Student {

}
class Li2<Class> {
}
class Li3 extends Person<Class> {
}
class Li4 extends TypeReference {

}
