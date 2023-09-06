public class Mayan extends LanguageFamily
{
    Mayan(String languageName, int speakers)
    {
        super(languageName, speakers, "Central-America", "verb-object-verb");
    }

    @Override
    public void getInfo()
    {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "\n" + "The language follows the word order : " + wordOrder);
        System.out.println("Fun Fact: " + name + " is an ergative language.");
    }
}
