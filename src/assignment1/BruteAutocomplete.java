package assignment1;

import java.io.File;
import java.util.Scanner;

public class BruteAutocomplete implements AutoComplete 
{

	@Override
	public double weightOf(String term) 
	{

		return 0;
		//rferf
		//napisanie kodu do wyszukiwania po nazwach (string) z listy po pełnej nazwie
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

