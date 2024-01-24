import java.util.ArrayList;
import java.util.List;

class Buyer {
    public String buyer1;
    public String buyer2;
    public String buyer3;

    public void BuyVegetables(String name){
        System.out.println(name + " " + "has bought vegetables");
    }

    public void BuyMeat(String name){
        System.out.println(name + " " + "has bought meat");
    }

    public void BuyFish(String name){
        System.out.println(name + " " + "has bought fish");
    }

    public void BuyDrinks(String name){
        System.out.println(name + " " + "have bought drinks");
    }
}

class Dish {

}

class Cook {
    public String cook1;
    public String cook2;

    public void DoVegetables(String name) {
        System.out.println(name + " " + "makes a stew");
    }
    public void DoFish(String name){
        System.out.println(name + " " + "makes a sweet and sour fish");
    }

    public void DoMeat(String name){
        System.out.println(name + " " + "makes a braised pork");
    }

    public String[] dishname = {"Stew","Hongshaorou","Tangcuyu"};
    public void print(){
        for (int i = 0; i < dishname.length; i++) {
            System.out.println(dishname[i]);
        }
    }
}


public class Test {
    public static void Background(){
        System.out.println("Today is New Year's Eve.");
        System.out.print("My father, mother, aunts and I are going to work together ");
        System.out.println("to cook the New Year's Eve dinner to celebrate the festival");
    }

    public static void main(String[] args) {
        Background();
        String[] names = {"Dad","Mom","Gugu","Shenshen","I"};
        Buyer buyer = new Buyer();
        buyer.buyer1 = names[2];
        buyer.buyer2 = names[1];
        buyer.buyer3 = names[4];
        buyer.BuyVegetables(buyer.buyer1);
        buyer.BuyMeat(buyer.buyer2);
        buyer.BuyFish(buyer.buyer2);
        buyer.BuyDrinks(buyer.buyer3);
        Cook cook = new Cook();
        cook.cook1 = names[0];
        cook.cook2 = names[3];
        cook.DoVegetables(cook.cook2);
        cook.DoMeat(cook.cook1);
        cook.DoFish(cook.cook1);
        System.out.println("My family's New Year's Eve dinner is finished now!");
        System.out.println("We have！！");
        cook.print();
        System.out.println("and my favourite drinks！！cola. Cheers!");
    }
}
