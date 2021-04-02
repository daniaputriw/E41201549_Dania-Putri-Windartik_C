/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w04_tugas;

import java.util.Scanner;

/**
 *
 * @author dania
 */
public class Tugas_ComputeDataValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n = new Scanner(System.in);
        System.out.println("Masukan banyaknya data nilai: ");
        int nilai = n.nextInt();
        int[] data = new int[nilai];
        
            for (int i = 0; i < data.length; i++) {
                System.out.println("Masukkan  data nilai ke-"+ (i+1) + " : ");
                data[i] = n.nextInt();
        }
            int max = data[0];
            int min = data[0];
            
            for (int i = 0; i < data.length; i++) {
                if (max < data[i]) {
                     max = data [i];
        }
                
            if (min > data[i]) {
                min = data[i];
       
    }
    }
        int avg = 0;
        int sum = 0;
        for (int i : data) {
           sum += i;
        }

        avg = sum / data.length;

        System.out.println("Nilai minimum: " + min);
        System.out.println("Nilai maksimum: " + max);
        System.out.println("Nilai rata ratanya adalah: " + avg);
    }
}

