package com.shilov.task3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.*;
import java.util.stream.Collectors;

public class NumberProcessor {

    private int baseNumber = 3;

    private final Logger logger = LogManager.getLogger(NumberProcessor.class);

    public NumberProcessor(){}

    public NumberProcessor(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public int getBaseNumber() {
        return baseNumber;
    }

    public void setBaseNumber(int baseNumber) {
        this.baseNumber = baseNumber;
    }

    public List<Integer> findMultiplesOfNumber(List<Integer> numbers) {
        List<Integer> results =  numbers.stream().filter(n -> n % baseNumber == 0 && n != 0).collect(Collectors.toList());
        logger.info("Поступило на вход: {}, Число для кратности: {}, Отфильтрованный список: {}",
                numbers, baseNumber, results);
        return results;
    }
}
