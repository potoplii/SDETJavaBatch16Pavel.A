package HWClass6;

import java.util.Scanner;

public class HW6B1 {
    public static void main(String[] args) {
        /*
        Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
        Based on operator provide the result to user.
        Please complete this assignment in 2 ways: using if statement and switch case.
        */
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter your 1st number");
        int number1 = num1.nextInt();

        Scanner operator = new Scanner(System.in);
        System.out.println("Use operator(+,-,*,/)");
        String operator1 = operator.next();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter your 2nd number");
        int number2 = num2.nextInt();

        switch (operator1) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
        }
    }
}





