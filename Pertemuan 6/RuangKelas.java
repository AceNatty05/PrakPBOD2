// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class RuangKelas extends Ruang{
    private int jmlKursi;
    private int KursiRusak;
    private static double Tarif;

    //kons
    public RuangKelas(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, int jmlKursi, int KursiRusak){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas);
        this.jmlKursi = jmlKursi;
        this.KursiRusak = KursiRusak;
    }

    //selec n mutat
    public int getJmlKursi() {
        return jmlKursi;
    }
    public int getKursiRusak() {
        return KursiRusak;
    }
    public static double getTarif(){
        return Tarif;
    }
    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }
    public void setKursiRusak(int KursiRusak) {
        this.KursiRusak = KursiRusak;
    }
    public static void setTarif(double Tarif) {
        RuangKelas.Tarif = Tarif;
    }

    // others 
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah kursi : " + getJmlKursi() + " unit");
        System.out.println("Kursi rusak  : " + getKursiRusak() + " unit");
        System.out.println("Tarif kebersihan : " + getTarif());
    }
}