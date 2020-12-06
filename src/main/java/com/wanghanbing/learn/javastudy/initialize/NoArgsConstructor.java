package com.wanghanbing.learn.javastudy.initialize;

public class NoArgsConstructor {

    public NoArgsConstructor() {
        System.out.println("NoArgsConstructor object createed");
    }

    public void print() {
        System.out.println("print constructor method!");
    }

    public static void main(String[] args) {
        NoArgsConstructor constructor = new NoArgsConstructor();
        constructor.print();
    }
}