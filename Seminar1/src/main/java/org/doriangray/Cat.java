package org.doriangray;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Animal{

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

    public int getLegsCount() {
        return legsCount;
    }
}
