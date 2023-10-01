package ru.kk.task8week._main;

import ru.kk.task8week.service.BubbleSort;

import java.util.Arrays;

import static ru.kk.task8week.service.MergeSort.mergeSort;
import static ru.kk.task8week.service.QuickSort.quicksort;
import static ru.kk.task8week.service.SelectionSort.selectionsort;
import static ru.kk.task8week.service.SortByVowelCount.sortbyvowelcount;

public class _Main {
    public static void main(String[] args) {
//1
        String[] fruits = {"apple", "orange", "grape", "banana"};
        quicksort(fruits, 0, fruits.length - 1);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
//2
        String[][] students = {
                {"Иванов", "4.5"},
                {"Петров", "3.7"},
                {"Сидоров", "4.2"},
                {"Козлов", "5.0"},
                {"Смирнов", "3.9"}
        };
        BubbleSort.bubblesort(students);
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                double grade1 = Double.parseDouble(students[j][1]);
                double grade2 = Double.parseDouble(students[j + 1][1]);
                if (grade1 < grade2) {
                    String[] temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (String[] student : students) {
            System.out.println(Arrays.toString(student));
        }
//3
        String[] words = {"cat", "orange", "elephant", "bird"};
        mergeSort(words);
        for (String word : words) {
            System.out.println(word);
        }
        //System.out.println(Arrays.toString(words));
//4
        sortbyvowelcount(words);
        System.out.println(Arrays.toString(words));
//5
        String[] formulas = {
                "5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"
        };
        selectionsort(formulas);
        System.out.println(Arrays.toString(formulas));
    }
}