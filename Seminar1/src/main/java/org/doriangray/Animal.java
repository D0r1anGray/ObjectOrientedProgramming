package org.doriangray;

import java.time.LocalDate;
import java.util.List;

public class Animal {
    protected String name;
    protected LocalDate birthDate;
    protected List<String> vaccine;
    protected String illnes;
    protected String ownerName;

    public Animal(String name, LocalDate birthDate, List<String> vaccine, String illnes, String ownerName) {
        this.name = name;
        this.birthDate = birthDate;
        this.vaccine = vaccine;
        this.illnes = illnes;
        this.ownerName = ownerName;
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
