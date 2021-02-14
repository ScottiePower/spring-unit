package com.khera;

import java.util.stream.IntStream;

public class MyCalculator implements Calculator {

    DataService dataService;

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public int sum() {
        return IntStream.of(dataService.returnIntArray()).sum();
    }

}
