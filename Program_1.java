import java.util.Scanner;

class Calci {
	
     double a;
     double b;

    public Calci(double num1, double num2) {
        a = num1;
        b = num2;
    }

    public double addition() {
        return a + b;
    }

    public double subtraction() {
        return a - b;
    }

    public double multiplication() {
        return a * b;
    }

    public double division() {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
    }
}

public class Program_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First number: ");
        double a = in.nextDouble();

        System.out.print("Enter Second number: ");
        double b = in.nextDouble();

        System.out.print("Enter the operatotrs (+, -, *, /): ");
        String operation = in.next();

        Calci calculator = new Calci(a, b);

        double answer;

        switch (operation) {
            case "+":
            	answer = calculator.addition();
                break;
            case "-":
            	answer = calculator.subtraction();
                break;
            case "*":
            	answer = calculator.multiplication();
                break;
            case "/":
            	answer = calculator.division();
                break;
            default:
                System.out.println("Wrong operation.Please Choose only (+,-,/,*)");
                return;
        }

        System.out.println("Final Result: " + answer);
    }
}
