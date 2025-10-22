/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_modifier;

/**
 *
 * @author MSI
 */
public class Utama {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("2455201006", "Rizky Agung D", 3);
        
        m1.nilaitambahan(0.5); // prosedur awal
        m1.tampilData();

        // contoh prosedur parameter
        m1.ubahNama("Rizky Agung Dermawan");
        
        // contoh fungsi parameter
        double hasilAkhir = m1.hitungNilaiAkhir(3.5, 4);
        System.out.println("Nilai Akhir: " + hasilAkhir);

        System.out.println("Predikat: " + m1.predikat());
    }
}
