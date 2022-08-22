public class Plane<S> implements Flyable<String>{

    @Override
    public void method(){
        System.out.println("Hello Google");

    }

    public void method3() {
    Flyable.super.method3();
    System.out.println("Goodbay");
    }
    @Override
    public void method10(){
        Flyable.super.method10();
    }
}


