package com.conversion.tool;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Temperature Conversion Tool");
                System.out.println("1. Fahrenheit to Celsius");
                System.out.println("2. Celsius to Fahrenheit");
                System.out.println("3. Exit");
                System.out.print("Enter your choice (1/2/3): ");
                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        System.out.println("Temperature in Celsius: " + celsius);
                        break;
                    case 2:
                        System.out.print("Enter temperature in Celsius: ");
                        double celsiusInput = scanner.nextDouble();
                        double fahrenheitOutput = (celsiusInput * 9 / 5) + 32;
                        System.out.println("Temperature in Fahrenheit: " + fahrenheitOutput);
                        break;
                    case 3:
                        System.out.println("Exiting the program. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select 1, 2, or 3.");
                        break;
                }
            } while (choice != 3);
        }
    }
}