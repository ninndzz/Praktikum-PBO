
package com.hanindiyaputri.praktikumpbo.pertemuan6.tugas;


public class Exception3 {
    public static void main(String[] args) {
        try{
        Object[] array = new String[5];
        array[0] = 9;
        }catch(ArrayStoreException e){
        System.out.println("On Running .....");
        }
    }
}
