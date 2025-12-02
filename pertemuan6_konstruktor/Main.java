/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_konstruktor;

/**
 *
 * @author MSI
 */
class Mahasiswa {
    String nama;
    int umur;
    String jurusan;

    // Constructor
    Mahasiswa(String nama, int umur, String jurusan) {
        this.nama = nama;
        this.umur = umur;
        this.jurusan = jurusan;
    }

    void info() {
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("Jurusan : " + jurusan);
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek dengan constructor
        Mahasiswa m1 = new Mahasiswa("Agung", 21, "Ilmu Komputer");

        // Menampilkan data
        m1.info();
    }
}

