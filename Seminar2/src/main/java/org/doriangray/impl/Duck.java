package org.doriangray.impl;

import org.doriangray.Animal;
import org.doriangray.able.Flyable;
import org.doriangray.able.Swimable;

public class Duck extends Animal implements Flyable, Swimable/*, Goable*/ {

    public Duck(String name) {
        super(name);
    }

//    @Override
//    public void fly() {
//        System.out.println("Duck with name " + name +" can fly");
//    }
//    @Override
//    public void swim() {
//        System.out.println("Duck with name " + name +" can swim");
//    }
//    @Override
//    public void go() {
//        System.out.println("Duck with name "+ name +" can go") ;
//    }

//    @Override
//    public double run() {
//        return 0;
//    }

//    @Override
//    public double acceleration() {
//        return Goable.super.acceleration();
//    }

    @Override
    public double fly() {
        return 0;
    }

    @Override
    public double swim() {
        return 0;
    }

//    @Override
//    public double run(double a, double b) {
//        return 0;
//    }
}
