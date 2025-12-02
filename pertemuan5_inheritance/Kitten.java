/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5_inheritance;

/**
 *
 * @author MSI
 */
public class Kitten extends Cat {

    public Kitten(String name, int age) {
        super(name, age);
    }

    @Override
    public void sound() {
        System.out.println("Mini meow!");
    }
}

