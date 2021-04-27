/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author dania
 */
public class C extends B {
    C() { // super(); Tambahkan kode secara otomatis oleh Java untuk memanggil 
          // Konstruktor dari SuperClas
          
        super(); // Konstruktor default daei Class B
                 // Object dipanggil
        System.out.println("Konstruktor Class C dieksekusi...");
    }   
}
