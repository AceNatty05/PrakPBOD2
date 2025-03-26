// Nama file : Lingkaran.java
// Deskripsi : membuat class Persegi dengan method abstract class BangunDatar
// Nama | NIM : Natasya Amelia Candrasari | 24060123130072

public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    // konstruktor
    public Persegi() {
        setJmlSisi(4);
    }
    public Persegi(double sisi) {
        // super(4,warna,border);
        this.sisi = sisi;
    }

    // selektor
    public double getSisi() {
        return sisi;
    }

    // mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // method lain
    @Override
    public double  getLuas(){
        return sisi*sisi;
    }
    @Override
    public double getKeliling(){
        return 4*sisi;
    }
    public double  getDiagonal(){
        return (Math.sqrt(2))*sisi;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }

    // Interface override
    @Override
    public void zoomIn(){
        sisi = sisi*1.1;
    }
    @Override
    public void zoomOut(){
        sisi = sisi*0.9;
    }
    @Override
    public void zoom(int percent){
        sisi = sisi * percent /100;
    }
}
