/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w03_tugas;

import java.util.Scanner;

/**
 *
 * @author dania
 */
public class Tugas_SalesSwitchCase {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nomor;
    String nama;
    Scanner masuk = new Scanner(System.in);
        
    System.out.println(" Cafe Ceria");
    System.out.println("Aneka Miunuman");
    System.out.println("---------------------------------------------------------------");
    System.out.println("Special menu"); 
    System.out.println("1. Soft drinks");
    System.out.println("2. Mix juice");
    System.out.println("3. Nescafe");
    System.out.println("4. Soda milk");
    System.out.println("5. Tea");
    System.out.println("---------------------------------------------------------------");
    System.out.println("Masukkan nama pembeli :");
    nama = masuk.nextLine();
    System.out.println("");
    System.out.println("Silahkan masukkan pilihan anda :");
    nomor = masuk.nextInt();
    switch (nomor) {
        case 1:
            System.out.println("Minuman yang anda pesan adalah Soft drinks");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih" + nama + "telah berkunjung di Cafe Ceria");
            break;
        case 2:
            System.out.println("Minuman yang anda pesan adalah Mix juice");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih" + nama + "telah berkunjung di Cafe Ceria");
            break;
        case 3:
            System.out.println("Minuman yang anda pesan adalah Nescafe");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih" + nama + "telah berkunjung di Cafe Ceria");
            break;
        case 4:
            
            System.out.println("Minuman yang anda pesan adalah Soda milk");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih" + nama + "telah berkunjung di Cafe Ceria");
            break;
        case 5:
            System.out.println("Minuman yang anda pesan adalah Tea");
            System.out.println("Pesanan akan segera kami antar");
            System.out.println("Terimakasih" + nama + "telah berkunjung di Cafe Ceria");
            break;
    }
    }
}
    