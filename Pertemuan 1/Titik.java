/* Nama File : Titik.java
   Deskripsi : berisi atribut dan method dalama class Titik
   Pembuat   : Natasya Amelia Candrasari / 24060123130072
   Tanggal   : 19/02/2025
*/ 

public class Titik {
    /*ATRIBUT*/
    double absis, ordinat;
    static int counterTitik = 0;

    /*METHOD*/

    /*Konstruktor*/
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    Titik() {
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }


    /*Getter*/
    static int getCounterTitik() {
        return counterTitik;
    }
    /*Mengembalikan nilai absis*/
    double getAbsis() {
        return absis;
    } 
    /*Mengembalikan nilai ordinat*/
    double getOrdinat() {
        return ordinat;
    } 


    /*Setter*/
    /*Mengeset absis dengan nilai x*/
    void setAbsis(double  X) {
        absis = X;
    }
    /*Mengeset Ordinat dengan nilai Y*/
    void setOrdinat(double  Y) {
        ordinat = Y;
    }
    
    /*Menggeser Absis dan Ordinat sejauh X dan Y*/
    void geser(double  X, double Y) {
        absis = absis + X;
        ordinat = ordinat + Y;
    }

    /*Print koordinat Titik*/
    void printTitik() {
        System.out.println("Titik (" + absis + " , " + ordinat + ")");
    }

    /*Mengembalikan Kuadaran*/
    int getKuadaran() {
        if (absis > 0 && ordinat > 0) {
            return 1;
        }
        else if (absis < 0 && ordinat > 0) {
            return 2;
        }
        else if (absis < 0 && ordinat < 0) {
            return 3;
        }
        else if (absis > 0 && ordinat < 0) {
            return 4;
        }
        else {
            return 0;
        }
    }

    /*Mengembalikan jarak TItik ke pusat*/
    double getJarakPusat() {
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
    }

    /*Mengembalikan jarak 2 Titik*/
    double getJarak(Titik T) {
        return Math.sqrt((absis - T.getAbsis())*(absis - T.getAbsis()) + (ordinat - T.getOrdinat())*(ordinat - T.getOrdinat()));
    }

    /*Refleksi Titik dengan sumbu X*/
    void refleksiX() {
        this.ordinat = ordinat*(-1);
    }

    /*Refleksi Titik dengan sumbu Y*/
    void refleksiY() {
        this.absis = absis*(-1);
    }

    /*Mengembalikan hasil refleksi sumbu X*/
    Titik getRefleksiX() {
        return new Titik(absis , ordinat*(-1));
    }

    /*Mengembalikan hasil refleksi sumbu X*/
    Titik getRefleksiY() {
        return new Titik(absis*(-1) , ordinat);
    }
}