
package Komposisi;


public class Titik {
       private float sumbuX,sumbuY;
       
       public Titik(float x, float y){
           sumbuX=x;
           sumbuY=y;
       }
       
       public void displayTitik(){
           System.out.println("Titik pusat :");
           System.out.println("Koordinat : [" + sumbuX + "," + sumbuY + "]");
       }
}
