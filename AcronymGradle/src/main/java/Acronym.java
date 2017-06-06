

// Terminology ('Acronym'/'phrase') aligns with AcronymTest.java file 

public class Acronym {

    	public String answer;

	Acronym(String phrase){
		answer = MakeAcronym(phrase);
	}

	String get(){
		return answer;
	}

	
	public String MakeAcronym(String phrase){
        	// String PreProcessing: Add a space before uppercase letters (excludes acronymns). Changes the Char case pattern 'aBc' to 'a Bc'
        	String spacestoPhrase = phrase.replaceAll("[^A-Z]([A-Z][^AZ])", " $1");
        	// Take the upper case letter of all words preceded by a blank
        	String acronymofPhrase = spacestoPhrase.replaceAll("\\B.|\\P{L}", "").toUpperCase();
        	return acronymofPhrase;
    	}
}
