
package com.hanindiyaputri.praktikumpbo.pertemuan6.tugas;

import java.util.Scanner;


public class Exception1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Mohon Masukkan Angka : ");
            String stringInput = input.nextLine();
            int intInput = 3;
            try{
            intInput = Integer.parseInt(stringInput);
            System.out.println(stringInput);
            System.out.println("Berhasil");
            }catch(NumberFormatException e){
            System.out.println("Mohon masukkan angka saja!");
    }
  }
}
