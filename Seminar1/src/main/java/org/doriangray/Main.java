package org.doriangray;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal barsik = new Cat("Barsik",
//                LocalDate.of(2024, 12,2),
//                new ArrayList<>(),
//                "Chumka", "Galimov", 4);
//        Animal eagle = new Eagle("Eagle", LocalDate.of(2024, 7,22),
//                new ArrayList<>(),
//                "Chumka", "Galimov");
//
//        List<Animal> animals = new ArrayList<>();
//
//        animals.add(barsik);
//        animals.add(eagle);
//
//        //eagle.wakeup();
//        //eagle.wakeup(2);
//        System.out.println("----------------------");
//
////        barsik.wakeup();
////        barsik.sleep();
////        barsik.eat();
////        barsik.play();
//        barsik.lifeCycle();
        Eagle eagle = new Eagle("Eagly");
        Cat cat = new Cat("Kitty");
        Snake snake = new Snake("Snaky");
        Duck duck = new Duck("Ducky");

        System.out.println("Actions with eagle:");
        eagle.fly();
        eagle.swim();
        eagle.go();
        System.out.println("----------------------");

        System.out.println("Actions with cat:");
        cat.fly();
        cat.swim();
        cat.go();
        System.out.println("----------------------");

        System.out.println("Actions with snake:");
        snake.fly();
        snake.swim();
        snake.go();
        System.out.println("----------------------");

        System.out.println("Actions with duck:");
        duck.fly();
        duck.swim();
        duck.go();
        System.out.println("----------------------");
    }
}