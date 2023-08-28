public class BasicCalculator {
    //not using constructor
    //Using methods with int as it will return an integer value
    //making methods public static int xyz() as I can print directly from main method which is also static
    public static int add(int a, int b)
    {
        return a + b;
    }

    public static int subtract(int a, int b)
    {
        return a-b;
    }
    public static int multiply(int a, int b)
    {
        return a*b;
    }
    public static int divide(int a, int b)
    {
        return a/b;
    }
    public static int modulo(int a, int b)
    {
        return a%b;
    }
    public static void main(String[] args)
    {
        System.out.println(add(10, 20));
        System.out.println(subtract(20, 10));
        System.out.println(multiply(7, 7));
        System.out.println(divide(10, 5));
        System.out.println(modulo(10, 3));
    }
}