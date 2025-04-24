// Nama File : TestPolimorfisme.java
// Deskripsi : main class untuk simulasi 
// Nama||NIM : natasya amelia candrasari || 24060123130072
// Tanggal   : 24/10/2024

import java.util.ArrayList;

public class TestPolimorfisme {

    public static void main(String[] args) {

        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");


        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }

        // untuk soal no 3
        // Programmer pegawai4 = new Programmer("Budi");
        // Manajer pegawai5 = new Manajer("Larry");

        // ArrayList<Programmer> programmers = new ArrayList<>();
        // ArrayList<Manajer> manajers = new ArrayList<>();
        // programmers.add(pegawai4);
        // manajers.add(pegawai5);

        // for (Programmer pro : programmers) {
        //     pro.tampilData();
        // }

        // for (Manajer man : manajers) {
        //     man.tampilData();
        // }
    }
}

// Jawaban

// 2
// Manfaat polimorfisme : polimorfisme inklusi yang digunakan pada 
// kasus ini memungkinkan objek kelas turunan {Prgrammer, Manajer } 
// diperlakukan sebagai objek kelas induk {Pegawai} sehingga semua
// objek bisa disimpan dalam ArrayList dengan tipe Pegawai meskipun
// mereka memiliki perilaku {method} yang berbeda.

// 3
// Jika inklusi tidak diterapkan pada pegawai4 dan pegawai5 maka objek
// harus ditampung dalam array yang berbeda tiap kelasnya sehingga
// kita tidak bisa menggunakan 1 loop saja untuk memanggil tiap objek.
