package com.calculator.vat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.calculator.common.CountryCode.DE;
import static com.calculator.common.TaxRateProvider.getTaxRateBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountantTest {
    private final Accountant accountant = new Accountant();

    @DisplayName("Should calculate the net price correct given there is a iso country code present")
    @Test
    void calculateNetPrice() {
        var actual = 81.0;

        var expected = accountant.calculateNetPriceFrom(100.0, getTaxRateBy(DE));

        assertEquals(expected, actual);
    }
}
