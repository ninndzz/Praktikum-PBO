
package com.hanindiyaputri.praktikumpbo.pertemuan4.kendaraan;


public class Motor extends Kendaraan {
    int maxGear;
    
    //diganti 
    public void belok(String arah){
        System.out.println("Motor " + nama + " belok ke " + arah + " !");
    }
    
    public void belok(){
        System.out.println("Error : Mohon Masukkan Arah !");
    }
    
    public void extraInfo(){
        System.out.println("Max gear :" + maxGear);
    }
}
