/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_palimorfisme_statis;

/**
 *
 * @author MSI
 */
class Kalkulator {

    // Menjumlahkan dua angka
    public int tambah(int a, int b) {
        return a + b;
    }

    // Menjumlahkan tiga angka
    public int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Menjumlahkan dua angka tapi tipe double
    public double tambah(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        System.out.println("Hasil tambah 2 int     : " + k.tambah(5, 7));
        System.out.println("Hasil tambah 3 int     : " + k.tambah(1, 2, 3));
        System.out.println("Hasil tambah 2 double  : " + k.tambah(2.5, 3.8));
    }
}
