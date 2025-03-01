import java.util.ArrayList;

public class Mahasiswa {
    // Atribut
    private String nim, nama, prodi;
    private ArrayList<MataKuliah> listMatkul;
    private Dosen dosenwali;
    private Kendaraan kendaraan;

    // Method

    // Konstruktor
    public Mahasiswa() {
        listMatkul = new ArrayList<>();
    }
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
    }

    // Selektor
    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }
    public String getProdi() {
        return prodi;
    }
    public ArrayList<MataKuliah> getListMatkul() {
        return listMatkul;
    }
    public Dosen getDosenWali() {
        return dosenwali;
    }
    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // Mutator
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi; 
    }
    public void setListMatkul(ArrayList<MataKuliah> listMatkul) {
        this.listMatkul = listMatkul;
    }
    public void setDosenWali(Dosen dosenwali) {
        this.dosenwali = dosenwali;
    }
    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // Method lain

    // Menambah matkul ke list
    public void addMatkul(MataKuliah M) {
        listMatkul.add(M);
    }

    // menjumlahkan sks dari listmatkul
    public int getJumlahSks() {
        int i, Jumlah = 0;

        for(i=0; i<listMatkul.size(); i++) {
            Jumlah += listMatkul.get(i).getSks();
        }

        return  Jumlah;
    }

    // mengembalikan jumlah matkul diambil
    public int getJumlahMatkul() {
        return listMatkul.size();
    }

    // menampilkan nim, nama, prodi mahasiswa
    public void printMhs() {
        System.out.println("Nama : " + nama + ", NIM : " + nim + ", Prodi : " + prodi);
    }

    // menampilkan detail mahasiswa
    public void printDetailMhs() {
        int i;

        System.out.println("Nama : " + nama + "\nNIM : " + nim + "\nProdi : " + prodi);
        
        System.out.println("Mata kuliah diambil : ");
        for(i=0; i<listMatkul.size(); i++) {
            System.out.println("- " + listMatkul.get(i).getNama() + ", ");
        }

        System.out.println("Data dosen wali :\nNama: " + dosenwali.getNama() + "\nNIP : " + dosenwali.getNip() + "\nProdi : " + dosenwali.getProdi());
        if(this.getKendaraan() != null) {
            System.out.println("Data kendaraan :\nPlat : " + kendaraan.getNoPlat() + "\nJenis : " + kendaraan.getJenis() + "\n");
        }
        else {
            System.out.println("Tidak ada kendaran\n");
        }
    }  
}