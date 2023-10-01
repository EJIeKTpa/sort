package ru.kk.task8week.service;

public class BubbleSort {
    public static void bubblesort(String[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j][0].compareTo(arr[j+1][0]) > 0) {
                    String[] temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}