package autoprojects;
import java.util.Scanner;

public class ArrayPractice

{
    public static void main(String[] args)
    {
        String [] studentNames = {"Ugochi", "Ebeano","Celina","Obong","Etuk","Paul"};
        System.out.println("Please enter your first name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        if (name.equalsIgnoreCase(studentNames[0]))
        {
            System.out.println(name + ",You are in first position");
        }
        else if(name.equalsIgnoreCase(studentNames[1]))
        {
            System.out.println(name + ",You are in second position");

        }
        else if (name.equalsIgnoreCase(studentNames[2]))
        {
            System.out.println(name + ",You are in third position");
        }
        else if (name.equalsIgnoreCase(studentNames[3]))
        {
            System.out.println(name + ",You are in fourth position");
        }
        else
        {
            System.out.println("Your name is not on the list");
        }



    }

}
