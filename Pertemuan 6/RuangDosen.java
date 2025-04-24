// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class RuangDosen extends Ruang{
    private int Kursi;
    private int Meja;
    private String Dosen;
    private Departemen D;

    public RuangDosen(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, int Meja, int Kursi, String Dosen, Departemen D){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas);
        this.Meja = Meja;
        this.Kursi = Kursi;
        this.Dosen = Dosen;
        this.D = D;
    }

    // Getter (Selector)
    public int getKursi() {
        return Kursi;
    }
    public int getMeja() {
        return Meja;
    }
    public String getDosen() {
        return Dosen;
    }
    public Departemen getDepartemen() {
        return D;
    }

    // Setter (Mutator)
    public void setKursi(int Kursi) {
        this.Kursi = Kursi;
    }
    public void setMeja(int Meja) {
        this.Meja = Meja;
    }
    public void setDosen(String Dosen) {
        this.Dosen = Dosen;
    }
    public void setDepartemen(Departemen D) {
        this.D = D;
    }

    //others
    public double getTarifKebersihan(){
        return getPanjang()*getLebar()*D.getTarif();
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Nama Dosen : " + Dosen);
        System.out.println("Jumlah Meja : " + Meja);
        System.out.println("Jumlah Kursi : " + Kursi);
        System.out.println("Departemen : " + D.getNama());
        System.out.println("Tarif kebersihan : Rp " + getTarifKebersihan());
    }
}