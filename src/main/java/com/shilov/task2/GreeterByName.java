package com.shilov.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreeterByName {

    private String keyName = "Вячеслав";
    private static final String SUITABLE_NAME_MESSAGE = "Привет, Вячеслав";
    private static final String NOT_SUITABLE_NUMBER_MESSAGE = "Нет такого имени";

    private final Logger logger = LogManager.getLogger(GreeterByName.class);

    public GreeterByName() {}

    public GreeterByName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String sayHelloIfNameSuits(String name) {
        String message = (name.trim().equals(keyName)) ? SUITABLE_NAME_MESSAGE : NOT_SUITABLE_NUMBER_MESSAGE;
        logger.info("Поступило на вход: {}, Сообщение: {}", name, message);
        return message;
    }
}
