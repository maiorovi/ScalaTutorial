package golovach.oop.fields;

import investigation.Reflector;

public class Person1DemoJ {
    public static void main(String[] args) {
        Reflector.reflect(Person1.class);
        Person1 person = new Person1();
    }
}
