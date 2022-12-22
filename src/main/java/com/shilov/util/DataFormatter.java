package com.shilov.util;

import com.shilov.exceptions.TaskException;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class DataFormatter {

    private DataFormatter() {}

    private static final String DIVIDER_FOR_NUMBERS =  " ";

    public static List<Integer> parseStringToIntegerList(String input) throws TaskException {
        String[] pieces = input.trim().split(DIVIDER_FOR_NUMBERS);
        List<Integer> numbers = new ArrayList<>();
        for (String string : pieces) {
            try {
                numbers.add(Integer.parseInt(string));
            } catch (NumberFormatException e) {
                throw new TaskException("Ошибка ввода");
            }
        }
        return numbers;
    }

    public static String checkIfStringHasNameFormat(String input) throws TaskException {
        Pattern pattern = Pattern.compile("[^a-zA-Za-åa-ö-w-я]", Pattern.CASE_INSENSITIVE);
        if (pattern.matcher(input).find() || input.isEmpty()) {
            throw new TaskException("Формат ввода не соотвествует имени");
        }
        return input;
    }
}
