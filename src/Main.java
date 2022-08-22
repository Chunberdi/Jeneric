import java.util.Collections;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Ananimnyi class > бул бир еле жолу колдонулат
     Flyable fly = new Flyable() {
            @Override
            public void method() {
                System.out.println("salam");

            }
        };
         fly.method();







        //-> бул лямда
        Flyable flyable1 = ()->System.out.println("Python");
        Flyable flyable2 = () -> System.out.println("Cc1");

        flyable1.method();
        flyable2.method();

        Plane <String>plane = new Plane<>();
        plane.method();
        plane.method3();





        Math minus = (int x, int y) -> x-y;
        Math plus = (int x, int y) -> x-y;

        int sum = plus.mathMethod(5,10);
        System.out.println(sum);

        int result = minus.mathMethod(10,5);
        System.out.println(result);




        

        BiConsumer<Integer,String> consumer = (x,y) -> System.out.println();
        consumer.accept(1,"aidar");
        System.out.println(consumer);

        Supplier<String> supplier = ()->"true";
        System.out.println(supplier.get());

        BiPredicate<String,Integer> predicate = (x, y) -> x.length() ==y;
        System.out.println(predicate.test(String.valueOf(10),10));

        BiFunction< Integer , Integer,Double> function = (x, y) -> (x+y)/2.0;
        System.out.println(function.apply(2,3));











    }
}