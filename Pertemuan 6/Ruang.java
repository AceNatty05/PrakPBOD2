// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class Ruang{
    private String Kode;
    private double Panjang;
    private double Lebar;
    private double Tinggi;
    private int Kapasitas;

    // kons
    public Ruang(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas){
        this.Kode = Kode;
        this.Panjang = Panjang;
        this.Lebar = Lebar;
        this.Tinggi = Tinggi;
        this.Kapasitas = Kapasitas;
    }

    //selec
    public String getKode(){
        return Kode;
    }
    public double getPanjang(){
        return Panjang;
    }
    public double getLebar(){
        return Lebar;
    }
    public double getTingi(){
        return Tinggi;
    }
    public int getKapasitas(){
        return Kapasitas;
    }

    // Setter (Mutator)
    public void setKode(String Kode) {
        this.Kode = Kode;
    }
    public void setPanjang(double Panjang) {
        this.Panjang = Panjang;
    }
    public void setLebar(double Lebar) {
        this.Lebar = Lebar;
    }
    public void setTinggi(double Tinggi) {
        this.Tinggi = Tinggi;
    }
    public void setKapasitas(int Kapasitas) {
        this.Kapasitas = Kapasitas;
    }

    //others
    public void printInfo() {
        System.out.println("Kode Ruang : " + Kode);
        System.out.println("Panjang : " + Panjang + " meter");
        System.out.println("Lebar : " + Lebar + " meter");
        System.out.println("Tinggi : " + Tinggi + " meter");
        System.out.println("Kapasitas : " + Kapasitas + " orang");
    }
}