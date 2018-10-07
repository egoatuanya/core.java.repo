package method.practice;

public class RunMethodsPrac
{
    public static void main (String [] args)
    {
        MethodsPrac method = new MethodsPrac();
        method.sumOfNum();
        method.sumOfNum2(12, 13, 14);
        String ans = method.sumOfNum3(15, 16, 17);
        System.out.println(ans);

    }
}
