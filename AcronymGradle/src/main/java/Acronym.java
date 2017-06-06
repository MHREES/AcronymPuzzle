

// Terminology ('Acronym'/'phrase') aligns with AcronymTest.java file 

public class Acronym {
	
	// Create string variable to which the answer can be assigned... Made private so it's exclusive to this class
    	private String answer;

	// Call the method MakeAcronym to create the acronym from an input 'phrase'
	Acronym(String phrase){
		answer = MakeAcronym(phrase);
	}
	
	// Create a method that returns answer as a string 'get()'. Made public so that it can be called from the test script without compromising 'answer'
	public String get(){
		return answer;
	}

	// The method that executes the algorithm. 
	public String MakeAcronym(String phrase){
        	// String PreProcessing: Add a space before uppercase letters (excludes acronymns). Changes the Char case pattern 'aBc' to 'a Bc'
        	String spacestoPhrase = phrase.replaceAll("[^A-Z]([A-Z][^AZ])", " $1");
        	// Take the upper case letter of all words preceded by a blank
        	String acronymofPhrase = spacestoPhrase.replaceAll("\\B.|\\P{L}", "").toUpperCase();
        	return acronymofPhrase;
    	}
}
