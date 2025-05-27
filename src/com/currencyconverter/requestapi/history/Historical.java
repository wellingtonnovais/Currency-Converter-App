package com.currencyconverter.requestapi.history;

import java.util.ArrayList;
import java.util.List;

public class Historical {

   public List<String> historicalExchange = new ArrayList<>();


   public void showRecord() {
       System.out.println(" ");
       System.out.println("HISTÓRICO DE CONVERÇÃOE");
       System.out.println(" ");
       historicalExchange.forEach(System.out::println);
    }

    public void addRecord(String historicalExchange) {
        this.historicalExchange.add(historicalExchange);
    }
}
