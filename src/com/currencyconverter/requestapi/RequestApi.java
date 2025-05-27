package com.currencyconverter.requestapi;

import com.currencyconverter.choice.ChoiceEvaluation;
import com.currencyconverter.requestapi.handlingapi.HandlingApiResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestApi {
    private String fullUrl;
    private double valueChoice;

    public RequestApi(String fullUrl, double valueChoice) {
        this.fullUrl = fullUrl;
        this.valueChoice = valueChoice;
    }

    public RequestApi(int option, double valueChoice) {
        this.valueChoice = valueChoice;

        ChoiceEvaluation choiceEvaluation = new ChoiceEvaluation();
        this.fullUrl = choiceEvaluation.choiceNumber(option, valueChoice);
    }

    public double getValueChoice() { return valueChoice; }

    Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public String callApi() {
        try {

            String url = this.fullUrl;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jason = response.body();

            HandlingApiResponse handlingApiResponse = gson.fromJson(jason, HandlingApiResponse.class);

            String code1 = handlingApiResponse.baseCode();
            String code2 = handlingApiResponse.targetCode();
            double amountResult = handlingApiResponse.conversionResult();

            String result = "O valor de " + getValueChoice() + " " + code1 + " convertido para --> " + code2 + " resulta em um total de: | " + amountResult + " " + code2 + " |";

            return result;

        } catch (IOException | InterruptedException e) {
            return "Erro de conexão ou interrupção: " + e.getMessage();
        } catch (RuntimeException e) {

            return "Erro de execução: " + e.getMessage() + ". URL usada: " + this.fullUrl;
        }
    }
}