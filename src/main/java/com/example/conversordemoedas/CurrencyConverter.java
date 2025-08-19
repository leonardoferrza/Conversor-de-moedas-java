package com.example.conversordemoedas;

import com.google.gson.Gson;
import java.util.Map;

public class CurrencyConverter {

    public double convert(String baseCurrency, String targetCurrency, double amount) {
        // A CORREÇÃO DEFINITIVA ESTÁ AQUI: Sempre buscamos as taxas baseadas em "USD".
        ApiConnector connector = new ApiConnector();
        String jsonResponse = connector.fetchExchangeRates("USD");

        Gson gson = new Gson();
        ApiResponse response = gson.fromJson(jsonResponse, ApiResponse.class);
        Map<String, Double> rates = response.conversionRates();

        if (rates == null) {
            throw new RuntimeException("Não foi possível obter as taxas de conversão.");
        }

        Double baseRate = rates.get(baseCurrency.toUpperCase());
        if (baseRate == null) {
            throw new IllegalArgumentException("Moeda de origem '" + baseCurrency + "' não encontrada.");
        }

        Double targetRate = rates.get(targetCurrency.toUpperCase());
        if (targetRate == null) {
            throw new IllegalArgumentException("Moeda de destino '" + targetCurrency + "' não encontrada.");
        }

        // Fazemos a conversão usando o dólar como intermediário.
        return (amount / baseRate) * targetRate;
    }
}