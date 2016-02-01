package golovach.functions.partial_functions.eta_expansion_java8;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo1 {
    public String m_instance(int x) { return String.valueOf(x);}
    public static String m_static(int x) {return String.valueOf(x);}

    public static void main(String[] args) {
        Function<Integer, String> f0 = Demo1::m_static;
        Function<Integer, String> f1 = new Demo1()::m_instance;

        BiFunction<Demo1, Integer, String> biFunc0 = Demo1::m_instance;
    }
}
