// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class LabMatkul extends Laboratorium{
    private String Matkul;

    public LabMatkul(String Kode, double Panjang, double Lebar, double Tinggi, int Kapasitas, String Nama, double Sewa, String Matkul){
        super(Kode,Panjang,Lebar,Tinggi,Kapasitas,Nama,Sewa);
        this.Matkul = Matkul;
    }

    //selec & mutat
    public String getMatkul(){
        return Matkul;
    }
    public void setMatkul(String Matkul){
        this.Matkul = Matkul;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Matkul : " + getMatkul());
    }
}