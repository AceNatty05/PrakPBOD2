// Nama file: KontrolSenjata3.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class KontrolSenjata3 {
    // att
    Senjata3 senjata;
    
    // method
    public KontrolSenjata3(Senjata3 s){
        this.senjata = s;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }
    
    public void isiPeluru(int jumlah){
        senjata.setPeluru(senjata.getPeluru() + jumlah);
        System.out.println(">> Peluru berhasil ditambah: " + jumlah);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if(senjata.getPeluru() == 0){
            System.out.println("Peluru Habis");
        }else{
            for(int i = 1; i <= jumlah; i++){
                if(senjata.getPeluru() > 0){
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru() - 1);
                }else{
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet sudah terpasang");
    }
    
    public void menusuk(){
        if(senjata.isMenusuk()){
            System.out.println("Jleb");
        }else{
            System.out.println("Bayonet belum terpasang");
        }
    }
}
