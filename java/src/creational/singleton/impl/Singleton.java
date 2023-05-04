package creational.singleton.impl;

public class Singleton {

    private static Singleton uniqueInstance;
    
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(uniqueInstance == null){
            uniqueInstance = new Singleton(value);
        }

        return uniqueInstance;
    }
}
