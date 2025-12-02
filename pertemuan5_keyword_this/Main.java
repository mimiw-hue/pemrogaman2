/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5_keyword_this;

/**
 *
 * @author MSI
 */
class Product {
    private String name;
    private int price;

    // Constructor 1
    public Product() {
        this("Produk Default", 0);  // Memanggil constructor lain
    }

    // Constructor 2
    public Product(String name, int price) {
        this.name = name;   // membedakan variabel instance dengan parameter
        this.price = price;
    }

    public void printDetail() {
        System.out.println("Nama Produk: " + this.name);
        System.out.println("Harga       : " + this.price);
        this.showSelf();  // memanggil metode lain menggunakan this
    }

    public void showSelf() {
        System.out.println("Objek saat ini   : " + this);
    }
}

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product("Kopi Sachet", 3000);

        p1.printDetail();
        System.out.println();
        p2.printDetail();
    }
}
