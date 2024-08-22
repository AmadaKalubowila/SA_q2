package org.example;

abstract class Beverages {
    private boolean wantsExtras;//--- create wantsExtras property---
    abstract void addExtras();//--- implements addExtras abstract method---
    void boilWater(){//---implement boilWater concrete method---
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pour into cup");
    }//---implement pourInCup concrete method---
    abstract void brew();//--- implements brew abstract method---
    abstract void addCondiments();//--- implements addCondiments abstract method---
    void setWantsExtras(boolean wantsExtras){//---create setter for attribute---

        this.wantsExtras=wantsExtras;
    }
   public final void finalTemplateMethod(){//---method execution sequence---

        boilWater();
        brew();
        pourInCup();
        addCondiments();
       if(wantsExtras){
        addExtras();}

    }
}
