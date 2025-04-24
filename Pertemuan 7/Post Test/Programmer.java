// Nama File : Programmer.java
// Deskripsi : child class Pegawai dengan method2nya
// Nama||NIM : natasya amelia candrasari || 24060123130072
// Tanggal   : 24/10/2024

public class Programmer extends Pegawai{
    private int bonus = 450000;

    // konstruktor
    public Programmer(String Nama){
        setNama(Nama);
    }

    // selektor
    public int getBonus(){
        return bonus;
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus : " + getBonus());
    }
}