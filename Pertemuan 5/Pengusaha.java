// Nama file : Pengusaha.java
// Deskripsi :
// Nama |NIM : Natasya Amelia Candrasari | 24060123130072

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia implements Pajak{
    private String npwp;
    private static int counterPengusaha = 0;

    //konstruktor
    public Pengusaha(String nama, String tanggal, String alamat, double pendapatan, String npwp){
        super(nama,tanggal,alamat,pendapatan);
        this.npwp = npwp;
        counterPengusaha++;
    }

    //selektor
    public String getNPWP(){
        return npwp;
    }
    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    //mutator
    public void setNPWP(String npwp){
        this.npwp = npwp;
    }

    //others
    @Override
    public int hitungMasaKerja(){
        Period selisih = Period.between(getTanggalMulaiKerja(),LocalDate.now());
        return selisih.getYears() + 7; // digit 13 nim : 7
    }
    @Override
    public double hitungPajak(){
        return getPendapatan()*0.15;
    }
    @Override
    public void cetakInfo(){
        super.cetakInfo(); 
        System.out.println("NPWP                : " + getNPWP());   
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + FormatRupiah(hitungPajak()) + "\n");   
    }
}