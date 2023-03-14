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
        System.out.println(toUpperDistinctString(value));
    }

    private static StringBuilder toUpperDistinctString(String value) {
        String upperCaseValue = value.replace(" ", "").toUpperCase();
        StringBuilder resultString = new StringBuilder();
        char lastSymbol = upperCaseValue.charAt(upperCaseValue.length() - 1);
        for (int i = 0; i < upperCaseValue.length() - 1; i++) {
            if (upperCaseValue.charAt(i) != upperCaseValue.charAt(i + 1)) {
                resultString.append(upperCaseValue.charAt(i));
            }
        }
        resultString.append(lastSymbol);
        return resultString;
    }
}


