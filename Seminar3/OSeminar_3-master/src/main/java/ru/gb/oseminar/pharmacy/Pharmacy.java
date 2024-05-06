package ru.gb.oseminar.pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterator<Component> {
    private int index;
    private final List<Component> components;

    public Pharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public Component next() {
        return components.get(index++);
    }
}
