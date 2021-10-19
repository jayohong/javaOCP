package com.lab.ocp.day07;

import java.util.Random;
public class Zoo {
    public static void main(String[] args) {
        Animal animal = getAnimal();
        System.out.println(animal);
        Tiger tiger=new Tiger();
        tiger.move();
        Ostrich ostrich=new Ostrich();
        move(tiger);
        move(ostrich);   
        //------------------------------
        Animal o1 =new Ostrich(); //o1沒辦法使用motto 因為Animal裡面沒有motto
                                  //多型宣告另一層意思就是權限
        Ostrich o2=new Ostrich();
        o1.move();
        ((Ostrich)o1).motto();//如果硬要用motto就要先轉型    
        o2.motto();
    }
    public static void move(Animal animal) {
        animal.move();
        if(animal instanceof Ostrich){
            ((Ostrich)animal).motto();
        }else{
            System.out.println("不可轉Ostrich");
        }
        
    }
    public static Animal getAnimal() {
        int n=new Random().nextInt(5);
        switch(n){
            case 1:
                 return new Tiger();
            case 2:
                return new Fish();
            case 3:
                return new Bird();
            case 4:
                return new Ostrich();
                            
        }  
        return new Animal();
    }
}
