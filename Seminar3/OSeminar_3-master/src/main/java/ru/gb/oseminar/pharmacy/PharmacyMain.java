package ru.gb.oseminar.pharmacy;

import java.util.*;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penicelin = new Component("Penicelin", "10mg", 100);
        Component salt = new Component("Salt", "20g", 10);
        Component sugar = new Component("Sugar", "87g", 10);
        Component azitronit = new Component("Azitronit", "5mg", 90);

//        Pharmacy pharmacy1 = new Pharmacy();
//        pharmacy1.addComponents(salt, penicelin);
//
//        Pharmacy pharmacy2 = new Pharmacy();
//        pharmacy2.addComponents(sugar, penicelin);
//
//        Iterator<Component> it = pharmacy2;
//
//        while(it.hasNext()){
//            //System.out.println(it.next());
//            System.out.println(pharmacy2.next());
//        }
        IterablePharmacy pharmacy1 = new IterablePharmacy(1);
        pharmacy1.addComponents(salt, penicelin, azitronit); // equals to pharmacy3

        IterablePharmacy pharmacy2 = new IterablePharmacy(2);
        pharmacy2.addComponents(azitronit, sugar);

        IterablePharmacy pharmacy3 = new IterablePharmacy(1);
        pharmacy3.addComponents(salt, penicelin, azitronit); // equals to pharmacy1

        IterablePharmacy pharmacy4 = new IterablePharmacy(3);
        pharmacy4.addComponents(salt, penicelin, azitronit, sugar); // equals to pharmacy2

        Set<IterablePharmacy> result = new HashSet<>();
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);
        System.out.println("Размер сета с уникальными компонентами = " + result.size());
//        System.out.println(pharmacy1.hashCode());
//        System.out.println(pharmacy2.hashCode());
//        System.out.println(pharmacy3.hashCode());
//        System.out.println(result);

        List<IterablePharmacy> list = new ArrayList<>();
        list.add(pharmacy1);
        list.add(pharmacy2);
        list.add(pharmacy3);
        list.add(pharmacy4);
        System.out.println("Лекарства до сортировки: \n" + list);
        Collections.sort(list);
        System.out.println("Сортировка по суммарной силе компонентов в лекарстве: \n" + list);


//        for(Component component : pharmacy2){
//            System.out.println(component);
//        }

//        List<Component> list = List.of(penicelin, salt, sugar);
//        Collections.sort(list);
//        System.out.println(list); //Error UnsupportedOperationException
//        List<Component> list = new ArrayList<>();
//        list.add(penicelin);
//        list.add(salt);
//        list.add(sugar);
//
//        Collections.sort(list);
//        System.out.println(list);
    }
}
