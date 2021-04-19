/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

/**
 *
 * @author dania
 */
public class BubbleSort {
    // show
    static void show(int[] arr) {
        System.out.print("Array sebelum diurutkan\t\t\t: ");
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    // ascending
    static void BubbleSortASC(int[] arr) {
        int panjang = arr.length;
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < panjang; i++) {
            for (int j = 1; j < (panjang - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    // swap
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                    swap = true;
                    if (swap) {
                        swap_count++;
                    }
                }
            }
        }

        System.out.print("Array setelah diurutkan ASCENDING\t: ");
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("Jumlah perbandingan : " + swap_count);
    }

    // descending
    static void BubbleSortDESC(int[] arr) {
        int temp = 0;
        boolean swap = false;
        int swap_count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    swap = true;
                    if (swap) {
                        swap_count++;
                    }
                }
            }
        }

        System.out.print("Array setelah diurutkan DESCENDING\t: ");
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        System.out.println("Jumlah perbandingan : " + swap_count);
    }

    public static void main(String[] args) {
        int[] number = {2, 5, 3, 6, 8, 3, 1};
        show(number);
        BubbleSortASC(number);
        BubbleSortDESC(number);
    }
}


