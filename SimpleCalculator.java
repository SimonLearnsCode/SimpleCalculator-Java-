//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator Ok");

        System.out.println("This program it is designed to help you understand the usage of a calculator.");

        System.out.println("Enter two numbers:");

        //Input first number
        System.out.println("Number 1: ");
        double num1 = scanner.nextDouble();

        //Input second number
        System.out.println("Number 2: ");
        double num2 = scanner.nextDouble();

        //Perform calculation
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient =num1/num2;

        //Display results
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Difference: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Product: " + num1 + " * " + num2 + " = " + product);

        if (num2 != 0){
            System.out.println("Quotient: " + num1 + "/" + num2 + " = " + quotient);

        }else {
            System.out.println("Cannot divide by zero.");
        }

        scanner.close();
    }
;}
