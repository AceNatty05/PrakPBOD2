// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class LabKom extends Laboratorium{
    private int Komputer;

    public LabKom(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, String Nama, double Sewa, int Komputer){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas,Nama,Sewa);
        this.Komputer = Komputer;
    }

    //selec & mutat
    public int getKomputer(){
        return Komputer;
    }
    public void setKomputer(int Komputer){
        this.Komputer = Komputer;
    }

    // Override printInfo
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Komputer : " + getKomputer() + " unit");
    }
}