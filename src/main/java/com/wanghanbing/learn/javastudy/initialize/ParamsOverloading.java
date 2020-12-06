package com.wanghanbing.learn.javastudy.initialize;

public class ParamsOverloading {


    public void print(int count) {
        System.out.println("print int count:" + count);
    }

    public void print(String count) {
        System.out.println("print string count:" + count);
    }


    public void print(int count, String string) {
        System.out.println("print count:" + count + ", string:" + string);
    }

    public static void main(String[] args) {
        ParamsOverloading paramsOverloading = new ParamsOverloading();
        paramsOverloading.print(10);
        paramsOverloading.print("8888");
        paramsOverloading.print(100,"9999");
    }
}