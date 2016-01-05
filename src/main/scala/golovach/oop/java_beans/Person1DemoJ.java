package golovach.oop.java_beans;

import investigation.Reflector;

public class Person1DemoJ {

    public static void main(String[] args) {
        Reflector.reflect(Person1.class);

        // 1. scala style accessor and mutator exists
        Person1 person = new Person1();

        person.age_$eq(person.age() + 1);

        //2. also there is java style accessor and mutator

        person.setAge(person.getAge() + 1);

    }
}
