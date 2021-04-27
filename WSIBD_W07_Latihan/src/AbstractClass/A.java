/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author dania
 */
public abstract class A { // Deklarasi Class
    abstract public void method2(); // Deklarasi method abstrak
    // Method konkrit yang memiliki implementasi
    public void method1() {
        System.out.println ("Method konkrit dari class A");
    }
}
