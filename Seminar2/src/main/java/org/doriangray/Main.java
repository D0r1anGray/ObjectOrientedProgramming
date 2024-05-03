package org.doriangray;

import org.doriangray.homework2.Employee;
import org.doriangray.homework2.impl.Doctor;
import org.doriangray.homework2.impl.Nurse;
import org.doriangray.impl.Cat;
import org.doriangray.impl.Duck;
import org.doriangray.impl.Eagle;
import org.doriangray.impl.Snake;

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


////        Animal animal = new Animal() {  //Создание анонимного класса, так как есть нереализованный абстрактный метод
////            @Override
////            public void lifeCycle() {
////
////            }
////        };
//
//        System.out.println("Actions with eagle:");
//        eagle.fly();
////        eagle.swim();
//        eagle.run();
//        System.out.println("----------------------");
//
//        System.out.println("Actions with cat:");
////        cat.fly();
////        cat.swim();
////        cat.go();
//        cat.run();
//        System.out.println("----------------------");
//
//        System.out.println("Actions with snake:");
////        snake.fly();
////        snake.swim();
////        snake.go();
//        System.out.println("----------------------");
//
//        System.out.println("Actions with duck:");
//        duck.fly();
//        duck.swim();
////        duck.go();
//        System.out.println("----------------------");
//
////        Goable goable = new Goable() {
////            @Override
////            public double run() {
////                return 2+2;
////            }
////        };
//
////        Goable goable1 = () -> 2+2; //Абстрактный класс в виде лямбды.
////        Goable goable2 = (x, y) -> x + y;
////        System.out.println(goable2.run(2,4)); //Вызов лямбды
////        Goable goable3 = Double::sum; //Замена x+y на метод sum в классе Double
//
////        System.out.println(eagle.type); // Получение типа класса объекта. type был прописан в Animal
////        System.out.println(cat.type);
//        Clinic clinic = new Clinic();
//        clinic.addSeveralPatients(eagle, cat, snake, duck);
//        System.out.println(clinic.getPatients()); //Получение списка пациентов
//        System.out.println(clinic.getGoables());
        Doctor doctor = new Doctor("Иван", 48, 'М', 150_000D);
        Nurse nurse = new Nurse("Лиза", 22, 'Ж', 30_000D);

        doctor.getDiagnosis(eagle);
        doctor.getDiagnosis(cat);
        doctor.getDiagnosis(snake);
        doctor.getDiagnosis(duck);

        System.out.println("----------------------");

        doctor.setVaccine(eagle);
        doctor.setVaccine(cat);
        doctor.setVaccine(snake);
        doctor.setVaccine(duck);

        System.out.println("----------------------");

        doctor.instruct(nurse, eagle);
        doctor.instruct(nurse, cat);
        doctor.instruct(nurse, snake);
        doctor.instruct(nurse, duck);

        System.out.println("----------------------");

        nurse.setVaccine(eagle);
        nurse.setVaccine(cat);
        nurse.setVaccine(snake);
        nurse.setVaccine(duck);
    }
}