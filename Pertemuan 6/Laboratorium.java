// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class Laboratorium extends Ruang{
    private String Nama;
    private double Sewa;
    private static double Tarif;

    //konst
    public Laboratorium(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, String Nama, double Sewa){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas);
        this.Nama = Nama;
        this.Sewa = Sewa;
    }

    // Getter (Selector)
    public String getNama() {
        return Nama;
    }
    public double getSewa() {
        return Sewa;
    }
    public static double getTarif() {
        return Tarif;
    }

    // Setter (Mutator)
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setSewa(double Sewa) {
        this.Sewa = Sewa;
    }
    public static  void setTarif(double Tarif) {
        Laboratorium.Tarif = Tarif;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Laboratorium : " + getNama());
        System.out.println("Sewa : " + getSewa());
        System.out.println("Tarif kebersihan : Rp " + getTarif());
    }
}