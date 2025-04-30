// Nama file: Senjata2.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class MainSenjata2 {
    public static void main(String[] args){
        Senjata2 ak47 = new Senjata2("DOR");
        Senjata2 m16 = new Senjata2("TAR");
        
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru()); // 0
        System.out.println("AK47 mengisi peluru ");
        ak47.setPeluru(5);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru()); // 5
        
        System.out.println("AK47 menembak ");
        ak47.menembak(4);
        System.out.println("Jumlah Peluru AK47: " + ak47.getPeluru()); // 1
    }
}
