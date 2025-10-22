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
class Burung extends Enemy{
    void walk (){
        System.out.println("jalan-jalan");
    }
    void jump (){
        System.out.println("loncat-loncat!");
    }
    void fly (){
        System.out.println("terbang!");
    }
}
