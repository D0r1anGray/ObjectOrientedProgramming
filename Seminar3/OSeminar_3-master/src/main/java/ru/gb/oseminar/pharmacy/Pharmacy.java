package ru.gb.oseminar.pharmacy;

import java.util.*;

public class Pharmacy implements Iterator<Component> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public void addComponents(Component ... components) {
        if(components.length == 0){
            throw new IllegalArgumentException("Components can't be null");
        }
        else{
            Collections.addAll(this.components, components); // добавляет все компоненты в список компонентов
        }
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        //Component c = components.get(index);
        //index++;
        //return c;
        return components.get(index++);
    }
}

