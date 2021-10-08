/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author asus
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi atribut terlebih dahulu
        int s = 42;
        int r = s/2;
        //inisiasi persegi
        Persegi p = new Persegi();
        //inisiasi lingkaran
        Lingkaran l = new Lingkaran();
        //Menghitung luas bentuk tersebut
        double luas = p.hitungLuas(s) + (l.hitungLuas(r) * 0.5 * 4);
        System.out.println("Luas dari bangun kompleks pada project 1 adalah " + luas + " cm persegi.");
    }
    
}
