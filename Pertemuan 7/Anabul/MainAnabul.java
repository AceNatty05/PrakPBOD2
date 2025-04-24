// Nama File : MainAnabul.java
// Deskripsi : main class untuk simulasi class Anabul & childnya
// Nama||NIM : natasya amelia candrasari || 24060123130072
// Tanggal   : 24/10/2024

public class MainAnabul{
    public static void main(String[] args) {
        // Anabul
        System.out.println("***** ***** ***** Anabul ***** ***** *****");
        Anabul A = new Anabul();
        A.Gerak();
        A.Bersuara();
        System.out.println("");

        // Kucing
        System.out.println("***** ***** ***** Kucing ***** ***** *****");
        Kucing K = new Kucing();
        K.Gerak();
        K.Bersuara();
        System.out.println("");

        // Anjing
        System.out.println("***** ***** ***** Anjing ***** ***** *****");
        Anjing Aj = new Anjing();
        Aj.Gerak();
        Aj.Bersuara();
        System.out.println("");

        // Anabul
        System.out.println("***** ***** ***** Burung ***** ***** *****");
        Burung B = new Burung();
        B.Gerak();
        B.Bersuara();
    }
}