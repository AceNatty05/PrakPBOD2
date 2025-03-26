// Nama file : Lingkaran.java
// Deskripsi : membuat class Lingkaran dengan method abstract class BangunDatar
// Nama | NIM : Natasya Amelia Candrasari | 24060123130072

public class Lingkaran extends BangunDatar{
    private double jari;

    // konstruktor 
    public Lingkaran(){
        setJmlSisi(0);
    }
    public Lingkaran(double rad){
        jari = rad;
    }

    // getter
    public double getJari(){
        return jari;
    } 

    // setter
    public void setJari(double jari){
        this.jari = jari;
    }

    // method lain
    @Override
    public double getLuas(){
        return (Math.PI)*jari*jari;
    }
    @Override
    public double getKeliling(){
        return 2*(Math.PI)*jari;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Radius: " + jari);
        System.out.println("Luas: " + getLuas());
        System.out.println("Keliling: " + getKeliling());
    }
}