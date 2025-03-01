public class MataKuliah {
    // Atribut
    private String idMatkul;
    private String nama;
    private int sks;

    // Method

    // Konstruktor
    public MataKuliah() {
        idMatkul = "0";
        nama = "0";
        sks = 0;
    }

    public MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    // Selektor
    public String getIdMatkul() {
        return this.idMatkul;
    }
    public String getNama() {
        return this.nama;
    }
    public int getSks() {
        return this.sks;
    }

    // Mutator
    public void setIdMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setSks(int sks) {
        this.sks = sks;
    }
}