
package com.apps.quantitymeasurement;

//main class
public class QuantityMeasurementApp {
	public static boolean demonstrateLengthEquality(Length l1, Length l2) {
		return l1.equals(l2);
	}

	public static double demonstrateLengthConversion(double value, LengthUnit fromUnit, LengthUnit toUnit) {
		return Length.convert(value, fromUnit, toUnit);
	}

	public static Length demonstrateLengthConversion(Length length, LengthUnit toUnit) {
		return length.convertTo(toUnit);
	}

	public static void main(String[] args) {


		Length l1 = new Length(1.0, LengthUnit.FEET);
		Length l2 = new Length(12.0, LengthUnit.INCHES);

		System.out.println(Length.add(l1, l2, LengthUnit.FEET));
		System.out.println(Length.add(l1, l2, LengthUnit.INCHES));
		System.out.println(Length.add(l1, l2, LengthUnit.YARDS));
		System.out.println(Length.add(l1, l2, LengthUnit.CENTIMETERS));
	}
}
