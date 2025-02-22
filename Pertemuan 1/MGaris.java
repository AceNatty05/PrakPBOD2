public class MGaris {
    public static void main(String[] args) {
        // Variabel
        Garis G1, G2, G3, G4, G5;
        Titik T; // temporary saja
        boolean B;

        // TESTING METHOD
        System.out.println("***** Konstruktor tanpa parameter *****");
        G1 = new Garis();
        System.out.println("Telah dibuat Garis G1 dengan detail :");
        G1.printTitikAwalAkhir();

        System.out.println("\n***** Konstruktor dengan parameter *****");
        G2 = new Garis(new Titik(2,2), new Titik(4,1)); // ga usah disimpan, kayak penting aja
        System.out.println("Telah dibuat Garis G2 dengan detail :");
        G2.printTitikAwalAkhir();
        G3 = new Garis(new Titik(), new Titik(7,3)); // ga usah disimpan, kayak penting aja
        System.out.println("Telah dibuat Garis G3 dengan detail :");
        G3.printTitikAwalAkhir();
        G4 = new Garis(new Titik(2,5), new Titik(5,-2)); // ga usah disimpan, kayak penting aja
        System.out.println("Telah dibuat Garis G4 dengan detail :");
        G4.printTitikAwalAkhir();
        G5 = new Garis(new Titik(4,7), new Titik(7,0)); // ga usah disimpan, kayak penting aja
        System.out.println("Telah dibuat Garis G5 dengan detail :");
        G5.printTitikAwalAkhir();

        // NOTES : G1 tegak lurus G2, G3 tegak lurus G4 (floating), G5 // G4

        System.out.println("\n***** Selektor *****");
        System.out.println("Titik Awal G2 = ");
        T = G2.getTitikAwal(); T.printTitik();
        System.out.println("Titik Akhir G2 = ");
        T = G2.getTitikAkhir(); T.printTitik();
        System.out.println("Banyak garis = " + Garis.getCounterGaris());

        System.out.println("\n***** Mutator *****");
        System.out.println("Awalnya Garis G1 terbuat dari :");
        G1.printTitikAwalAkhir();
        System.out.println("Lalu kita ubah menjadi :");
        G1.setTitikAwal(new Titik(4,3)); G1.setTitikAkhir(new Titik(6,7));
        G1.printTitikAwalAkhir();

        System.out.println("\n***** METHOD LAIN *****");

        System.out.println("\n***** printTitikAwalAkhir *****");
        System.out.print("Detail garis G1 : "); G1.printTitikAwalAkhir(); 
        System.out.print("Detail garis G2 : "); G2.printTitikAwalAkhir(); 
        System.out.print("Detail garis G3 : "); G3.printTitikAwalAkhir(); 
        System.out.print("Detail garis G4 : "); G4.printTitikAwalAkhir(); 
        System.out.print("Detail garis G5 : "); G5.printTitikAwalAkhir();

        System.out.println("\n***** getPanjangGaris *****");
        System.out.println("Panjang garis G1 = " + G1.getPanjangGaris() + " satuan");
        System.out.println("Panjang garis G2 = " + G2.getPanjangGaris() + " satuan");
        System.out.println("Panjang garis G3 = " + G3.getPanjangGaris() + " satuan");
        System.out.println("Panjang garis G4 = " + G4.getPanjangGaris() + " satuan");
        System.out.println("Panjang garis G5 = " + G5.getPanjangGaris() + " satuan");

        System.out.println("\n***** getGradien *****");
        System.out.println("Gradien garis G1 = " + G1.getGradien());
        System.out.println("Gradien garis G2 = " + G2.getGradien());
        System.out.println("Gradien garis G3 = " + G3.getGradien());
        System.out.println("Gradien garis G4 = " + G4.getGradien());
        System.out.println("Gradien garis G5 = " + G5.getGradien());

        System.out.println("\n***** getTitikTengah *****");
        System.out.print("Titik tengah G1 :"); T = G1.getTitikTengah(); T.printTitik();
        System.out.print("Titik tengah G2 :"); T = G2.getTitikTengah(); T.printTitik();
        System.out.print("Titik tengah G3 :"); T = G3.getTitikTengah(); T.printTitik();
        System.out.print("Titik tengah G4 :"); T = G4.getTitikTengah(); T.printTitik();
        System.out.print("Titik tengah G5 :"); T = G5.getTitikTengah(); T.printTitik();

        System.out.println("\n***** printPersamaanGaris *****");
        System.out.print("Persamaan garis G1 : "); G1.printPersamaanGaris();
        System.out.print("Persamaan garis G2 : "); G2.printPersamaanGaris();
        System.out.print("Persamaan garis G3 : "); G3.printPersamaanGaris();
        System.out.print("Persamaan garis G4 : "); G4.printPersamaanGaris();
        System.out.print("Persamaan garis G5 : "); G5.printPersamaanGaris();

        System.out.println("\n***** PREDIKAT *****");

        System.out.println("\n***** isSejajar *****");
        B = G1.isSejajar(G2);
        System.out.print("Apakah G1 sejajar G2 : ");
        if (B) {
            System.out.println("YA");
        }
        else {
            System.out.println("TIDAK");
        }
        B = G4.isSejajar(G5);
        System.out.print("Apakah G4 sejajar G5 : ");
        if (B) {
            System.out.println("YA");
        }
        else {
            System.out.println("TIDAK");
        }

        System.out.println("\n***** isTegakLurus *****");
        B = G1.isTegakLurus(G2);
        System.out.print("Apakah G1 tegak lurus G2 : ");
        if (B) {
            System.out.println("YA");
        }
        else {
            System.out.println("TIDAK");
        }
        B = G3.isTegakLurus(G4);
        System.out.print("Apakah G3 tegak lurus G4 : ");
        if (B) {
            System.out.println("YA");
        }
        else {
            System.out.println("TIDAK");
        }
        System.out.println("NOTE : Kecewa, ternyata float * float tetep bisa = -1\n YEEEE KELARR");
    }
}