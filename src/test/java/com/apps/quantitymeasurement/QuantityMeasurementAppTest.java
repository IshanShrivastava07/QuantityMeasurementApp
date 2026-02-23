package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.checkFeetEquality(2.0, 2.0));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.checkFeetEquality(2.0, 3.0));
    }

    @Test
    void testInchesEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.checkInchesEquality(5.0, 5.0));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.checkInchesEquality(5.0, 6.0));
    }

    @Test
    void testNullComparison() {
        QuantityMeasurementApp.Feet f = new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null));
    }

    @Test
    void testSameReference() {
        QuantityMeasurementApp.Inches i = new QuantityMeasurementApp.Inches(2.0);
        assertTrue(i.equals(i));
    }

    @Test
    void testNonNumericInput() {
        assertThrows(IllegalArgumentException.class,
                () -> new QuantityMeasurementApp.Feet(Double.NaN));
    }
}