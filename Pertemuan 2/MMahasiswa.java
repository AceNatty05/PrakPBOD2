
public class MMahasiswa{
    public static void main(String[] args) {
        // Variabel
        MataKuliah PBO, MBD, GKV, ASA, RPL;
        // ArrayList<MataKuliah> listMatkul;
        Mahasiswa M1, M2, M3, M4;
        Kendaraan K1, K2;
        Dosen D1, D2;

        // Testing
        PBO = new MataKuliah("PBO", "Pemrograman Berbasis Objek", 3);
        MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        GKV = new MataKuliah("GKV", "Grafika Komputasi Visual", 3);
        ASA = new MataKuliah("ASA", "Analisis Strategi Algoritma", 3);
        RPL = new MataKuliah("RPL", "Rekayasa Perangkat Lunak", 3);

        M1 = new Mahasiswa("170", "Muhammad Yazid Lubis", "Informatika");
        M2 = new Mahasiswa("078", "Oliver Gunawan Martua Sihaloho", "Informatika");
        M3 = new Mahasiswa("067", "Nindya Kirana", "Informatika");
        M4 = new Mahasiswa("072", "Natasya Amelia Candrasari", "informatika");

        D1 = new Dosen("096", "Satriyo Adhy", "Informatika");
        D2 = new Dosen("893", "Khadijah", "Informatika");

        K1 = new Kendaraan("H 2874 YU", "Motor Mio");
        K2 = new Kendaraan("AA 8723 RV", "Motor Beat");

        M1.setDosenWali(D2);
        M2.setDosenWali(D2);
        M3.setDosenWali(D1);
        M4.setDosenWali(D1);

        M1.setKendaraan(K2);
        M3.setKendaraan(K1);

        M1.addMatkul(MBD);
        M1.addMatkul(PBO);
        M1.addMatkul(ASA);

        M2.addMatkul(ASA);
        M2.addMatkul(MBD);
        M2.addMatkul(RPL);

        M3.addMatkul(GKV);
        M3.addMatkul(PBO);
        M3.addMatkul(RPL);

        M4.addMatkul(ASA);
        M4.addMatkul(MBD);
        M4.addMatkul(RPL);

        M1.printDetailMhs();
        M2.printDetailMhs();
        M3.printDetailMhs();
        M4.printDetailMhs();
    }
}