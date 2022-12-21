
package Asosiasi1;


public class Dosen {
    private String namaDosen;
    private String nppDosen;
    private MataKuliah daftarMK[];
    private int jmlMK;
    
    public Dosen(String nama, String npp){
        namaDosen = nama;
        nppDosen = npp;
        daftarMK = new MataKuliah[5];
        jmlMK = 0;
    }
    
    public void tambahMK(MataKuliah mk){
        daftarMK[jmlMK]=mk;
        jmlMK++;
    }
    
    public void lihatMK(){
        System.out.println("Nama Dosen : " + namaDosen);
        
        for (int i = 0; i < jmlMK; i++){
            daftarMK[i].displayMK();
        }
    }
}
