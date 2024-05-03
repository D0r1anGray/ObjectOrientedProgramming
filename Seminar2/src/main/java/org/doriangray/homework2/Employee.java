package org.doriangray.homework2;

import org.doriangray.homework2.able.Vaccinable;

public abstract class Employee implements Vaccinable {
    protected Employee post;
    protected String name;
    protected int age;
    protected char gender;
    protected double salary;

    public Employee(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "post=" + post +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    private void setPost(Employee post) {
        this.post = post;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setGender(char gender) {
        this.gender = gender;
    }

    private void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getPost() {
        return post;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }
}
