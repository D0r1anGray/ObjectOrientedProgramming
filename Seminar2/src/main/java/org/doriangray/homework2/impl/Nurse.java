package org.doriangray.homework2.impl;

import org.doriangray.Animal;
import org.doriangray.homework2.Employee;
import org.doriangray.homework2.able.Vaccinable;

public class Nurse extends Employee implements Vaccinable {

    public Nurse(String name, int age, char gender, double salary){
        super(name, age, gender, salary);
    }


    @Override
    public boolean setVaccine(Animal animal) {
        if(animal.isVaccinated()){
            System.out.println("Animal " + animal.getClass().getSimpleName() + " has already been vaccinated");
            return false;
        }
        else{
            if(animal.diagnosis){
                System.out.println("Nurse give the injection to the animal " + animal.getClass().getSimpleName());
                animal.setVaccinated(true);
                return true;
            }
        }
        return false;
    }
}
