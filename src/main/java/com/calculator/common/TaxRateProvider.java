package com.calculator.common;

import java.util.HashMap;
import java.util.Map;

import static com.calculator.common.CountryCode.DE;
import static com.calculator.common.CountryCode.FR;

public class TaxRateProvider {
    private static final Map<CountryCode, Double> ISOByCountry = new HashMap<>();

    static {
        ISOByCountry.put(DE, 0.19);
        ISOByCountry.put(FR, 0.20);
    }

    public static Double getTaxRateBy(CountryCode countryCode){
        return ISOByCountry.get(countryCode);
    }
}
