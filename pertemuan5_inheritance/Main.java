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
public class Main {
    public static void main(String[] args) {

        Pet generic = new Pet("Unknown", 1);
        Dog dog = new Dog("Buddy", 3);
        Puppy puppy = new Puppy("Choco", 1);
        Cat cat = new Cat("Mimi", 2);
        Kitten kitten = new Kitten("Snow", 1);

        generic.showInfo();
        generic.sound();

        System.out.println();

        dog.showInfo();
        dog.sound();

        System.out.println();

        puppy.showInfo();
        puppy.sound();

        System.out.println();

        cat.showInfo();
        cat.sound();

        System.out.println();

        kitten.showInfo();
        kitten.sound();
    }
}

