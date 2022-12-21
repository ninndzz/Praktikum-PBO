
package com.hanindiyaputri.praktikumpbo.pertemuan3.tugashanindiya;


public class Main {
    public static void main(String[] args) {
        // memanggil class Nindy
        Nindy saya = new Nindy ("Lals", 190, 84, 20);
        Nindy dia = new Nindy ("Ninz", 166, 70, 19);
        
        // menjalankan Method
        saya.tentangSaya();
        dia.tentangSaya();
        
        // Menjalankan Getter & Setter dari class Aldi
        System.out.println("Tinggi badan (sebelum diet) : " + dia.getBerat());
        dia.setBerat(75);
        System.out.println("Tinggi badan  (setelah diet) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Berat Total Tubuh saya adalah " + massa);
        
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        Test mahasiswa = new Test(); // memanggil class Test
        System.out.println("Apakah mahasiswa adalah Objek -> " + (mahasiswa instanceof Object));
        System.out.println("Apakah mahasiswa adalah Manusia -> " + (mahasiswa instanceof Test));
        System.out.println("Apakah mahasiswa adalah Pelajar -> " + (mahasiswa instanceof Pelajar));
        System.out.println("------------------------"); // spasi
 
        Pelajar pelajar = new Pelajar(); 
        System.out.println("Apakah mahasiswa adalah Objek -> " + (pelajar instanceof Object));
        System.out.println("Apakah mahasiswa adalah Manusia -> " + (pelajar instanceof Test));
        System.out.println("Apakah mahasiswa adalah Mahasiswa -> " + (pelajar instanceof Pelajar)); 
    }
}
