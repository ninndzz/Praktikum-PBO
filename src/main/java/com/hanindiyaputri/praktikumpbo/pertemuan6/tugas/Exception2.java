
package com.hanindiyaputri.praktikumpbo.pertemuan6.tugas;


public class Exception2 {
    public static void main(String[] args) {
        String string = "You Are My Sunshine";
        for(int i=0; i<string.length(); i++){
            System.out.print(string.charAt(i));
        }
        System.out.println();
        System.out.println("Panjang String : " + string.length());
        try{
        //Akses Elemen Lebih besar dari panjang String
            System.out.println(string.charAt(30));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Telah Terjadi Exception");
    }
  }
}
