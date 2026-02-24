package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


    class QuantityMeasurementAppTest {

        @Test
        void testFeetToFeet_SameValue() {
            QuantityMeasurementApp.QuantityLength q1 =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            QuantityMeasurementApp.QuantityLength q2 =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            assertTrue(q1.equals(q2));
        }

        @Test
        void testInchToInch_SameValue() {
            QuantityMeasurementApp.QuantityLength q1 =
                    new QuantityMeasurementApp.QuantityLength(5, QuantityMeasurementApp.LengthUnit.INCH);

            QuantityMeasurementApp.QuantityLength q2 =
                    new QuantityMeasurementApp.QuantityLength(5, QuantityMeasurementApp.LengthUnit.INCH);

            assertTrue(q1.equals(q2));
        }

        @Test
        void testFeetToInch_Equivalent() {
            QuantityMeasurementApp.QuantityLength q1 =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            QuantityMeasurementApp.QuantityLength q2 =
                    new QuantityMeasurementApp.QuantityLength(12, QuantityMeasurementApp.LengthUnit.INCH);

            assertTrue(q1.equals(q2));
        }

        @Test
        void testDifferentValues() {
            QuantityMeasurementApp.QuantityLength q1 =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            QuantityMeasurementApp.QuantityLength q2 =
                    new QuantityMeasurementApp.QuantityLength(2, QuantityMeasurementApp.LengthUnit.FEET);

            assertFalse(q1.equals(q2));
        }

        @Test
        void testNullComparison() {
            QuantityMeasurementApp.QuantityLength q =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            assertFalse(q.equals(null));
        }

        @Test
        void testSameReference() {
            QuantityMeasurementApp.QuantityLength q =
                    new QuantityMeasurementApp.QuantityLength(1, QuantityMeasurementApp.LengthUnit.FEET);

            assertTrue(q.equals(q));
        }

        @Test
        void testNullUnit() {
            assertThrows(IllegalArgumentException.class,
                    () -> new QuantityMeasurementApp.QuantityLength(1, null));
        }
    }