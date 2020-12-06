package com.wanghanbing.learn.javastudy.initialize;

public class PrimitiveOverloading {

    void f1(char x) {System.out.print("f1(char)");}
    void f1(byte x) {System.out.print("f1(byte)");}
    void f1(short x) {System.out.print("f1(short)");}
    void f1(int x) {System.out.print("f1(int)");}
    void f1(long x) {System.out.print("f1(long)");}
    void f1(float x) {System.out.print("f1(float)");}
    void f1(double x) {System.out.print("f1(double)");}

    void f2(byte x) {System.out.print("f2(byte)");}
    void f2(short x) {System.out.print("f2(short)");}
    void f2(int x) {System.out.print("f2(int)");}
    void f2(long x) {System.out.print("f2(long)");}
    void f2(float x) {System.out.print("f2(float)");}
    void f2(double x) {System.out.print("f2(double)");}

    void f3(short x) {System.out.print("f3(short)");}
    void f3(int x) {System.out.print("f3(int)");}
    void f3(long x) {System.out.print("f3(long)");}
    void f3(float x) {System.out.print("f3(float)");}
    void f3(double x) {System.out.print("f3(double)");}

    void f4(int x) {System.out.print("f4(int)");}
    void f4(long x) {System.out.print("f4(long)");}
    void f4(float x) {System.out.print("f4(float)");}
    void f4(double x) {System.out.print("f4(double)");}

    void f5(long x) {System.out.print("f5(long)");}
    void f5(float x) {System.out.print("f5(float)");}
    void f5(double x) {System.out.print("f5(double)");}

    void f6(float x) {System.out.print("f6(float)");}
    void f6(double x) {System.out.print("f6(double)");}

    void f7(double x) {System.out.print("f7(double)");}

    void testConstVal() {
        System.out.print("5: ->");
        f1(5); f2(5); f3(5); f4(5); f5(5); f6(5); f7(5);
        System.out.println();
    }

    void testChar() {
        System.out.print("c: x->");
        char b = 'x';
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testByte() {
        System.out.print("b: 0->");
        byte b = 0;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testShort() {
        System.out.print("short: 10->");
        short b = 10;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testInt() {
        System.out.print("int: 99->");
        int b = 99;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testLong() {
        System.out.print("long: 999->");
        long b = 999;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testFloat() {
        System.out.print("float: 88->");
        float b = 88;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }

    void testDouble() {
        System.out.print("double: 99->");
        double b = 88;
        f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
        System.out.println();
    }


    public static void main(String[] args) {
        PrimitiveOverloading overloading = new PrimitiveOverloading();
        overloading.testConstVal();
        overloading.testChar();
        overloading.testByte();
        overloading.testShort();
        overloading.testInt();
        overloading.testLong();
        overloading.testFloat();
        overloading.testDouble();
    }

}