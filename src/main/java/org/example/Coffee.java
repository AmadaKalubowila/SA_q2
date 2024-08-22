package org.example;

public class Coffee extends Beverages{
    @Override
    public void brew(){//---override abstract method brew from Beverage abstract class---
        System.out.println("Dripping coffee through filter");
    }
    @Override
    public void addCondiments(){
        System.out.println("Adding sugar and milk");
    }//---override abstract method addCondiments from Beverage abstract class---
    @Override
    public void addExtras(){
        System.out.println("Adding vanilla syrup");
    }//---override abstract method addExtras from Beverage abstract class---
}
