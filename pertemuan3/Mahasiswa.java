/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3;

/**
 *
 * @author MSI
 */

public class Mahasiswa  {
    String nim = "";
    String nama = "";
    double ipk = 0;
    String predikat = "";
            
    public Mahasiswa(String nim, String nama, double ipk){
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
    }

    void tampilData(){
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("IPK   : " + ipk);
    }

    String predikat(){
        if (ipk >= 3.5){
            predikat = "Cumlaude";
        } else if (ipk >= 3.25){
            predikat = "Sangat Memuaskan";
        } else {
            predikat = "Memuaskan";
        }
        return predikat;
    }

    // prosedur dengan parameter
    void ubahNama(String namaBaru){
        this.nama = namaBaru;
        System.out.println("Nama telah diubah menjadi: " + this.nama);
    }

    // fungsi dengan parameter
    double hitungNilaiAkhir(double nilaiUTS, double nilaiUAS){
        double nilaiAkhir = (nilaiUTS * 0.4) + (nilaiUAS * 0.6);
        return nilaiAkhir;
    }

    void nilaitambahan(double nilaitambahan){
        ipk = ipk + nilaitambahan;
    }
}
