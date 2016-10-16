package assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BruteTest 
{
	
	@Test
	public void testWeight() 
	{
		BruteAutocomplete b = new BruteAutocomplete();
		String inputterm = "the";
		assertEquals(b.weightOf(inputterm), 5627187200.0, 0.01);
		assertEquals(b.listOfTerms.size(), 10000);
	}

}
