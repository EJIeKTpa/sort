package ru.kk.task8week.service;

import java.util.Arrays;

public class SortByVowelCount {
    public static void sortbyvowelcount(String[] arr) {
        Arrays.sort(arr, (s1, s2) -> {
            int vowelCount1 = countVowels(s1);
            int vowelCount2 = countVowels(s2);
            return Integer.compare(vowelCount1, vowelCount2);
        });
    }

    private static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
