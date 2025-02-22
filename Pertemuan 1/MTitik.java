public class MTitik {
    public static void main(String[] args) {
        // Variabel
        Titik T1, T2, T3, T4, T5, T6, T7, T;

        // Testing Method
        System.out.println("***** KONSTRUKTOR tanpa parameter *****");
        T1 = new Titik();
        System.out.print("Telat dibuat T1 dengan detail : ");
        T1.printTitik();

        System.out.println("\n***** KONSTRUKTOR dengan parameter *****");
        T2 = new Titik(4,6);
        System.out.print("Telat dibuat T2 dengan detail : ");
        T2.printTitik();
        T3 = new Titik(-7,3);
        System.out.print("Telat dibuat T3 dengan detail : ");
        T3.printTitik();
        T4 = new Titik(-25,-5);
        System.out.print("Telat dibuat T4 dengan detail : ");
        T4.printTitik();
        T5 = new Titik(87,-537);
        System.out.print("Telat dibuat T5 dengan detail : ");
        T5.printTitik();

        T6 = new Titik(0,24);
        System.out.print("Telat dibuat T6 dengan detail : ");
        T6.printTitik();
        T7 = new Titik(-2455,0);
        System.out.print("Telat dibuat T7 dengan detail : ");
        T7.printTitik();

        System.out.println("\n***** SELEKTOR *****");
        System.out.println("Absis T1 : " + T1.getAbsis());
        System.out.println("Absis T3 : " + T3.getAbsis());
        System.out.println("Absis T4 : " + T4.getAbsis());
        System.out.println("Ordinat T2 : " + T2.getOrdinat());
        System.out.println("Ordinat T5 : " + T5.getOrdinat());
        System.out.println("Ordinat T6 : " + T6.getOrdinat());
        System.out.println("Banyak titik (T7): " + T7.getCounterTitik());
        System.out.println("Banyak titik : " + Titik.getCounterTitik());

        System.out.println("\n***** MUTATOR *****");
        System.out.print("Set absis T2 dengan 8 sehingga menjadi : ");
        T2.setAbsis(8); T2.printTitik();
        System.out.print("Set absis T3 dengan -24 sehingga menjadi : ");
        T3.setAbsis(-24); T3.printTitik();
        System.out.print("Set ordinat T4 dengan -2 sehingga menjadi : ");
        T4.setOrdinat(-2); T4.printTitik();
        System.out.print("Set ordinat T5 dengan -34 sehingga menjadi : ");
        T5.setOrdinat(-34); T5.printTitik();
        System.out.print("Geser T5 absis sejauh -4 dan ordinat 24 menjadi :");
        T5.geser(-4, 24); T5.printTitik();

        System.out.println("\n***** printTitik *****");
        T1.printTitik();
        T2.printTitik();
        T3.printTitik();
        T4.printTitik();
        T5.printTitik();
        T6.printTitik();
        T7.printTitik();

        System.out.println("\n***** getKuadran *****");
        System.out.println("Jika hasil kuadaran = 0, maka titik kemungkinan memotong sumbu x dan atau memotong sumbu y");
        System.out.println("T1 ada di kuadran" + T1.getKuadaran());
        System.out.println("T2 ada di kuadran" + T2.getKuadaran());
        System.out.println("T3 ada di kuadran" + T3.getKuadaran());
        System.out.println("T4 ada di kuadran" + T4.getKuadaran());
        System.out.println("T5 ada di kuadran" + T5.getKuadaran());
        System.out.println("T6 ada di kuadran" + T6.getKuadaran());
        System.out.println("T7 ada di kuadran" + T7.getKuadaran());

        System.out.println("\n***** getJarakPusat *****");
        System.out.println("Jarak T1 ke pusat = " + T1.getJarakPusat() + " satuan");
        System.out.println("Jarak T2 ke pusat = " + T2.getJarakPusat() + " satuan");
        System.out.println("Jarak T3 ke pusat = " + T3.getJarakPusat() + " satuan");
        System.out.println("Jarak T4 ke pusat = " + T4.getJarakPusat() + " satuan");
        System.out.println("Jarak T5 ke pusat = " + T5.getJarakPusat() + " satuan");
        System.out.println("Jarak T6 ke pusat = " + T6.getJarakPusat() + " satuan");
        System.out.println("Jarak T7 ke pusat = " + T7.getJarakPusat() + " satuan");

        System.out.println("\n***** getJarak *****");
        System.out.println("Jarak T1 ke T2 = " + T1.getJarak(T2) + " satuan");
        System.out.println("Jarak T2 ke T4 = " + T2.getJarak(T4) + " satuan");
        System.out.println("Jarak T5 ke T7 = " + T5.getJarak(T7) + " satuan");
        System.out.println("Jarak T1 ke T7 = " + T1.getJarak(T7) + " satuan");

        System.out.println("\n***** refleksi *****");
        System.out.print("Hasil refleksi T2 ke sumbu x : "); T2.refleksiX(); T2.printTitik();
        System.out.print("Hasil refleksi T3 ke sumbu x : "); T3.refleksiX(); T3.printTitik();
        System.out.print("Hasil refleksi T4 ke sumbu x : "); T4.refleksiX(); T4.printTitik();
        System.out.print("Hasil refleksi T5 ke sumbu y : "); T5.refleksiY(); T5.printTitik();
        System.out.print("Hasil refleksi T6 ke sumbu y : "); T6.refleksiY(); T6.printTitik();
        System.out.print("Hasil refleksi T6 ke sumbu y : "); T7.refleksiY(); T7.printTitik();

        System.out.println("\n***** getRefleksi *****");
        System.out.print("Awalnya T2 : "); T2.printTitik();
        T = T2.getRefleksiX(); 
        System.out.print("Lalu T merupakan titik baru hasil refleksi T2 ke sumbu x, yaitu : "); T.printTitik();
        System.out.print("Absis T diubah menjadi 46 sehingga T menjadi : ");
        T.setAbsis(46); T.printTitik();
        System.out.print("Seharusnya Absis T tidak sama dengan T2, T2 : "); T2.printTitik();
        System.out.println("\nKita coba juga dengan T3");
        System.out.print("Awalnya T3 : "); T3.printTitik();
        T = T3.getRefleksiY();
        System.out.print("Lalu T merupakan titik baru hasil refleksi T3 ke sumbu y, yaitu : "); T.printTitik();
        System.out.print("Absis T diubah menjadi 46 sehingga T menjadi : ");
        T.setAbsis(46); T.printTitik();
        System.out.print("Dan T3 :"); T3.printTitik();
    }
}