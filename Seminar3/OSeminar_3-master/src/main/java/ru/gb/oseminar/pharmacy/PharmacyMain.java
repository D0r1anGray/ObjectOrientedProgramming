package ru.gb.oseminar.pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PharmacyMain {
    public static void main(String[] args) {
        Component penicelin = new Component("Penicelin", "10mg", 100);
        Component salt = new Component("Salt", "20g", 10);
        Component sugar = new Component("Sugar", "87g", 80);

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
        IterablePharmacy pharmacy1 = new IterablePharmacy();
        pharmacy1.addComponents(salt, penicelin);

        IterablePharmacy pharmacy2 = new IterablePharmacy();
        pharmacy2.addComponents(sugar, penicelin);

        for(Component component : pharmacy2){
            System.out.println(component);
        }

//        List<Component> list = List.of(penicelin, salt, sugar);
//        Collections.sort(list);
//        System.out.println(list); //Error UnsupportedOperationException
        List<Component> list = new ArrayList<>();
        list.add(penicelin);
        list.add(salt);
        list.add(sugar);

        Collections.sort(list);
        System.out.println(list);
    }
}
