/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7_palimorfisme_dinamis;

/**
 *
 * @author MSI
 */
// Superclass
class Hewan {
    public void suara() {
        System.out.println("Hewan mengeluarkan suara...");
    }
}

// Subclass 1
class Kucing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Kucing: Meong!");
    }
}

// Subclass 2
class Anjing extends Hewan {
    @Override
    public void suara() {
        System.out.println("Anjing: Guk Guk!");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan h1 = new Kucing(); // referensi Hewan, objek Kucing
        Hewan h2 = new Anjing(); // referensi Hewan, objek Anjing

        h1.suara();  // memanggil suara() versi Kucing
        h2.suara();  // memanggil suara() versi Anjing
    }
}

