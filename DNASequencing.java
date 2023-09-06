public class DNASequencing
{
    // Program to determine if there is Protein in a DNA strand
    /* A protein has the following qualities
    1. It begins with start codon ATG
    2. It ends with stop codon TGA
    3. In between, each additional codon is a sequence of three nucleotides
    Will be creating three dna
    dna1 = ATGCGATACGCTTGA
    dna2 = ATGCGATACGTGA
    dna3 = ATTAATATGTACTGA
     */
    public static void main(String[] args)
    {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        // I will be testing only dna1 for this exercise
        int lengthOfString = dna1.length();
        int startIndex = dna1.indexOf("ATG");
        int endIndex = dna1.indexOf("TGA");
        System.out.println(lengthOfString);
        System.out.println(startIndex);
        System.out.println(endIndex);
        // if the strand is not present, the output would be -1 for start and end indexes, hence I will be testing that condition
        // for it to be protein strand the mid indexs should be divisible by 3
        if((startIndex != -1) && (endIndex != -1) && (endIndex-startIndex) % 3 == 0)
        {
            String protein = dna1.substring(startIndex, endIndex+3);
            System.out.println("Protein : " + protein);
        }
        else
        {
            System.out.println("No Protein found");
        }
    }
}