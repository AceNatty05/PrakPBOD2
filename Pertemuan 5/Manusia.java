// Nama file : Manusia.java
// Deskripsi :
// Nama |NIM : Natasya Amelia Candrasari | 24060123130072

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Manusia{
    protected String nama;
    protected LocalDate tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    // konstruktor
    public Manusia(String nama, String tanggal, String alamat, double pendapatan){
        this.nama = nama;
        this.tgl_mulai_kerja = LocalDate.parse(tanggal, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    // PNS p1 = new PNS(‘Satriyo’,01-04-2006,’Jl. Seroja’,15000000,’198302032006041002’);

    // selektor
    public String getNama(){
        return nama;
    }
    public LocalDate getTanggalMulaiKerja(){
        return tgl_mulai_kerja;
    }
    public String getAlamat(){
        return alamat;
    }
    public double getPendapatan(){
        return pendapatan;
    }
    public static int getCounterMns(){
        return counterMns;
    }

    // mutator
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setTanggalMulaiKerja(LocalDate tgl_mulai_kerja){
        this.tgl_mulai_kerja = tgl_mulai_kerja;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // others method
    public String FormatTanggal(LocalDate Tanggal){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return Tanggal.format(formatter);
    }
    public String FormatRupiah(double Nilai){
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(Nilai);
    }
    public void cetakInfo(){
        System.out.println("Nama                : " + getNama());
        System.out.println("Tanggal Mulai Kerja : " + FormatTanggal(getTanggalMulaiKerja()));
        System.out.println("Alamat              : " + getAlamat());
        System.out.println("Pendapatan          : " + getPendapatan());
    }

    public abstract int hitungMasaKerja();
}