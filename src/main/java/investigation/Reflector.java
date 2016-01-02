package investigation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflector {

    public static <T> void reflect(Class<T> obj) {
        //printing fields
        System.out.println("FIELDS:");
        for (Field field : obj.getDeclaredFields()) {
            System.out.println(field.toGenericString());
        }
        System.out.println();
        //printing methods
        System.out.println("METHODS:");
        for (Method method : obj.getDeclaredMethods()) {
            System.out.println(method.toString());
        }
        System.out.println();

        System.out.println("EXTENDED CLASS:");
        System.out.println(obj.getSuperclass().toString());
        System.out.println();

        System.out.println("IMPLEMENTED INTERFACES:");
        for( Class inter :obj.getInterfaces()) {
            System.out.println(inter.getCanonicalName());
        }
        System.out.println();

        System.out.println("CONSTRUCTORS");
        for(Constructor constructor : obj.getConstructors()) {
            System.out.println(constructor.toString());
        }
    }
}
