package com.shilov.task1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreeterByNumber {

    private double keyNumber = 7;
    private static final String SUITABLE_NUMBER_MESSAGE = "Привет";
    private static final String NOT_SUITABLE_NUMBER_MESSAGE = "Неподходящее число для привествия";

    private final Logger logger = LogManager.getLogger(GreeterByNumber.class);

    public GreeterByNumber() {}

    public GreeterByNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }

    public double getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(double keyNumber) {
        this.keyNumber = keyNumber;
    }

    public String sayHelloIfNumberSuits(double input) {
        String message = (Double.compare(input, keyNumber) > 0) ?
                SUITABLE_NUMBER_MESSAGE : NOT_SUITABLE_NUMBER_MESSAGE;
        logger.info("Поступило на вход: {}, Сообщение: {}", input, message);
        return message;
    }

}
