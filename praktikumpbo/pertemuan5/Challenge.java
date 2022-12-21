
package com.hanindiyaputri.praktikumpbo.pertemuan5;

import java.util.Scanner;


public class Challenge {
    public static void main(String args[])
    {
        //Deklarasi scanner untuk input user
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        
        //Mengisi input panjang array atau nilainya 
        System.out.print ("Banyaknya nilai :  ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("Nilai ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum / n;
        
        //Menampilkan output rata-rata nilai dan jumlah
        System.out.println ("Rata-rata: "+rata);
        System.out.println ("Jumlah: "+jum);
   }
}
