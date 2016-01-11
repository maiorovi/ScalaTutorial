package oderskybook;

public class ParametersInJava {

    public static void main(String[] args) {
        System.out.println(delayed(nano()));
    }

    public static long nano() {
        System.out.println("getting nano time:");
        return System.nanoTime();
    }

    public static long delayed(long time) {
        System.out.println("In delayed method");
        System.out.println("Param: " + time);

        return time;
    }
}
