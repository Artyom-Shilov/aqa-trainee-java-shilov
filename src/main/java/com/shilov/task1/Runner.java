package com.shilov.task1;

import com.shilov.util.ConsoleOperations;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Задание 1 - старт");
        logger.info("Введите число:");
        try {
            double number = ConsoleOperations.readDoubleNumberFromConsole();
            logger.info("Введено число {}", number);
            new GreeterByNumber().sayHelloIfNumberSuits(number);
        } catch (Exception e) {
           logger.error(e.getMessage());
        }
        logger.info("Задание 1 - завершение");
    }
}
