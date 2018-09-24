package autoprojects;
import java.util.Scanner;

public class SimpleCalculator2

{
    public static void main(String[] args) {
        System.out.println("This is a simple calculator, it can only add, divide, multiply and subtract");
        Scanner calc = new Scanner(System.in);
        System.out.println("Input your first number");
        String firstnum = calc.nextLine();
        double firstnum1 = Double.parseDouble(firstnum);
        System.out.println("Input your second number");
        String secondnum = calc.nextLine();
        double secondnum2 = Double.parseDouble(secondnum);
        System.out.println("Enter an operator");
        String ops = calc.nextLine();
        if (ops.equalsIgnoreCase("*")) {
            double result1 = firstnum1 * secondnum2;
            System.out.println("The product of your two numbers is " + result1);
        } else if (ops.equalsIgnoreCase("/")) {
            double result2 = firstnum1 / secondnum2;
            System.out.println("The quotient of your two numbers is " + result2);

        } else if (ops.equalsIgnoreCase("+")) {
            double result3 = firstnum1 + secondnum2;
            System.out.println("The sum of your two numbers is " + result3);
        } else if (ops.equalsIgnoreCase("-")) {
            double result4 = firstnum1 - secondnum2;
            System.out.println("The difference of your two numbers is " + result4);
        } else if (ops.equalsIgnoreCase("%")) {
            double result5 = firstnum1 % secondnum2;
            System.out.println("The remainder when dividing the first number by the second number is " + result5);
        } else
            {
            System.out.println("The calculator cannot perform this operation!");


        }
    }




    }

