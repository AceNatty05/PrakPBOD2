// Nama file : Petani.java
// Deskripsi :
// Nama |NIM : Natasya Amelia Candrasari | 24060123130072

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia implements Pajak{
    private String asal_kota;
    private static int counterPetani = 0;

    //konstruktor
    public Petani(String nama, String tanggal, String alamat, double pendapatan, String asal_kota){
        super(nama,tanggal,alamat,pendapatan);
        this.asal_kota = asal_kota;
        counterPetani++;
    }

    //selektor
    public String getAsalKota(){
        return asal_kota;
    }
    public static int getCounterPetani(){
        return counterPetani;
    }

    //mutator
    public void setAsalKota(String asal_kota){
        this.asal_kota =asal_kota;
    }

    //others
    @Override
    public int hitungMasaKerja(){
        Period selisih = Period.between(getTanggalMulaiKerja(),LocalDate.now());
        return selisih.getYears(); // digit 12 nim : 0
    }
    @Override
    public double hitungPajak(){
        return 0;
    }
    @Override
    public void cetakInfo(){
        super.cetakInfo(); 
        System.out.println("Asal Kota           : " + getAsalKota());   
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + FormatRupiah(hitungPajak()) + "\n");   
    }
}