package com.calculator.vat;

public class Accountant {
    public Double calculateNetPriceFrom(Double grossPrice, Double vatRate) {
        return grossPrice - grossPrice * vatRate;
    }
}
