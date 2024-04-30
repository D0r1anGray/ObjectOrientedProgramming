package org.doriangray;

import java.time.LocalDate;
import java.util.List;

public abstract class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccine;
    protected String illnes;
    protected String ownerName;

    protected String type;

    public Animal(String name, LocalDate birthDate, List<String> vaccine, String illnes, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccine = vaccine;
        this.illnes = illnes;
        this.ownerName = ownerName;
        this.type = getClass().getSimpleName(); //Получение типа класса
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getVaccine() {
        return vaccine;
    }

    public String getIllnes() {
        return illnes;
    }

    public String getOwnerName() {
        return ownerName;
    }

    private void wakeup(){
        System.out.println("Animal is wakeup");
    }
    private void wakeup(int time){
        System.out.println("Animal is wakeup at " + time);
    }

    private void eat(){
        System.out.println("Animal is eating");
    }
    private void play(){
        System.out.println("Animal is playing");
    }
    private void sleep(){
        System.out.println("Animal is sleeping");
    }

    //public abstract void lifeCycle(); //Жизненный цикл должны описать наследники
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", vaccine=" + vaccine +
                ", illnes='" + illnes + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
