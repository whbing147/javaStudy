package com.wanghanbing.learn.javastudy.initialize;

class Person {
    public void eat(Apple apple) {
        Apple peelered =  apple.getPeeler();
        System.out.println("eat haha");
    }
}

class Peeler {
    public static Apple peel(Apple apple) {
        // remove apple and return apple
        System.out.println("removed and return");
        return apple;
    }
}

class Apple {
    Apple getPeeler() {
        return Peeler.peel(this);
    }
}

public class PassingThis {

    public static void main(String[] args) {
        Person person = new Person();
        Apple apple = new Apple();
        person.eat(apple);
    }
}