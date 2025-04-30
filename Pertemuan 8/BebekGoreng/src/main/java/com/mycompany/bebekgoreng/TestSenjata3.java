// Nama file: TestSenjata3.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class TestSenjata3 {
    public static void main(String[] args){
        Senjata3 ak47 = new Senjata3("TAR");
        Senjata3 m16 = new Senjata3("DOR");
        KontrolSenjata3 kontrolAK47 = new KontrolSenjata3(ak47);
        KontrolSenjata3 kontrolM16 = new KontrolSenjata3(m16);
        
        kontrolAK47.menembak(2);
        kontrolAK47.isiPeluru(3);
        kontrolAK47.menembak(5);
        
        System.out.println("=============================");
        
        kontrolM16.menembak(1);
        kontrolM16.isiPeluru(5);
        kontrolM16.menembak(2);
    }
}
