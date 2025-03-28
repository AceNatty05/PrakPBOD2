import java.time.LocalDate;

public class Dosen extends Pegawai{
    private String Fakultas;

    // konstruktor
    public Dosen(String NIP, String Nama, LocalDate TanggalLahir, LocalDate TMT, double GajiPokok, String Fakultas){
        super(NIP, Nama, TanggalLahir, TMT, GajiPokok);
        this.Fakultas = Fakultas;
    }

    // selektor
    public String getFakultas(){
        return Fakultas;
    }

    // mutator
    public void setFakultas(String Fakultas){
        this.Fakultas = Fakultas;
    }

    //others
}