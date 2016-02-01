package golovach.functions.partial_functions.eta_expansion_java8;

import java.util.function.Function;

public class Java8Demo {

    public static int m(int x) { return x + 1;}

    public static void main(String[] args) {
        Function<Integer,Integer> f = Java8Demo::m;

        System.out.println(f.apply(5));
        set(Java8Demo::m);
    }

    public static void set(Function<Integer,Integer> func) {}
}
