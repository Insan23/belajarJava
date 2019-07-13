/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coba.ContohKode.selectionsort;

/**
 *
 * @author Mella
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] data = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] dataSetelahSort = selectionSort(data);
        for (int i = 0; i < dataSetelahSort.length; i++) {
            System.out.print(dataSetelahSort[i] + ", ");
        }
    }

    //method untuk sorting selectiion
    public static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int minNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = minNumber;
        }
        return arr;
    }

}
