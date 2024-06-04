package ru.kk.sort.service;

public class SelectionSort {
    public static void selectionsort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (getComplexity(arr[j]) < getComplexity(arr[minIndex])) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int getComplexity(String formula) {
        int count = 0;
        for (char c : formula.toCharArray()) {
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                count++;
            }
        }
        return count;
    }
}
