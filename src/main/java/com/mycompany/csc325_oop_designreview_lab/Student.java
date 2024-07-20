/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

public class Student extends Human {
    private double gpa;
    private String address;

    // Constructor
    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Implement getAddress() method
    @Override
    public String getAddress() {
        return address;
    }

    // Implement setAddress() method
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Student{name=" + getName() + ", age=" + getAge() + ", gpa=" + gpa + ", address=" + address + "}";
    }
}
