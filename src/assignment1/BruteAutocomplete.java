package assignment1;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import org.junit.validator.PublicClassValidator;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.w3c.dom.css.Counter;


public class BruteAutocomplete implements AutoComplete 
{

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
					//System.out.println("wynik " +  s.weight +"\n");

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
				result2 =  s.termTerm;  //	System.out.println("wynik " +  result2 +"\n");
				count--;
			}
		}
		return result2;
	}

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
				//colectionK.add(s.toString());
			}

		}

		return colectionK;

		// TODO Auto-generated method stub
		//return null;
		// napisanie kodu do porównywania  string - int 
	}


}



