package org.doriangray.impl;

import org.doriangray.Animal;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal {

    private int legsCount;
    public Cat(String name,
               LocalDate birthDate,
               List<String> vaccine,
               String illnes,
               String ownerName,
               int legsCount) {
        super(name, birthDate, vaccine, illnes, ownerName);
        this.legsCount = legsCount;
    }
    public Cat(String name){
        super(name);
    }
    @Override
    public void go(){
        System.out.println("Cat with name " +  name + " can go");
    }

    public int getLegsCount() {
        return legsCount;
    }
}
