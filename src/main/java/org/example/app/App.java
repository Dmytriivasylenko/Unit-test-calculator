package org.example.app;

import java.util.Scanner;
import org.example.app.service.AdditionalService;
import org.example.app.service.DivisionService;
import org.example.app.service.Multiplication;
import org.example.app.service.Subtraction;
import org.example.app.utils.Constants;
import org.example.app.utils.Validator;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            // input first number
            System.out.println(Constants.INPUT_NUM_MSG1);
            int num1 = Validator.validateIntegerInput(input);

            // input second number
            System.out.println(Constants.INPUT_NUM_MSG2);
            int num2 = Validator.validateIntegerInput(input);

            // Очищаємо буфер після nextInt(), щоб коректно працював nextLine()
            input.nextLine();

            // input operation
            System.out.println(Constants.PLEASE_ENTER_OPERATION);
            String operation = input.nextLine();
            //result
            double result;

            // Operation
            switch (operation) {
                case "+":
                    result = AdditionalService.add(num1, num2);
                    break;
                case "-":
                    result = Subtraction.subtract(num1, num2);
                    break;
                case "*":
                    result = Multiplication.multiply(num1, num2);
                    break;
                case "/":
                    // Перевірка ділення на нуль
                    if (Validator.validateDivision(num2)) {
                        result = DivisionService.divide(num1, num2);
                    } else {
                        //Якщо  все добре, то продовжуємо далі
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid Operation. Please try again.");
                    continue; // Якщо операція некоректна, пропускаємо цю ітерацію
            }

            //  RESULT
            System.out.println("Your Answer is " + result);

            //
            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String answer = input.nextLine().toLowerCase();

            //
            if (!answer.equals("yes")) {
                System.out.println(Constants.APP_CLOSED_MSG);
                break;
            }
        }
    }
}
