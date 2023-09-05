public class MathMagic
{
    public static void main(String[] args)
    {
        int newnumber = 10;
        int magicnumber = ((((((newnumber * newnumber) + newnumber) / newnumber) + 20) - newnumber)/5);
        System.out.println(magicnumber);
    }
}