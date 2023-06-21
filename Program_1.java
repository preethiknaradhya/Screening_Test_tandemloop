import java.util.Scanner;

class Calci {
	
     double a;
     double b;

    public Calci(double num1, double num2) //function of calci
    {
        a = num1;
        b = num2;
    }
//Logic functions for 4 given requirements
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
        Scanner in = new Scanner(System.in);//Input from the user

        System.out.print("Enter First number: ");//First Input
        double a = in.nextDouble();

        System.out.print("Enter Second number: ");//Second Input
        double b = in.nextDouble();

        System.out.print("Enter the operatotrs (+, -, *, /): ");//Operators input
        String operation = in.next();

        Calci calculator = new Calci(a, b);//calling the function

        double answer;

        switch (operation)//Switch case used for logic
	{
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
