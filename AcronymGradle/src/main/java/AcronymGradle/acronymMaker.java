package AcronymGradle;

public class acronymMaker {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // String input for making into an acronymn (TODO: Update so create a fucntion that takes 'targetPhrase' as a string input)
        String targetPhrase = "Fef, Fi, FOFUM";
        // String PreProcessing: Add a space before uppercase letters (excludes acronymns). Changes the Char case pattern 'aBc' to 'a Bc'
        String spacestoPhrase = targetPhrase.replaceAll("[^A-Z]([A-Z][^AZ])", " $1");
        // Take the upper case letter of all words preceded by a blank
        String acronymnofPhrase = spacestoPhrase.replaceAll("\\B.|\\P{L}", "").toUpperCase();
        System.out.println(acronymnofPhrase);
    }
}
