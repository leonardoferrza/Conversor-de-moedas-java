package com.example.conversordemoedas;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public record ApiResponse(
        @SerializedName("conversion_rates") Map<String, Double> conversionRates
) {}