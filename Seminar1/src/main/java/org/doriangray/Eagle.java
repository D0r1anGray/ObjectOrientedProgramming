package org.doriangray;

import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal{
    public Eagle(String name, LocalDate birthDate, List<String> vaccine, String illnes, String ownerName) {
        super(name, birthDate, vaccine, illnes, ownerName);
    }
}
