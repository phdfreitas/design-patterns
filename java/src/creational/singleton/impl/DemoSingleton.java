package creational.singleton.impl;

public class DemoSingleton {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance("One");
        Singleton singleton2 = Singleton.getInstance("Two");

        System.out.println(singleton1.value);
        System.out.println(singleton2.value);
    }

}
