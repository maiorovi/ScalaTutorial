package golovach.oop.fields;

import investigation.Reflector;

public class Person0DemoJ {

    public static void main(String[] args) {
        Reflector.reflect(Person0.class);

        Person0 person = new Person0();

        person.age_$eq(15);
    }
}
