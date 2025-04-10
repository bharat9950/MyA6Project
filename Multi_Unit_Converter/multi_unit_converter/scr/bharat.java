import java.util.Scanner;

public class bharat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nWelcome to Unit Converter!");
            System.out.println("Choose conversion type:");
            System.out.println("1. Length");
            System.out.println("2. Weight");
            System.out.println("3. Temperature");
            System.out.println("4. Time");
            System.out.println("5. Area");
            System.out.println("6. Volume");
            System.out.println("7. Speed");
            System.out.println("8. Data");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: convertLength(scanner); break;
                case 2: convertWeight(scanner); break;
                case 3: convertTemperature(scanner); break;
                case 4: convertTime(scanner); break;
                case 5: convertArea(scanner); break;
                case 6: convertVolume(scanner); break;
                case 7: convertSpeed(scanner); break;
                case 8: convertData(scanner); break;
                case 9: System.out.println("Exiting Unit Converter. Goodbye!"); return;
                default: System.out.println("Invalid choice! Please try again.");
            }
        }
    }


    private static void convertLength(Scanner scanner) {
        System.out.println("\nLength Conversion:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + " meters = " + (value * 3.28084) + " feet");
        else if (option == 2)
            System.out.println(value + " feet = " + (value / 3.28084) + " meters");
        else
            System.out.println("Invalid option!");
    }


    private static void convertWeight(Scanner scanner) {
        System.out.println("\nWeight Conversion:");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + " kg = " + (value * 2.20462) + " lbs");
        else if (option == 2)
            System.out.println(value + " lbs = " + (value / 2.20462) + " kg");
        else
            System.out.println("Invalid option!");
    }


    private static void convertTemperature(Scanner scanner) {
        System.out.println("\nTemperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + "°C = " + ((value * 9/5) + 32) + "°F");
        else if (option == 2)
            System.out.println(value + "°F = " + ((value - 32) * 5/9) + "°C");
        else
            System.out.println("Invalid option!");
    }

    
    private static void convertTime(Scanner scanner) {
        System.out.println("\nTime Conversion:");
        System.out.println("1. Hours to Minutes");
        System.out.println("2. Minutes to Hours");
        System.out.println("3. Seconds to Minutes");
        System.out.println("4. Minutes to Seconds");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        switch (option) {
            case 1: System.out.println(value + " hours = " + (value * 60) + " minutes"); break;
            case 2: System.out.println(value + " minutes = " + (value / 60) + " hours"); break;
            case 3: System.out.println(value + " seconds = " + (value / 60) + " minutes"); break;
            case 4: System.out.println(value + " minutes = " + (value * 60) + " seconds"); break;
            default: System.out.println("Invalid option!");
        }
    }


    private static void convertArea(Scanner scanner) {
        System.out.println("\nArea Conversion:");
        System.out.println("1. Square Meters to Square Feet");
        System.out.println("2. Square Feet to Square Meters");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + " m² = " + (value * 10.7639) + " ft²");
        else if (option == 2)
            System.out.println(value + " ft² = " + (value / 10.7639) + " m²");
        else
            System.out.println("Invalid option!");
    }

    private static void convertVolume(Scanner scanner) {
        System.out.println("\nVolume Conversion:");
        System.out.println("1. Liters to Gallons");
        System.out.println("2. Gallons to Liters");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + " liters = " + (value * 0.264172) + " gallons");
        else if (option == 2)
            System.out.println(value + " gallons = " + (value / 0.264172) + " liters");
        else
            System.out.println("Invalid option!");
    }

    private static void convertSpeed(Scanner scanner) {
        System.out.println("\nSpeed Conversion:");
        System.out.println("1. Kilometers per Hour to Miles per Hour");
        System.out.println("2. Miles per Hour to Kilometers per Hour");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        if (option == 1)
            System.out.println(value + " km/h = " + (value * 0.621371) + " mph");
        else if (option == 2)
            System.out.println(value + " mph = " + (value / 0.621371) + " km/h");
        else
            System.out.println("Invalid option!");
    }

    private static void convertData(Scanner scanner) {
        System.out.println("\nData Conversion:");
        System.out.println("1. Bytes to Kilobytes");
        System.out.println("2. Kilobytes to Megabytes");
        System.out.println("3. Megabytes to Gigabytes");
        System.out.print("Choose option: ");
        int option = scanner.nextInt();
        System.out.print("Enter value to convert: ");
        double value = scanner.nextDouble();

        switch (option) {
            case 1: System.out.println(value + " bytes = " + (value / 1024) + " KB"); break;
            case 2: System.out.println(value + " KB = " + (value / 1024) + " MB"); break;
            case 3: System.out.println(value + " MB = " + (value / 1024) + " GB"); break;
            default: System.out.println("Invalid option!");
        }
    }
}