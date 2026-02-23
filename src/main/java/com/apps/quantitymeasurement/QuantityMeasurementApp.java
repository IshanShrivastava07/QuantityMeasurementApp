package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {
	
	/* ================= INNER FEET CLASS ================= */
    static class Feet {
        private final double value;

        public Feet(double value) {
            if (Double.isNaN(value))
                throw new IllegalArgumentException("Invalid numeric value");
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Feet)) return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }
    
	 /* ================= INNER INCHES CLASS ================= */
    static class Inches {
        private final double value;

        public Inches(double value) {
            if (Double.isNaN(value))
                throw new IllegalArgumentException("Invalid numeric value");
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Inches)) return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    /* ================= STATIC CHECK METHODS ================= */

    public static boolean checkFeetEquality(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    public static boolean checkInchesEquality(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }
    
	
	public static void main(String[] args) {
		
		System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + checkInchesEquality(1.0, 1.0) + ")");
        
        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + checkFeetEquality(1.0, 1.0) + ")");

		
	}
}