package autoprojects;
import java.util.Scanner;

public class SimpleCalculator
{
    public static void main (String args [])

    {
        double firstnum, secondnum, answer;
        String operator = new String();
        Scanner multiply = new Scanner(System.in);
        System.out.println("Input your first number");
        firstnum = multiply.nextDouble();
       System.out.println("Input your second number");
       secondnum = multiply.nextDouble();
       System.out.println("Enter an operator");
       Scanner ops = new Scanner(System.in);
       operator = ops.next();

       if(operator.equals("/"))
       {

            answer = firstnum/secondnum;
            System.out.println(answer);
        }
        else if (operator.equals("*"))
       {
           answer = firstnum*secondnum;
           System.out.println(answer);
       }
       else if (operator.equals("+"))
       {
           answer = firstnum+secondnum;
           System.out.println(answer);
       }
       else if (operator.equals("-"))
       {
           answer = firstnum-secondnum;
           System.out.println(answer);
       }
       else if (operator.equals("%"))
       {
           answer = firstnum % secondnum;
           System.out.println(answer);
       }
       else
       {
           System.out.println("The calculation cannot be performed");
       }







    }


}
