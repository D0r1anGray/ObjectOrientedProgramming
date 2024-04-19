package org.doriangray;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal barsik = new Cat("Barsik",
                LocalDate.of(2024, 12,2),
                new ArrayList<>(),
                "Chumka", "Galimov", 4);
        Animal eagle = new Eagle("Eagle", LocalDate.of(2024, 7,22),
                new ArrayList<>(),
                "Chumka", "Galimov");

        List<Animal> animals = new ArrayList<>();

        animals.add(barsik);
        animals.add(eagle);

    }
}