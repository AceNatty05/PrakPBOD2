// Nama File : Pegawai.java
// Deskripsi : parent class Pegawai dengan method2nya
// Nama||NIM : natasya amelia candrasari || 24060123130072
// Tanggal   : 24/10/2024

public class Pegawai{
    private String Nama;
    private int gajiPokok = 5000000;

    // getter
    public String getNama(){
        return Nama;
    }

    public int getGajiPokok(){
        return gajiPokok;
    }

    // others
    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + getNama() + ", Gaji pokok : " + getGajiPokok());
    };
}