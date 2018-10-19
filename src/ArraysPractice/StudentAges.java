package ArraysPractice;

public class StudentAges
{
    int [] ages = new int [] {5, 7, 6, 8, 6, 9, 7};
    public void showAge()
    {
        System.out.println("The fourth age is " + ages[3]);
        for(int age:ages)
        {
            System.out.println(age);
        }
    }
}
