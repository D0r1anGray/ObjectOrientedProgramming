package org.doriangray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Clinic{
    private List<Animal> patients = new ArrayList<>();
    public void addPatirnt(Animal animal){
        patients.add(animal);
    }
    public void addSeveralPatients(Animal ... animals) {
//        for (Animal animal : animals) { //Добавление в список через for
//            patients.add(animal);
//        }
        Collections.addAll(patients, animals); //Collections - интерфейс
    }

    public List<Goable> getGoables() {
        List<Goable> goables = new ArrayList<>(patients.size());
        for(Animal animal: patients){
            if(animal instanceof Goable){ // Содержит ли тип Goable?
                goables.add((Goable)animal);
            }
        }
        return goables;
    }

    public List<Animal> getPatients() {
        return patients;
    }
}