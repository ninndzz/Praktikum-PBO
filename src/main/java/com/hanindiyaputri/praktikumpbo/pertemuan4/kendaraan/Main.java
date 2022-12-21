package com.hanindiyaputri.praktikumpbo.pertemuan4.kendaraan;


public class Main {
    public static void main(String[] args) {
        //Pembuatan object
        // Class object = new Class()
        Mobil mb = new Mobil();
        Kendaraan kn = new Kendaraan();
        Motor mt = new Motor ();
        
        //Memasukkan nilai attribute
        mb.nama = "Mitsubishi";
        mb.jmlRoda = 4;
        mb.maxGear = 6;
        
        
        kn.nama = "Kendaraan misterius";
        kn.jmlRoda = 3;
        
        mt.nama = "Supra";
        mt.jmlRoda = 2;
        mt.maxGear = 2;
        
        
        //Uji coba pemanggilan method
        mb.showInfo();
        mb.belok("kanan");
        mb.belok();
        
        kn.showInfo(); 
        
        mt.showInfo();
        mt.belok("kiri");
        mt.belok();
    }
}
