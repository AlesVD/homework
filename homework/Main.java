package homework;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!"q".equals(userInput)) {
            try {
                System.out.println("Enter numbers one");
                int firstNumber = scanner.nextInt();
                System.out.println("Enter numbers two2");
                int secondNumber = scanner.nextInt();
                System.out.println("Enter operations");
                scanner.nextLine();
                userInput = scanner.nextLine();
                double result;
                switch (userInput) {
                    case "+":
                        result = Operations.plus(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = Operations.minus(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = Operations.ymn(firstNumber, secondNumber);
                        break;
                    case "/":
                        if (secondNumber == 0) {
                            System.out.println("Division by zero is not allowed!");
                            continue;
                        }
                        result = Operations.del(firstNumber, secondNumber);
                        break;

                    case "!":
                        result = Operations.fact(firstNumber);
                        break;
                    default:
                        result = 0;
                        break;
                }
                System.out.println(result);
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
                scanner.nextLine();
            }

        }


    }

}