// Nama file: MainSenjata.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class MainSenjata {
    public static void main(String[] args) {
        // TODO code application logic here
        Senjata pistol = new Senjata("dor");
        pistol.setMenusuk(true);
        pistol.menembak(5);
        pistol.menusuk();
        System.out.println(pistol.isMenusuk());
    }
}
