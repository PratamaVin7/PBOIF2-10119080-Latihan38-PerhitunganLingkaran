/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan38.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Perhitungan Lingkaran
 */
class PerhitunganLingkaran {
    private static double jarijari, luas, keliling;
    public static double diameter;
    private static final double PHI = 3.14;
        
    public static double hitungJariJari() {
        jarijari = diameter /2 ;
        return jarijari;
    }
    
    public static double hitungLuas() {
        luas = PHI * jarijari * jarijari;
        return luas;
    }
    
    public static double hitungKeliling() {
        keliling = PHI * diameter;
        return keliling;
    }
    
}