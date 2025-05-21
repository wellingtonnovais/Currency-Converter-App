package com.currencyconverter.choice;

public class ChoiceValue {

    public String howMoneyRequest(int optionCurrency) {
        switch (optionCurrency) {
            case 1:
                return "Quantos reais você quer converter para dolar?";
            case 2:
                return "Quantos dólares você que coverter para real?";
            case 3:
                return "Quantos reais você quer converter para euro?";
            case 4:
                return "Quantos euro você quer converter para real?";
            case 5:
                return "Quantas libras você quer converter para real?";
            case 6:
                return "Quantos reais você quer converter para libra?";
            case 7:
                return "Quantos yens você quer converter para dolar?";
            case 8:
                return "Quantos yens você quer converter para euro?";
            case 9:
                return "Quantos yens você quer converter para libra?";
            default:
                return "";
        }
    }
}


