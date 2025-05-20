package com.currencyconverter.menu;

public class ChoiceEvaluation {
    private String url = "https://v6.exchangerate-api.com/v6/537af6ee7f0d0cc83a1b6c87/par/";

    public String choiceNumber(int number, int valui){
       switch (number) {
           case 1:
               return url + "BRL/USD" + valui;
           case 2:
               return url + "USD/BRL";
           case 3:
               return url + "";
           case 4:
               return url + "";
           case 5:
               return url + "";
           case 6:
               return url + "";
           case 7:
               return url + "";
           case 8:
               return url + "";
           case 9:
               return url + "";
           case 0:
               return "Saindo...";
           default:
               return "Opção inválida";
       }
    }
}
