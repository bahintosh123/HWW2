package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Hooman";
        int age = 25;
        int temperature = 13;
        if ((temperature < 30 && temperature > -20) && (age >= 20 && age <= 45)) {
            System.out.println(name + " goes for a walk");
        } else if ((age < 20 && temperature > 0) && (temperature < 28)) {
            System.out.println(name + " goes for a walk");
        } else if ((age > 45) && (temperature >-10) && (temperature <25)) {
            System.out.println(name + " goes for a walk");
        }
    }}




