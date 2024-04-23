package org.doriangray.impl;

import org.doriangray.Animal;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal {
    public Eagle(String name, LocalDate birthDate, List<String> vaccine, String illnes, String ownerName) {
        super(name, birthDate, vaccine, illnes, ownerName);
    }
    public Eagle(String name){
        super(name);
    }

    @Override
    public void fly(){
        System.out.println("Eagle with name "+ name +" can fly");
    }
}
