package method.practice;

public class MethodsPrac
{
    public void sumOfNum()
    {
        int a = 12, b = 13, c = 22;
        int result = a+b+c;
        System.out.println(result);

    }
    public void sumOfNum2(int a, int b, int c)
    {
        int result2 = a+b+c;
        System.out.println(result2);
    }
    public String sumOfNum3(int a, int b, int c)
    {
        int result3 = a+b+c;
        String sumOf3 = "The sum of your 3 numbers is " +result3;
        return sumOf3;

    }
}
