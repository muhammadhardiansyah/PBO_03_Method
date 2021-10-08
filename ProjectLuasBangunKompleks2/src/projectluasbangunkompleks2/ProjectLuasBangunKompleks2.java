/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks2;

/**
 *
 * @author asus
 */
public class ProjectLuasBangunKompleks2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int panjang = 28;
        double r_besar = panjang / 2.;
        double r_kecil = r_besar / 2.;
        
        Lingkaran l = new Lingkaran();
        double luasLingkaranBesar = l.hitungLuas(r_besar);
        double luasLingkaranKecil = l.hitungLuas(r_kecil);
        
        double luasBangun = (0.5 * luasLingkaranBesar) - (0.5 * 2 * luasLingkaranKecil);
        System.out.println("Luas bangun kompleks tersebut adalah " + luasBangun + " cm persegi.");
    }
    
}
