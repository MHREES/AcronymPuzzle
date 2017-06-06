import java.util.Scanner;

public class InputPhrase {
	
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the phrase you want to make into an acronym: ");
        String phrase = input.nextLine(); 
        
        Acronym AcronymObj = new Acronym(phrase);     
                      
    }
}
