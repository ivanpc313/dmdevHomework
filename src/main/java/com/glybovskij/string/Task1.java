package com.glybovskij.string;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */
public class Task1 {

    public static void main(String[] args) {

        String value = "abc Cpddd Dio OsfWw";
        toUpperDistinctString(value);
    }

    private static void toUpperDistinctString(String value) {
        String replace = value.replace(" ", "");
        StringBuilder resultString = new StringBuilder();
        String upperCaseString = replace.toUpperCase();
        char lastSymbol = upperCaseString.charAt(upperCaseString.length() - 1);
        for (int i = 0; i < upperCaseString.length() - 1; i++) {
            if (upperCaseString.charAt(i) != upperCaseString.charAt(i + 1)) {
                resultString.append(upperCaseString.charAt(i));
            }
        }
        resultString.append(lastSymbol);
        System.out.println(resultString);
    }
}


