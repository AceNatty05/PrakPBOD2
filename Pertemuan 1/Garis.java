public class Garis {
    // ATRIBUT
    Titik awal, akhir; // titik awal dan titik akhir
    static int counterGaris = 0;

    // METHOD

    // KONSTRUKTOR
    // Konstruktor dengan input titik awal & akhir
    Garis(Titik awal, Titik akhir) {
        this.awal = awal;
        this.akhir = akhir;
        counterGaris++;
    }
    // Konstruktor dengan inisiasi titik awal (0,0) dan titik akhir (1,1)
    Garis() {
        this.awal = new Titik();
        this.akhir = new Titik(1,1);
        counterGaris++;
    }

    // SELEKTOR
    Titik getTitikAwal() {
        return awal;
    }
    Titik getTitikAkhir() {
        return akhir;
    }
    static int getCounterGaris() {
        return counterGaris;
    }

    // MUTATOR
    void setTitikAwal (Titik awal) {
        this.awal = awal;
    }
    void setTitikAkhir(Titik akhir) {
        this.akhir = akhir;
    }

    // METHOD LAIN
    // Mengembalikan panjang Garis
    double getPanjangGaris() {
        return awal.getJarak(akhir);
    }
    // Mengembalikan gradien garis (m)
    double getGradien() {
        return (awal.ordinat - akhir.ordinat)/(awal.absis - akhir.absis);
    }
    // Mengembalikan titik tengah Garis
    Titik getTitikTengah() {
        return new Titik(((awal.absis + akhir.absis)/2) , ((awal.ordinat + akhir.ordinat)/2));
    }

    // Mengecek apakah garis ini sejajar dengan garis lain
    boolean isSejajar(Garis G) {
        return this.getGradien() == G.getGradien();
    }
    // Mengecek apakah garis ini tegak lurus dengan garis lain
    boolean isTegakLurus(Garis G) {
        return this.getGradien() * G.getGradien() == -1;
    }
    // // Versi lebih presisi, tidak kena galat pembulatan
    // boolean isTegakLurusV2(Garis G) {
    //     return ((this.awal.ordinat - this.akhir.ordinat)*(G.awal.ordinat - G.akhir.ordinat)) / 
    //            ((this.awal.absis - this.akhir.absis)*(G.awal.absis - G.akhir.absis)) == -1;
    // }

    // Udah dicoba ternyata sama saja

    // Menampilkan titik awal dan titik akhir Garis
    void printTitikAwalAkhir() {
        System.out.println("Titik awal = (" + awal.absis + " , " + awal.ordinat + ", titik akhir = (" + akhir.absis + " , " + akhir.ordinat + ")");
    }
    // Menampilkan persamaan garis dalam bentuk y = mx + c
    void printPersamaanGaris() {
        System.out.println("y = (" + this.getGradien() + ")x + " + (double)(awal.ordinat - (this.getGradien()*awal.absis)));
    }
}