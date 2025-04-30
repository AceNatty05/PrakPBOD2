// Nama file: Senjata.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

public class Senjata {
    // atribut
    private String bunyi;
    private boolean menusuk;
    
    // kons
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    // set get & others
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void menembak(int jumlah){
        for(int i = 0; i < jumlah; i++){
            System.out.println(getBunyi());
        }
    }
    
    public void pasangBayonet(){
        setMenusuk(true);
        System.out.println("Bayonet sudah terpasang");
    }
    
    public void menusuk(){
        if(isMenusuk()){
            System.out.println("Jleb");
        }else{
            System.out.println("Bayonet belum terpasang");
        }
    }
}
