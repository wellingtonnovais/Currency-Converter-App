package com.currencyconverter.choice;

public class ChoiceEvaluation {
    private String url = "https://v6.exchangerate-api.com/v6/537af6ee7f0d0cc83a1b6c87/pair/";

    public String getUrl() {
        return url;
    }

    public String choiceNumber(int choicingCurrency, double valueForConverter) {
        switch (choicingCurrency) {
            case 1:
                return getUrl() + "BRL/USD/" + valueForConverter;
            case 2:
                return getUrl() + "USD/BRL/" + valueForConverter;
            case 3:
                return getUrl() + "BRL/EUR/" + valueForConverter;
            case 4:
                return getUrl() + "EUR/BRL/" + valueForConverter;
            case 5:
                return getUrl() + "GBP/BRL/" + valueForConverter;
            case 6:
                return getUrl() + "BRL/GBP/" + valueForConverter;
            case 7:
                return getUrl() + "JPY/USD/" + valueForConverter;
            case 8:
                return getUrl() + "JPY/EUR/" + valueForConverter;
            case 9:
                return getUrl() + "JPY/GBP/" + valueForConverter;
            default:
                return "";
        }
    }
}