package org.example;

public class Tea extends Beverages{
    @Override
    public void brew(){//---override abstract method brew from Beverage abstract class---
        System.out.println("Steeping the tea");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding lemon");
    }//---override abstract method addCondiments from Beverage abstract class---
    @Override
    public void addExtras(){
        System.out.println("Adding honey to the tea");
    }//---override abstract method addExtras from Beverage abstract class---
}
