/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan63.gardiengarislurus;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan Program Gradien Garis Lurus
 */
public class PBOIF210119048Latihan63GardienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k1 = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik (" + k1.getX1() + "," + k1.getY1() + 
                           ") dan (" + k1.getX2() + "," + k1.getY2() + ")" );
        System.out.println("memiliki gradien sebesar " + k1.hitungGradien());
        
        Koordinat k2 = new Koordinat(5,1,3,12);
        System.out.println("Garis yang melalui titik (" + k2.getX1() + "," + k2.getY1() + 
                           ") dan (" + k2.getX2() + "," + k2.getY2() + ")" );
        System.out.println("memiliki gradien sebesar " + k2 .hitungGradien());
    }
    
}
