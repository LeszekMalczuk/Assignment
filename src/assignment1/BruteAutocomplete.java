package assignment1;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class BruteAutocomplete implements AutoComplete 
{

	ArrayList<Term> listOfTerms = new ArrayList<>();
	private double result;
	private String result2;
	TermList termlist = new TermList();
	public Object quickAutocompete;	


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
	/////////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\
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

				}
			}
		}
		else
		{
			return 0.0;
		}

		return result;
	}	
	//napisanie kodu do wyszukiwania po nazwach (string) z listy po pełnej nazwie i wydrukowanie liczby do niej przypisnej

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
				count--;
			}
		}
		return result2;
	}
	////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\
	@Override
	public Iterable<String> matches(String prefix, int k) 
	{
		ArrayList<String> colectionK = new ArrayList<>();

		int counter = 0;

		for (Term s : listOfTerms) 
		{
			if (s.termTerm.toLowerCase().startsWith(prefix) && counter++ < k)
			{
				colectionK.add(s.termTerm);
				
			}
		}

		return colectionK;

		// napisanie kodu do porównywania  string - int 
	}
	/////////////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	}

	    
	    




