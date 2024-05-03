package org.doriangray.impl;

import org.doriangray.Animal;
import org.doriangray.able.Flyable;
import org.doriangray.able.Goable;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal implements Flyable, Goable {
    public Eagle(String name, LocalDate birthDate, String illnes, String ownerName) {
        super(name, birthDate, illnes, ownerName);
    }
    public Eagle(String name){
        super(name);
    }

    @Override
    public double fly() {
        System.out.printf("Animal %s can fly with speed: ", type);
        return 20D;
    }

    @Override
    public double run(){
        System.out.printf("Animal %s can run with speed: ", type);
        return 6D;
    }


//    @Override
//    public void fly(){
//        System.out.println("Eagle with name "+ name +" can fly");
//    }
}
