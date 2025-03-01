public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis;

    // Method

    // Konstruktor
    public Kendaraan() {
        noPlat = "0";
        jenis = "0";
    }
    public Kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // Selektor
    public String getNoPlat() {
        return noPlat;
    }
    public String getJenis() {
        return jenis;
    }

    // Mutator
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }
    public void setJenis(String jenis) {
        this.jenis = jenis;
    } 
}