package main;
import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please select an option:");
		System.out.println("1) Metric to imperial");
		System.out.println("2) Imperial to metric");
		System.out.println("3) Quit");
		String line = scanner.nextLine();
		switch (line) {
		case "1":
			System.out.println("Please select an option:");
			System.out.println("1) Centimeters to inches");
			System.out.println("2) Meters to feet");
			System.out.println("3) Kilometers to miles");
			line = scanner.nextLine();
			switch(line)
			{
			case "1":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " centimeters is " + convertFromCentimetersToInches(Float.parseFloat(line)) + " inches");
				break;
			case "2":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " meters is " + convertFromMetersToFeet(Float.parseFloat(line)) + " feet");
				break;
			case "3":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " kilometers is " + convertFromKilometersToMiles(Float.parseFloat(line)) + " miles");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		case "2":
			System.out.println("Please select an option:");
			System.out.println("1) Inches to centimeters");
			System.out.println("2) Feet to meters");
			System.out.println("3) Miles to kilometers");
			line = scanner.nextLine();
			switch(line)
			{
			case "1":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " inches is " + convertFromCentimetersToInches(Float.parseFloat(line)) + " centimeters");
				break;
			case "2":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " feet is " + convertFromMetersToFeet(Float.parseFloat(line)) + " meters");
				break;
			case "3":
				System.out.println("Type in the number to convert:");
				line = scanner.nextLine();
				System.out.println(line + " miles is " + convertFromKilometersToMiles(Float.parseFloat(line)) + " kilometers");
				break; 
			default:
				System.out.println("Invalid Input");
				break;
			}
			break;
		case "3":
			System.out.println("Quitting");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		 scanner.close();
	 }
	public static float convertFromCentimetersToInches(float centimeters) {
		return centimeters * 0.3937f;
	}
	public static float convertFromMetersToFeet(float meters) {
		return meters * 3.28f;
	}
	public static float convertFromKilometersToMiles(float kilometers) {
		return kilometers * 0.621371f;
	}
	public static float convertFromInchesToCentimeters(float inches) {
		return inches * 2.54f;
	}
	public static float convertFromFeetToMeters(float feet) {
		return feet * 0.3048f;
	}
	public static float convertFromMilesToKilometers(float miles) {
		return miles * 1.60934f;
	}
}
