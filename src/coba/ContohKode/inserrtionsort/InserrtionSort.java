package coba.ContohKode.inserrtionsort;

public class InserrtionSort {

    public static void main(String[] args) {
        int[] data = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        System.out.println("Data sebelum sort");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        int dataSetelahSort[] = insertionSort(data);
        System.out.println("");
        for (int i = 0; i < dataSetelahSort.length; i++) {
            System.out.print(dataSetelahSort[i] + ", ");
        }
    }

    public static int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int nilaiCek = arr[i];  // nilaiCek digunakan untuk menyimpan nilai yang akan di bandingkan dengan nilai sebelumnya
            int j = i - 1;          //var j digunakan untuk menghitung indeks dari data yang sudah di cek
            while ((j > -1) && (arr[j] > nilaiCek)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = nilaiCek;
        }
        return arr;
    }
}
