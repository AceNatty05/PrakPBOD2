// Nama file: Senjata2.java
// Deskripsi: implementasi generalisasi dengan class Senjata
// NAMA||NIM: Natasya Amelia Candrasari||24060123130072
// Tanggal  : 30/04/2024

package com.mycompany.bebekgoreng;

/**
 *
 * @author Natasya
 */
public class Senjata2 {
    // atribut
    private String bunyi;
    private int peluru;
    
    // kons & others
    public Senjata2(String bunyi){
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public void menembak(int jumlah){
        if(getPeluru() >= jumlah){
            for(int i = 0; i < jumlah; i++){
                System.out.println(getBunyi());
            } 
            setPeluru(getPeluru() - jumlah);
        }else{
            System.out.println("Jumlah peluru kurang");
        }
    }
}
