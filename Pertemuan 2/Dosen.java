public class Dosen {
    // Atribut 
    private String nip;
    private String nama;
    private String prodi;

    // Method

    // Konstruktor
    public Dosen() {
        nip = "0";
        nama = "0";
        prodi = "0";
    }

    public Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Selektor
    public  String getNip() {
        return this.nip;
    }

    public String getNama() {
        return  this.nama;
    }

    public String getProdi() {
        return this.prodi;
    }

    // Mutator

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
}