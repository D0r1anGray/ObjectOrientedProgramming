package org.doriangray.homework2.impl;

import org.doriangray.*;
import org.doriangray.homework2.Employee;
import org.doriangray.homework2.able.Diagnosable;
import org.doriangray.homework2.able.Vaccinable;

import java.util.Random;

public class Doctor extends Employee implements Diagnosable, Vaccinable {
    //todo Сдедать поручение медсестре на установку вакцины. То есть на вход переменная типа медсестра
//    private boolean instruction;
//
//    private void setInstruction(boolean instruction) {
//        this.instruction = instruction;
//    }
//
//    public boolean getInstruction() {
//        return instruction;
//    }


    public Doctor(String name, int age, char gender, double salary) {
        super(name, age, gender, salary);
    }

    @Override
    public void getDiagnosis(Animal animal) {
        Random random = new Random();
        int rand = random.nextInt(2);
        if (rand == 0) {
            System.out.println("Doctor diagnoses animal " + animal.getClass().getSimpleName() + " and does not find illness");
            animal.diagnosis = false;
//            return false;
        } else {
            System.out.println("Doctor diagnoses animal " + animal.getClass().getSimpleName() + " and finds illness");
            animal.diagnosis = true;
//            return true;
        }
    }

    @Override
    public void instruct(Nurse nurse, Animal animal) {
//        setInstruction(true);
        if (animal.diagnosis) {
            System.out.println("Doctor gives instruction to nurse " + nurse.getName() + " to vaccinate animal "
                    + animal.getClass().getSimpleName());
            nurse.setVaccine(animal);
        }
    }


    @Override
    public boolean setVaccine(Animal animal) {
        if (animal.diagnosis) {
            if (animal.isVaccinated()) {
                System.out.println("Doctor is busy now. He instructed the nurse to give the injection");
                return false;
            }
            System.out.println("Doctor give the injection to the animal " + animal.getClass().getSimpleName());
            animal.setVaccinated(true);
            return true;
        }
        System.out.println("Animal cannot be vaccinated");
        return false;
    }
}
