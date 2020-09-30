package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int indexWord = 0; indexWord < word.length; indexWord++) {
            for (int indexPref = 0; indexPref < pref.length; indexPref++) {
                result = word[indexWord] == pref[indexPref];
            }
        }
        return result;
    }
}
