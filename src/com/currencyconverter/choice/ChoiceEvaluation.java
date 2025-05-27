package com.currencyconverter.choice;

import com.currencyconverter.exchange.MoneyExchange;
import com.currencyconverter.requestapi.self.SelfUrl;

public class ChoiceEvaluation extends MoneyExchange {
    private String firstPartUrl = "https://v6.exchangerate-api.com/v6/537af6ee7f0d0cc83a1b6c87/pair/";

    public String getFirstPartUrl() {
        return firstPartUrl;
    }

    public String choiceNumber(int choicingCurrency, double valueForConverter) {
        switch (choicingCurrency) {
            case 1:
                return getFirstPartUrl() + "BRL/USD/" + valueForConverter;
            case 2:
                return getFirstPartUrl() + "USD/BRL/" + valueForConverter;
            case 3:
                return getFirstPartUrl() + "BRL/EUR/" + valueForConverter;
            case 4:
                return getFirstPartUrl() + "EUR/BRL/" + valueForConverter;
            case 5:
                return getFirstPartUrl() + "GBP/BRL/" + valueForConverter;
            case 6:
                return getFirstPartUrl() + "BRL/GBP/" + valueForConverter;
            case 7:
                return getFirstPartUrl() + "JPY/USD/" + valueForConverter;
            case 8:
                return getFirstPartUrl() + "USD/JPY/" + valueForConverter;
            case 9:
                return getFirstPartUrl() + "ARS/USD/" + valueForConverter;
            case 10:
                return getFirstPartUrl() + "USD/ARS/" + valueForConverter;
            case 11:
                return getFirstPartUrl() + "COP/USD/" + valueForConverter;
            case 12:
                return getFirstPartUrl() + "USD/COP/" + valueForConverter;
            case 13:
                return getFirstPartUrl() + "BOB/USD/" + valueForConverter;
            case 14:
                return getFirstPartUrl() + "USD/BOB/" + valueForConverter;
            case 15:
                return getFirstPartUrl() + "CLP/USD/" + valueForConverter;
            case 16:
                return getFirstPartUrl() + "USD/CLP/" + valueForConverter;
            default:
                return "URL_PADRAO_OU_ERRO";
        }
    }

    public String choiceNumberForCustom(String currency1, String currency2, double valueForConverter) {
        String customPairPart = SelfUrl.getPairUrlPart(currency1, currency2);
        return getFirstPartUrl() + customPairPart + valueForConverter;
    }
}