// Nama file : MainObjek.java
// Deskripsi : main untuk menjalankan method yang sudah dibuat
// Nama | NIM : Natasya Amelia Candrasari | 24060123130072

public class MainObjek{
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // ga bisa ya bikin pake konstruktor abstrak
        BangunDatar P1 = new Persegi(10);
        Persegi P2 = new Persegi(5);
        BangunDatar L1 = new Lingkaran(7);
        Lingkaran L2 = new Lingkaran (14);

        System.out.println("Info Persegi 1");
        P1.printInfo();
        System.out.println("\nInfo Persegi 2");
        P2.printInfo();
        System.out.println("\nInfo Lingkaran 1");
        L1.printInfo();
        System.out.println("\nInfo Lingkaran 2");
        L2.printInfo();
    }
}