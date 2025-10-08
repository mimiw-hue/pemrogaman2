/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author pc7
 */

public class Kucing {
    String nama;
    String warna;
    String jenis;

    public Kucing(String nama,String warna, String jenis){
    this.nama = nama;
    this.warna = warna;
    this.jenis = jenis;
    }
    void mengeong() {
        System.out.println(nama + " berkata: Meong!");
    }

    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Warna: " + warna);
        System.out.println("Jenis: " + jenis);
    }
}

