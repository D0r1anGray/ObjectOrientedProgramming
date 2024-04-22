package org.doriangray;

import java.time.LocalDate;
import java.util.List;

public class Duck extends Animal{

    public Duck(String name) {
        super(name);
    }

    @Override
    protected void fly() {
        System.out.println("Duck with name " + name +" can fly");
    }
    @Override
    protected void swim() {
        System.out.println("Duck with name " + name +" can swim");
    }
    @Override
    protected void go() {
        System.out.println("Duck with name "+ name +" can go") ;
    }
}
