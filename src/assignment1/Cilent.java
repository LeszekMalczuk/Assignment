package assignment1;

import java.util.Scanner;

public class Cilent
{

	public static void main (String[] args)
	{
		BruteAutocomplete bruteAutocomplete = new BruteAutocomplete();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter prefix to find the weight of the word in the array: ");
		String input = scanner.nextLine();
		System.out.println("The weight of " + input +" is " + bruteAutocomplete.weightOf(input)+ "\n");
		
		System.out.println("Enter prefix or leter to best match to words in array: ");
		String input1 = scanner.nextLine();
		System.out.println(bruteAutocomplete.bestMatch(input1));
		System.out.println("The best match of " + input1 +" is " + bruteAutocomplete.bestMatch(input1)+ "\n");
		
		
		System.out.println("Enter prefix or leter to search in the list: ");
		String input3 = scanner.nextLine();
		System.out.println("Enter a number how many words placed in array: ");
		int input4 = scanner.nextInt();
		//System.out.println(bruteAutocomplete.matches(input3, input4));
		System.out.println("The best match of " + " in the array is " + bruteAutocomplete.matches(input3,input4)+ "\n");
		
		
		
	}
}

