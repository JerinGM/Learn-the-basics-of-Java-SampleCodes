//model real world language families
public class LanguageFamily
{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;
    public LanguageFamily(String n, int ns, String rs, String wo)
    {
        name = n;
        numSpeakers = ns;
        regionsSpoken = rs;
        wordOrder = wo;
    }
    public void getInfo()
    {
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "\n" + "The language follows the word order : " + wordOrder);
    }
    public static void main(String[] args)
    {
        System.out.println();
        LanguageFamily LFObject = new LanguageFamily("Hindi", 1200000000, "India", "subject-verb-subject");
        LFObject.getInfo();
        System.out.println();
        Mayan MObject = new Mayan("Ki'che'", 2500000);
        MObject.getInfo();
        System.out.println();
        SinoTibetan STObject = new SinoTibetan("Mandarin Chinese", 5000000);
        STObject.getInfo();
    }
}