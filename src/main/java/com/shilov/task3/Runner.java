package com.shilov.task3;

import com.shilov.util.ConsoleOperations;
import com.shilov.util.DataFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Задание 3 - старт");
        try {
            logger.info("Введите целые числа через пробел");
            String input = ConsoleOperations.readLineFromConsole();
            logger.info("Введено {}", input);
            new NumberProcessor().findMultiplesOfNumber(DataFormatter.parseStringToIntegerList(input));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        logger.info("Задание 3 - завершение");
    }
}
