
package com.hanindiyaputri.praktikumpbo.pertemuan3.animal;

public class Main {
    public static void main(String[] args) {
        //Membuat object dari class Animal
        Animal cat = new Animal("Polly",3,"Grey");
        Animal dog = new Animal("Jack",4,"Black");
        Animal rabbit = new Animal("Cleo",2,"White");
        
        //Memanggil method
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();
    
        //Getter & Setter
        System.out.println("Dog's name (before):" + dog.getName());
        dog.setName("Snowie");
        System.out.println("Dog's name (after):" + dog.getName());
    }
}
