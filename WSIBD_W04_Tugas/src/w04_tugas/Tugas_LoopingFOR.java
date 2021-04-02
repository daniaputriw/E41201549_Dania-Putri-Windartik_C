/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w04_tugas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author dania
 */
public class Tugas_LoopingFOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        int nilai = 0;
            System.out.print("Masukan banyaknya data nilai: ");
            nilai = n.nextInt();
        int[] data = new int[nilai];

        for (int i = 0; i < nilai; i++) {
            System.out.print("Masukkan  data nilai ke-" + i + " : ");
            data[i] = n.nextInt();
        }

            System.out.println("Tampilan data nilai yang dimasukkan: ");
            System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ");
        }
            System.out.println("]");

        Arrays.sort(data);
            System.out.println("Pengurutan nilai dari yang terkecil - terbesar: ");
         
            System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + " ");
        }
            System.out.print("]");
    }
}