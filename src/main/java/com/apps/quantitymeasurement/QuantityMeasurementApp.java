package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    /* ================= LENGTH UNIT ENUM ================= */
    enum LengthUnit {
        FEET(1.0),
        INCH(1.0 / 12.0),
        YARD(3.0),
        CENTIMETER(0.0328084);

        private final double toFeetFactor;

        LengthUnit(double toFeetFactor) {
            this.toFeetFactor = toFeetFactor;
        }

        public double toFeet(double value) {
            return value * toFeetFactor;
        }

        public double fromFeet(double feetValue) {
            return feetValue / toFeetFactor;
        }
    }

    /* ================= QUANTITY CLASS ================= */
    static class QuantityLength {

        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit) {
            if (!Double.isFinite(value))
                throw new IllegalArgumentException("Invalid value");
            if (unit == null)
                throw new IllegalArgumentException("Unit cannot be null");

            this.value = value;
            this.unit = unit;
        }

        private double toFeet() {
            return unit.toFeet(value);
        }

        /* ===== INSTANCE CONVERSION ===== */
        public QuantityLength convertTo(LengthUnit target) {
            double feet = toFeet();
            double converted = target.fromFeet(feet);
            return new QuantityLength(converted, target);
        }

        /* ===== STATIC CONVERSION API ===== */
        public static double convert(double value, LengthUnit source, LengthUnit target) {
            if (!Double.isFinite(value))
                throw new IllegalArgumentException("Invalid value");
            if (source == null || target == null)
                throw new IllegalArgumentException("Unit cannot be null");

            double feet = source.toFeet(value);
            return target.fromFeet(feet);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof QuantityLength)) return false;

            QuantityLength other = (QuantityLength) obj;

            return Math.abs(this.toFeet() - other.toFeet()) < 1e-6;
        }

        @Override
        public String toString() {
            return value + " " + unit;
        }
    }

    /* ================= DEMO ================= */
    public static void main(String[] args) {

        double inch = QuantityLength.convert(1, LengthUnit.FEET, LengthUnit.INCH);
       // 12
        System.out.println(inch); 
    }
}