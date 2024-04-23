package org.doriangray;

@FunctionalInterface //Пометили интерефейс функциональным.
public interface Goable { //Интерфейсы описывают поведение объектов
    public final static int i = 0; //Значение по умолчанию в интерфейсах.
    double run(double a, double b);

    default double acceleration(){ // default метод. Может быть, может не быть.
        return 9.8;
    }
}
