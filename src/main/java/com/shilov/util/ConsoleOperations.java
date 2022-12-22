package com.shilov.util;

import com.shilov.exceptions.TaskException;
import java.util.Scanner;

public class ConsoleOperations {

    private static final String NO_DATA_MESSAGE = "Нет данных на входе";

    private ConsoleOperations() {}

    public static double readDoubleNumberFromConsole() throws TaskException {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                if (scanner.hasNext()) {
                    String input = scanner.next();
                    throw new TaskException("Введено: " + input + ". Неверный формат числа");
                } else {
                    throw new TaskException(NO_DATA_MESSAGE);
                }
            }
        }
    }

    public static String readLineFromConsole() throws TaskException {
        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNext()) {
                return scanner.nextLine();
            } else {
                throw new TaskException(NO_DATA_MESSAGE);
            }
        }
    }
}
