/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan4_inheritance;

/**
 *
 * @author MSI
 */
public class utama {
    public static void main(String[] args) {
        Enemy bahlil = new Enemy ();
        Zombie sahroni = new Zombie ();
        Pocong puan = new Pocong ();
        Burung jonikecil = new Burung ();
        
        bahlil.attack();
        sahroni.walk();
        puan.jump();
        jonikecil.walk();
        jonikecil.jump();
        jonikecil.fly();
    }
}
