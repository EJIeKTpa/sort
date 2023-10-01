package ru.kk.task8week._main;

import ru.kk.task8week.service.BubbleSort;

import java.util.Arrays;

import static ru.kk.task8week.service.QuickSort.quicksort;

public class _Main {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "grape", "banana"};
        quicksort(fruits, 0, fruits.length - 1);
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

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
    }
}