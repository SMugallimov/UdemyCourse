package com.company.homework9;

public class ObjectLifeTime {

    public static void test() {
        String string1 = new String("TEST1");
        String string2 = new String("TEST2");
    }
    public static void main(String[] args) {
        ObjectLifeTime objectLifeTime = new ObjectLifeTime();
        test();
        test();
        String string1 = new String("TEST1");
        test();
    }
}
