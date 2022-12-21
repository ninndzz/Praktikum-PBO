
package Asosiasi1;


public class MataKuliah {
    private String kodeMK;
    private String namaMK;
    private int sksMK;
    
    public MataKuliah(String kodeMK, String namaMK, int sksMK){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sksMK = sksMK;
    }
    
    public void displayMK(){
        System.out.println("Kode Mk :" + kodeMK + " - Nama MK : " + namaMK + " - SKS MK : " + sksMK);
    }
}
