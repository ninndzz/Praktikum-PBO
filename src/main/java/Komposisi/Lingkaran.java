
package Komposisi;


public class Lingkaran {
        private int jejari;
        private Titik titikPusat;
        
        public Lingkaran(int sbx, int r, float sby){
            jejari=r;
            titikPusat= new Titik(sbx,sby);
        }

    Lingkaran(int r) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
        
        public void displayLingkaran(){
            titikPusat.displayTitik();
            System.out.println("\nLingkaran :");
            System.out.println("Jejari :" + jejari);
        }
}
