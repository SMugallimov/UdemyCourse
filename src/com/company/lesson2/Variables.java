package com.company.lesson2;

public class Variables {
    byte b1 = 12;
    byte b2 = 0b1100;
    byte b3 = 014;
    byte b4 = 0xC;

    short s1 = 1300;
    short s2 = 0b0101_0001_0100;
    short s3 = 02424;
    short s4 = 0x514;

    int i1 = 0;
    int i2 = 0b0;
    int i3 = 0;
    int i4 = 0x0;

    long l1 = 123456789;
    long l2 = 0b0111_0101_1011_1100_1101_0001_0101;
    long l3 = 0726_746_425;
    long l4 = 0x75B_CD15;

    double d1 = 2.5;
    double d2 = 45.1;

    float f1 = 8.5F;
    float f2 = 3.7F;

    boolean aBoolean = true;
    boolean isaBoolean = false;

    char c1 = 'A';
    char c2 = '\u0555';
    char c3 = 555;

    public void printByte() {
        System.out.println("Decimal: " + b1);
        System.out.println("Binary: " + b2);
        System.out.println("Octal: " + b3);
        System.out.println("Decimal: " + b4);
    }

    public void printShort() {
        System.out.println("Decimal: " + s1);
        System.out.println("Binary: " + s2);
        System.out.println("Octal: " + s3);
        System.out.println("Decimal: " + s4);
    }

    public void printInteger() {
        System.out.println("Decimal: " + i1);
        System.out.println("Binary: " + i2);
        System.out.println("Octal: " + i3);
        System.out.println("Decimal: " + i4);
    }

    public void printLong() {
        System.out.println("Decimal: " + l1);
        System.out.println("Binary: " + l2);
        System.out.println("Octal: " + l3);
        System.out.println("Decimal: " + l4);
    }

    public void printDouble() {
        System.out.println("Double 1: " + d1);
        System.out.println("Double 2: " + d2);
    }

    public void printFloat() {
        System.out.println("Float 1: " + f1);
        System.out.println("Float 2: " + f2);
    }

    public void printBoolean(){
        System.out.println("Boolean 1: " + aBoolean);
        System.out.println("Boolean 2: " + isaBoolean);
    }

    public void printChar(){
        System.out.println("Character 1: " + c1);
        System.out.println("Character 2: " + c2);
        System.out.println("Character 3: " + c3);
    }
}