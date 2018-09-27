package ooprogramming;

public class DiffAnimals
{
    public static void main (String [] args)
    {
        Animals rabbit = new Animals();
        rabbit.run();
        rabbit.move();
        double h1 = rabbit.height;
        System.out.println("My height is " +h1);
        double w1 = rabbit.weight;
        System.out.println("My weight is " + w1);
        String col = rabbit.colour;
        System.out.println("My colour is " + col);

    }


}
