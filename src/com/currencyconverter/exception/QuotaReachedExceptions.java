package com.currencyconverter.exception;

public class QuotaReachedExceptions extends RuntimeException {
    private String mensagem;

    public QuotaReachedExceptions(String mensagem) {
        this.mensagem = mensagem; }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
