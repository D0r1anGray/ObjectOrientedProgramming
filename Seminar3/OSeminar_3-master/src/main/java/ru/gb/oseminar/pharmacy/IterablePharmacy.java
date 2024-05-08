package ru.gb.oseminar.pharmacy;

import java.util.*;

public class IterablePharmacy implements Iterable<Component>, Comparable<IterablePharmacy>{
    private int id;
    private int index;
    private int sumpower;
    private final List<Component> components;

    public IterablePharmacy(int id) {
        this.id = id;
        this.index = 0;
        this.components = new ArrayList<>();
        this.sumpower = this.set_sumpower();
    }

    private int set_sumpower() {
        for(Component component: components) {
            sumpower += component.getPower();
        }
        return sumpower;
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

//    @Override
//    public boolean equals(Object o) {
//        if(o == null){
//            return false;
//        }
//        if(!(o instanceof IterablePharmacy)){
//            return false;
//        }
//        if(o == this){
//            return true;
//        }
//        return this.components.equals(((IterablePharmacy) o).components);
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        IterablePharmacy that = (IterablePharmacy) o;
//        return Objects.equals(components, that.components);
//    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof IterablePharmacy)){
            return false;
        }
        if(obj == this){
            return true;
        }
        return this.id == ((IterablePharmacy) obj).id;
    }

    @Override
    public int hashCode() {
        return id;
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

    @Override
    public String toString() {
        return "\nIterablePharmacy{\n" +
                "\tcomponents=" + components +
                '}';
    }

    @Override
    public int compareTo(IterablePharmacy o) {
//        if(sumpower > o.sumpower){
//            return 1;
//        }
//        if(sumpower < o.sumpower){
//            return -1;
//        }
//        else{
//            return 0;
//        }
        return Integer.compare(sumpower, o.sumpower);
    }

    //    @Override
//    public Iterator<Component> iterator() {
//        return new ComponentIterator(this);
//    }
}
