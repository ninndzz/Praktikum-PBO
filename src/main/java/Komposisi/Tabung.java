
package Komposisi;


public class Tabung {
    private int tinggi;
    private int jejari;
    private double phi = 3.14;
    private Lingkaran jariJari;
    private Titik titikPusat;
    
   public Tabung(int r, int t, int sbx, int sby){
       tinggi = t;
       titikPusat = new Titik(sbx,sby);
       jariJari = new Lingkaran(sbx, sby, r);
       jejari = r;
   }
   
   public double luas(){
       return phi*jejari*jejari;
   }
   
   public double volume(){
       return phi*jejari*jejari*tinggi;
   }
   
   public void displayTabung(){
       System.out.println("");
       System.out.println("Tabung");
       System.out.println("Tinggi :" + tinggi);
       System.out.println("Volume :" + volume());
       System.out.println("Luas :" + luas());
   }
}
