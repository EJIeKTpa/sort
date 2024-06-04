package ru.kk.sort.service;

public class QuickSort {
    public static void quicksort(String[] arr, int low, int high) {
        if (arr.length == 0 || low >= high) return;
        int middle = low + (high - low) / 2;
        String str = arr[middle];
        int i = low, j = high;
        while (i <= j) {
            while (arr[i].compareTo(str) < 0) {
                i++;
            }
            while (arr[j].compareTo(str) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                i++;
                j--;
            }
        }
        if (low < j) quicksort(arr, low, j);
        if (high > i) quicksort(arr, i, high);
    }
}
