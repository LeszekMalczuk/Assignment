package assignment1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import org.junit.validator.PublicClassValidator;
import org.omg.CORBA.PUBLIC_MEMBER;


public class BruteAutocomplete implements AutoComplete 
{
	private Scanner input;
	ArrayList<Term> listOfTerms = new ArrayList<>();
	private double result;
	private String result2;
	TermList termlist = new TermList();	


	public  BruteAutocomplete() 
	{
		try 
		{
			listOfTerms = termlist.addTerms();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}

	@Override
	public double weightOf(String inputterm) 
	{


		if (inputterm != null) 
		{

			for (Term s : listOfTerms) 
			{

				if (s.termTerm.toLowerCase().equals(inputterm.toLowerCase()))
				{
					result =  s.weight;
					System.out.println("wynik " +  s.weight +"\n");

				}

			}
			//napisanie kodu do wyszukiwania po nazwach (string) z listy po pełnej nazwie i wydrukowanie liczby do niej przypisnej
		}
		else
		{
			return 0.0;
		}

		return result;
	}	



	////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\

	@Override
	public String bestMatch(String prefix) 

	{
		int count = 1;
		for (Term s : listOfTerms) 
		{

			if (s.termTerm.toLowerCase().startsWith(prefix) && count ==1)
			{
				result2 =  s.termTerm;
				//System.out.println("wynik " +  result2 +"\n");
				count--;

			}

		}

	return result2;
}
	





//	{
//		if (prefix != null)
//
//
//		{
//			List<String> returnList = new ArrayList<String>();
//			 
//			{
//				for (Term s : listOfTerms) 
//				{
//					//if (s.termTerm.toLowerCase().compareTo(getInput())(prefix.toLowerCase()))
//						if (s.toLowerCase().contains(prefix.toLowerCase()))
//							returnList.add(s);
//				}
//			}
//			Collections.sort(returnList);
//			return returnList;




//			return prefix;												//	 Returns the highest weighted matching term, or null if no matching term.
//			
//			int betsMathch;
//			int highesttMattch = 0;
//		
//			if (prefix != null) 
//			{
//				
//				for (Term s : listOfTerms) 
//				{
//					for (betsMathch() && s.termTerm().length() > 0);
//					for (highesttMattch.s.termTerm() && betsMathch());
////					if (s.termTerm.toLowerCase().compareTo(prefix.getInput()))
//					{
//						result =  s.weight;
//						System.out.println("wynik " +  s.weight +"\n");
//						
//					}
//					
//					int compare = s.termTerm.compareTo(getInput());
//					if (compare < 0)
//					{
//						System.out.println(compare);
//					}

//					int compare = a.compareTo(b);
//					if (compare < 0){
//					    System.out.println(a + " is before " +b);
//					} else if (compare > 0) {
//					    System.out.println(b + " is before " +a);
//					} else {
//					    System.out.println("Strings are equal")
//				}
//				
//			}
//			else
//			{
//		return "Empty";

// napisanie kodu do autouzupełniania po nazwach string ale musi pokazywać najwyższy numer z listy przypisany dla nazwy+

//
//	private String () {
//		// TODO Auto-generated method stub
//		return null;
//	}


@Override
public Iterable<String> matches(String prefix, int k) 
{
	// TODO Auto-generated method stub
	return null;
	// napisanie kodu do porównywania  string - int 
}













}



