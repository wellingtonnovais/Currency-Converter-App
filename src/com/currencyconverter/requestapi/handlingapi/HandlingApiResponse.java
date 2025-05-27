package com.currencyconverter.requestapi.handlingapi;

import com.google.gson.annotations.SerializedName;

public record HandlingApiResponse(
        @SerializedName("conversion_rate") double conversionRate,
        @SerializedName("base_code") String baseCode,
        @SerializedName("target_code") String targetCode,
        @SerializedName("conversion_result") double conversionResult
) {
}