

@FunctionalInterface

public interface Flyable <T>{
    public int a = 10;
    void method();


    public static void method2(){
        System.out.println("syimyk");
    }
    default void method3(){
        System.out.println("Javascript");
    }

    default void method4() {
    }

    default void method10() {
    }
}
