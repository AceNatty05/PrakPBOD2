// Nama file :
// Deskripsi :
// Nama| NIM : Natasya Amelia Candrasari | 24060123130072

public class MRuang{
    public static void main(String[] args) {
        Departemen I, F, M;
        RuangKelas R1, R2, R3;
        RuangDosen D1, D2, D3;
        RuangDepartemen d1, d2, d3;
        LabKom Lk1, Lk2, Lk3;
        LabMatkul L1, L2, L3;
        
        I = new Departemen("Informatika", "Aris", 1000);
        F = new Departemen("Fisika", "Fishman", 750);
        M = new Departemen("Matematika", "Mathman", 600);

        R1 = new RuangKelas("E101", 5, 5, 5, 50, 50, 2);
        R2 = new RuangKelas("K201", 7, 4, 5, 40, 40, 3);
        R3 = new RuangKelas("B103", 6, 5, 5, 45, 45, 1);
        RuangKelas.setTarif(100000);

        D1 = new RuangDosen("E201", 3, 3, 4, 5, 3, 3, "Aris", I);
        D2 = new RuangDosen("E301", 3, 3, 4, 5, 2, 3, "Yeva", F);
        D3 = new RuangDosen("A301", 3, 2, 4, 5, 2, 3, "Etna", M);

        d1 = new RuangDepartemen("G101", 10, 10, 5, 50, 10, 12, 6, I);
        d2 = new RuangDepartemen("K303", 10, 10, 5, 50, 10, 12, 6, F);
        d3 = new RuangDepartemen("A302", 10, 10, 5, 50, 10, 12, 6, M);

        Lk1 = new LabKom("A301", 5, 5, 3, 25, "A", 1000000, 25);
        Lk2 = new LabKom("E202", 5, 5, 3, 25, "B", 1200000, 25);
        Lk3 = new LabKom("E203", 5, 5, 3, 25, "C", 1150000, 25);

        L1 = new LabMatkul("K103", 5, 10, 5, 20, "BioKimia", 1000000, "BioKimia");
        L2 = new LabMatkul("K203", 5, 10, 5, 20, "GeoFisika", 1000000, "Geofisika");
        L3 = new LabMatkul("K202", 5, 10, 5, 20, "Thermodinamika", 1000000, "Thermodinamika");

        R1.printInfo();
        R2.printInfo();
        R3.printInfo();
        System.out.println("\n");
        D1.printInfo();
        D2.printInfo();
        D3.printInfo();
        System.out.println("\n");
        d1.printInfo();
        d2.printInfo();
        d3.printInfo();
        System.out.println("\n");
        Lk1.printInfo();
        Lk2.printInfo();
        Lk3.printInfo();
        System.out.println("\n");
        L1.printInfo();
        L2.printInfo();
        L3.printInfo();
    }
}