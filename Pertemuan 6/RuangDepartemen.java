// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class RuangDepartemen extends Ruang{
    private int Meja;
    private int Kursi;
    private int Lemari;
    private Departemen D;

    public RuangDepartemen(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, int Meja, int Kursi, int Lemari, Departemen D){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas);
        this.Meja = Meja;
        this.Kursi = Kursi;
        this.Lemari = Lemari;
        this.D = D;
    }

    // Getter (Selector)
    public int getMeja() {
        return Meja;
    }
    public int getKursi() {
        return Kursi;
    }
    public int getLemari() {
        return Lemari;
    }
    public Departemen getDepartemen() {
        return D;
    }
    
    // Setter (Mutator)
    public void setMeja(int Meja) {
        this.Meja = Meja;
    }
    public void setKursi(int Kursi) {
        this.Kursi = Kursi;
    }
    public void setLemari(int Lemari) {
        this.Lemari = Lemari;
    }
    public void setDepartemen(Departemen D) {
        this.D = D;
    }

    //others
    public double getTarifKebersihan(){
        return getPanjang()*getLebar()*D.getTarif();
    }

    // Override printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Jumlah Meja : " + Meja);
        System.out.println("Jumlah Kursi : " + Kursi);
        System.out.println("Jumlah Lemari : " + Lemari);
        System.out.println("Departemen : " + D.getNama());
        System.out.println("Tarif kebersihan : Rp " + getTarifKebersihan());
    }
}