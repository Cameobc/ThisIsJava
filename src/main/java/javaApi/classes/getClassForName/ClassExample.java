package javaApi.classes.getClassForName;

import classes.Car;
import classes.CarExample;

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car();
        Class clazz1 = car.getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        System.out.println(clazz1.getPackage().getName());

        try{
            Class clazz2 = Class.forName()
        }
    }
}
