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
                return "Quantos dolares você quer converter para yen?";
            case 9:
                return "Quantos pesos argentino você quer converter para dolar?";
            case 10:
                return "Quantos dolares você quer converter para peso argentinno?";
            case 11:
                return "Quantos pesos colombiano você quer converter para dolar?";
            case 12:
                return "Quantos dolares você quer converter para peso colombiano?";
            case 13:
                return "Quantos bolivianos você quer converter para dolar?";
            case 14:
                return "Quantos dolares você quer converter para boliviano?";
            case 15:
                return "Quantos pesos chileno você quer converter para dolar?";
            case 16:
                return "Quantos dolares você quer converter para peso chileno?";
            default:
                return "";
        }
    }
}


