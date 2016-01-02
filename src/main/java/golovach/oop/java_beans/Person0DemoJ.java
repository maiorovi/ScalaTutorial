package golovach.oop.java_beans;

import investigation.Reflector;

public class Person0DemoJ {
    public static void main(String[] args) {
        Reflector.reflect(Person0.class);
        Person0 person0 = new Person0();

        person0.getAge();

        person0.setAge(10);
    }
}
