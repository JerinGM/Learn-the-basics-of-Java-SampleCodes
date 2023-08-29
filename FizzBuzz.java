/* Printing number from 1 to 100
multiples of 3 should, print Fizz
multiples of 5 should, print Buzz
multiples of 3 and 5 should print FizzBuzz
 */
public class FizzBuzz
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 100; i++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0)
            {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0)
            {
                System.out.println("Buzz");
                continue;
            }
            else
                System.out.println(i);
        }
    }
}