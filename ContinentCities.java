public class ContinentCities
{
    public static void main(String[] args)
    {
        int choice = 2;
        switch (choice)
        {
            case 1:
                System.out.println("Africa: Lagos, Nigeria");
                break;
            case 2:
                System.out.println("Asia: Mumbai, India");
                break;
            case 3:
                System.out.println("North America: Mexico City, Mexico");
                break;
            case 4:
                System.out.println("Australia: Sydney, Australia");
            case 5:
                System.out.println("South America: Rio de Janeiro, Brazil");
                break;
            case 6:
                System.out.println("Europe: Geneva, Switzerland");
                break;
            case 7:
                System.out.println("Antartica: Mcmurdo Station, U");
            default:
                System.out.println("Continent and city unknown");
                break;
        }
    }
}