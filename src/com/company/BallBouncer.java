package com.company;

public class BallBouncer {

    public static void main(String[] args){
        Ball b1 = new Ball();
        b1.setColor("Red");
        b1.setSizeInCm(15);

        Ball b2 = new Ball();
        b2.setColor("Yellow");
        b2.setSizeInCm(20);

        Ball b3 = new Ball();
        b3.setColor("Green");
        b3.setSizeInCm(10);
        System.out.println(b1.getColor() + " " + b1.getSizeInCm());
        System.out.println(b2.getColor() + " " + b2.getSizeInCm());
        System.out.println(b3.getColor() + " " + b3.getSizeInCm());
    }
}
