
package com.hanindiyaputri.praktikumpbo.pertemuan3.challenge;


public class Main {
    public static void main(String[] args) {
        Challenge hanindiya = new Challenge("Hanindiya", 19, 2002);
        Challenge putri = new Challenge("Putri", 39, 2003);
        Challenge almeyda = new Challenge ("Almeyda", 10, 2004);
        
        hanindiya.showProfile();
        putri.showProfile();
        almeyda.showProfile();
        
        System.out.println("Hanindiya name (before) : " + hanindiya.getName());
        hanindiya.setName("Loui");
        System.out.println("Hanindiya name (after) : " + hanindiya.getName());
        
    }
}
