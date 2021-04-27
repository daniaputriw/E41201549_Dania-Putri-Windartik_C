/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author dania
 */
public class B extends A {  // Mendeklarasikan Class B yang diturunkan
    int z;                  // dari Class A
    
    void TampilkanNilaiXY(){
        // subClass dapat mengakses member dari superClass
        System.out.println("Jumlah : " + (x+y+z));
    }
}
