package org.doriangray.impl;

import org.doriangray.Animal;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Duck with name " + name +" can fly");
    }
    @Override
    public void swim() {
        System.out.println("Duck with name " + name +" can swim");
    }
    @Override
    public void go() {
        System.out.println("Duck with name "+ name +" can go") ;
    }
}
