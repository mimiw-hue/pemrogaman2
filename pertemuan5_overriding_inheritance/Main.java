/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5_overriding_inheritance;

/**
 *
 * @author MSI
 */
// Superclass
class Animal {
    public void sound() {
        System.out.println("Hewan ini mengeluarkan suara.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog: Guk guk!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat: Meong!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Animal d = new Dog();
        Animal c = new Cat();

        a.sound();  // pakai method di Animal
        d.sound();  // overriding dari Dog
        c.sound();  // overriding dari Cat
    }
}

