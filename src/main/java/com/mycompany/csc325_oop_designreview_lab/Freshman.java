package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    public Freshman(String name, short age, double gpa) {
        super(name, age, gpa);
    }

    @Override
    public String toString() {
        return "Freshman{name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + "}";
    }
}
