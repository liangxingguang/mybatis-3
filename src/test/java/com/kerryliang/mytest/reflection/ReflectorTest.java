package com.kerryliang.mytest.reflection;

import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.Reflector;
import org.apache.ibatis.reflection.ReflectorFactory;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReflectorTest {

    class A {
        private String name1;
        private String name2;

        private List<String> nameList;

        public A() {

        }

        public A(String name1) {
            this.name1 = name1;
        }

        public A(String name1, String name2) {
            this.name1 = name1;
            this.name2 = name2;
        }

        public String getName1() {
            return name1;
        }

        public void setName1(String name1) {
            this.name1 = name1;
        }

        public String getName2() {
            return name2;
        }

        public void setName2(String name2) {
            this.name2 = name2;
        }

        public List<String> getNameList() {
            return nameList;
        }

        public void setNameList(List<String> nameList) {
            this.nameList = nameList;
        }
    }

    class B extends A {

        public B(String name1) {
        }

        public ArrayList<String> getNameList() {
            return new ArrayList<>();
        }



    }

    @Test
    public void testDefaultConstructor() {
        ReflectorFactory reflectorFactory = new DefaultReflectorFactory();
        Reflector reflector = reflectorFactory.findForClass(B.class);
        assertEquals(true, reflector.hasDefaultConstructor());
    }
}
