package com.shilov.task2;

import com.shilov.exceptions.TaskException;
import com.shilov.util.DataFormatter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {

    private static Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.info("Задание 2 - старт");
        try {
            if (args.length != 1) {
                throw new TaskException("Должен быть один аргумент при запуске");
            }
            new GreeterByName().sayHelloIfNameSuits(DataFormatter.checkIfStringHasNameFormat(args[0]));
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        logger.info("Задание 2 - завершение");
    }
}
