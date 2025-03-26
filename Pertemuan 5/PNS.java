// Nama file : PNS.java
// Deskripsi :
// Nama |NIM : Natasya Amelia Candrasari | 24060123130072

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia implements Pajak{
    private String NIP;
    private static int counterPNS = 0;

    //konstruktor
    public PNS(String nama, String tanggal, String alamat, double pendapatan, String NIP){
        super(nama,tanggal,alamat,pendapatan);
        this.NIP = NIP;
        counterPNS++;   
    }
    public PNS(String nama, String tanggal, double pendapatan, String NIP){
        super(nama,tanggal,"Belum diisi",pendapatan);
        this.NIP = NIP;
        counterPNS++;   
    }

    //selektor
    public String getNIP(){
        return NIP;
    }
    public static int getCounterPNS(){
        return counterPNS; 
    }

    //mutator
    public void setNIP(String NIP){
        this.NIP = NIP;
    }

    //others
    @Override
    public int hitungMasaKerja(){
        Period selisih = Period.between(getTanggalMulaiKerja(),LocalDate.now());
        return selisih.getYears() + 2; // digit 14 nim : 2
    }
    @Override
    public double hitungPajak(){
        return getPendapatan()*0.1;
    }
    @Override
    public void cetakInfo(){
        super.cetakInfo(); 
        System.out.println("NIP                 : " + getNIP());   
        System.out.println("Masa Kerja          : " + hitungMasaKerja() + " tahun");
        System.out.println("Pajak               : " + FormatRupiah(hitungPajak()) + "\n");   
    }
}