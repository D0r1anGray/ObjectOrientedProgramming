package ru.gb.oseminar.pharmacy;

public class Component /*implements Comparable<Component>*/{
    private String name;
    private String weight;
    private int power;


    public Component(String name, String weight, int power) {
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Component{\n" +
                "\t\tname='" + name + '\'' + "\n" +
                "\t\tweight='" + weight + '\'' + "\n" +
                "\t\tpower=" + power + '\'' + "\n" +
                '}';
    }

//    @Override
//    public int compareTo(Component o) {
////        if(this.power > o.power) return 1;
////        if(this.power < o.power) return -1;
////        else return 0;
//        return Integer.compare(this.power, o.power); // по возрастанию
////        return Integer.compare(o.power, this.power); // по убыванию
//    }
}
