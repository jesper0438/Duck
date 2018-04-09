package com.company;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithRyanair();
        quackBehavior = new Quack();
    }
    public void display() {
        System.out.println("i'm a model duck");
    }
}
