package ru.gb.oseminar.pharmacy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterablePharmacy implements Iterable<Component> {
    private int index;
    private final List<Component> components;

    public IterablePharmacy() {
        this.index = 0;
        this.components = new ArrayList<>();
    }

    public List<Component> getComponents() {
        return components;
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
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

//    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }
}
