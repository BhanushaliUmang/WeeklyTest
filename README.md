# Car Service Billing System
* This Java program is a car service billing system that calculates the total bill for different types of cars based on the services provided. The program uses HashMaps to store the service codes and corresponding prices for each type of car.

## Usage
* To use the program, follow these steps:

1. Compile the Java file using a Java compiler.
2. Run the compiled class file.
3. Enter the type of car (Hatchback, SUV, or Sedan) when prompted.
4. Enter the service codes for the car when prompted (code1 and code2).
5. The program will then calculate the total bill for the specified car and display it on the console.

## Classes
## Hatchback
* The Hatchback class represents a hatchback car and contains a HashMap serviceCar1 to store service codes and prices specific to hatchback cars. The class also has a generatebill method that calculates and prints the total bill based on the provided service codes.

## SUV
* The SUV class represents an SUV car and contains a HashMap serviceCar2 to store service codes and prices specific to SUV cars. The class also has a generatebill method that calculates and prints the total bill based on the provided service codes.

## Sedan
* The Sedan class represents a sedan car and contains a HashMap serviceCar3 to store service codes and prices specific to sedan cars. The class also has a generatebill method that calculates and prints the total bill based on the provided service codes.

## App
* The App class is the main entry point of the program. It prompts the user to enter the type of car and service codes, creates an instance of the corresponding car class, and calls the generatebill method to calculate and display the total bill.
