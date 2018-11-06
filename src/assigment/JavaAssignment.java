package assigment;
import java.util.Scanner;

public class JavaAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please give a sentence ;");
		String sentence = sc.nextLine();
		
		String[] senArray = sentence.split(" ");
		String maxWord = senArray[0];
		int maxWordLeng=maxWord.length();
		
		for (int i = 1; i < senArray.length; i++) {
			if(senArray[i].length()>maxWordLeng) {
				maxWord = senArray[i];
				maxWordLeng = maxWord.length();
			}
		}
		
		System.out.println("Longest word in sentence is  " + maxWord);
		System.out.println("Longest word's length is " + maxWordLeng);
		 
		
		

	}

}
