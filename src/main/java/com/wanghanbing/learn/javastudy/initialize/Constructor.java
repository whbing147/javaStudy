package com.wanghanbing.learn.javastudy.initialize;

public class Constructor {

    public void print() {
        System.out.println("print constructor method!");
    }

    public static void main(String[] args) {
        Constructor constructor = new Constructor();
        constructor.print();
    }
}