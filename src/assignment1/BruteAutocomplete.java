package assignment1;

import java.io.FileNotFoundException;
import java.util.ArrayList;


public class BruteAutocomplete implements AutoComplete 
{
	ArrayList<Term> listOfTerms = new ArrayList<>();
	private double result;
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
				}
				
			}
			//rferf
			//napisanie kodu do wyszukiwania po nazwach (string) z listy po pełnej nazwie i wydrukowanie liczby do niej przypisnej
		}
		else
		{
			return 0.0;
		}
		
		return result;
	}		

		@Override
		public String bestMatch(String prefix) 
		{
			// TODO Auto-generated method stub
			return null;
			// napisanie kodu do autouzupełniania po nazwach string ale musi pokazywać najwyższy numer z listy przypisany dla nazwy+
		}

		@Override
		public Iterable<String> matches(String prefix, int k) 
		{
			// TODO Auto-generated method stub
			return null;
			// napisanie kodu do porównywania  string - int 
		}

	}

