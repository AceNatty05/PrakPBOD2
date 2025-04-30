// Nama file: Senjata2.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class Senjata3 {
    // atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    // kons
    public Senjata3(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }
    
    // get set & others
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }   
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
}
