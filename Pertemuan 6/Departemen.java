// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class Departemen{
    private String Nama;
    private String Ketua;
    private double Tarif;

    //kons
    public Departemen(String Nama, String Ketua, double Tarif){
        this.Nama = Nama;
        this.Ketua = Ketua;
        this.Tarif = Tarif;
    }

    //selektor
    public String getNama() {
        return Nama;
    }
    public String getKetua() {
        return Ketua;
    }
    public double getTarif() {
        return Tarif;
    }

    // Setter (Mutator)
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setKetua(String Ketua) {
        this.Ketua = Ketua;
    }
    public void setTarif(double Tarif) {
        this.Tarif = Tarif;
    }
}