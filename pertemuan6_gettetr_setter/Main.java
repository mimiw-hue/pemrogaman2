/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6_gettetr_setter;

/**
 *
 * @author MSI
 */
class Buku {
    private String judul;
    private String penulis;
    private int tahun;

    // Setter
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    // Getter
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahun() {
        return tahun;
    }
}

public class Main {
    public static void main(String[] args) {
        Buku b1 = new Buku();

        // Memasukkan data lewat setter
        b1.setJudul("Pemrograman Java untuk Pemula");
        b1.setPenulis("Agung Ganteng");
        b1.setTahun(2025);

        // Mengambil data lewat getter
        System.out.println("Judul  : " + b1.getJudul());
        System.out.println("Penulis: " + b1.getPenulis());
        System.out.println("Tahun  : " + b1.getTahun());
    }
}
