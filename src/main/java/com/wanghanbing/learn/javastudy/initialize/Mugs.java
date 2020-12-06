package com.wanghanbing.learn.javastudy.initialize;


class Cpu {
    public Cpu(int coreCount) {
        System.out.println("Cpu(" + coreCount + ")");
    }

    public void print() {
        System.out.println("Cpu print");
    }
}

class Mug {



    public static Cpu cpu0 = new Cpu(0);

    static {
        Cpu cpu1 = new Cpu(1);
    }

    public static Cpu cpu1;

    {
        cpu3 = new Cpu(3);
    }

    private Cpu cpu2 = new Cpu(2);

    private Cpu cpu3;

    public Mug() {
        System.out.println("Mug()");
    }

    {
        cpu3 = new Cpu(5);
    }

    public Cpu getCpu2 () {
        return cpu2;
    }

    public void print(int market) {
        System.out.println("Mug print1 " + market + ")");
    }

    public void print(Integer market) {
        System.out.println("Mug print2 " + market + ")");
    }

}


public class Mugs {
    public static void main(String[] args) {
        Mug  mug  = new Mug();
        mug.getCpu2().print();

        mug.print(new Integer(22));
    }

    private static Cpu cpu  = new Cpu(10);

}