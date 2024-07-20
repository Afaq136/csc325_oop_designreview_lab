package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    private static final int MIN_CREDITS = 85;
    private int credits;

    public Senior(String name, short age, double gpa, int credits) {
        super(name, age, gpa);
        if (credits < MIN_CREDITS) {
            throw new IllegalArgumentException("Senior must have at least 85 credits.");
        }
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Senior{name=" + getName() + ", age=" + getAge() + ", gpa=" + getGpa() + ", credits=" + credits + "}";
    }
}
