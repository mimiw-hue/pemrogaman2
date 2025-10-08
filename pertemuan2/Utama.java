/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan2;

/**
 *
 * @author pc7
 */

public class Utama {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("ILHAM", "HITAM", "INDIAN CAT");
        kucing1.tampilkanInfo();
        kucing1.mengeong();
        
        Kucing kucing2 = new Kucing ("RIDWAN", "KONENG", "KAMPUNG");
        kucing2.tampilkanInfo();
        kucing2.mengeong();
    }
}

