package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuantityMeasurementAppTest {

    @Test
    void testFeetToInch() {
        double result = QuantityMeasurementApp.QuantityLength
                .convert(1, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCH);

        assertEquals(12.0, result, 1e-6);
    }

    @Test
    void testYardToFeet() {
        double result = QuantityMeasurementApp.QuantityLength
                .convert(1, QuantityMeasurementApp.LengthUnit.YARD,
                        QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(3.0, result, 1e-6);
    }

    @Test
    void testCmToInch() {
        double result = QuantityMeasurementApp.QuantityLength
                .convert(2.54, QuantityMeasurementApp.LengthUnit.CENTIMETER,
                        QuantityMeasurementApp.LengthUnit.INCH);

        assertEquals(1.0, result, 1e-3);
    }

    @Test
    void testRoundTrip() {
        double feet = QuantityMeasurementApp.QuantityLength
                .convert(10, QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCH);

        double back = QuantityMeasurementApp.QuantityLength
                .convert(feet, QuantityMeasurementApp.LengthUnit.INCH,
                        QuantityMeasurementApp.LengthUnit.FEET);

        assertEquals(10.0, back, 1e-6);
    }
}