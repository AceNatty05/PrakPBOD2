// Nama File : Manager.java
// Deskripsi : child class Pegawai dengan method2nya
// Nama||NIM : natasya amelia candrasari || 24060123130072
// Tanggal   : 24/10/2024

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    // konstruktor
    public Manajer(String Nama){
        setNama(Nama);
    }

    // selektor
    public int getTunjangan(){
        return tunjangan;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }
}