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
	
	@Test
	public void bestMatch()
	{
		BruteAutocomplete bM = new BruteAutocomplete();
		String prefix = "th";
		assertEquals(bM.bestMatch(prefix), "the");
		//asse
		
	}
	
	@Test
	public void bestMatch2()
	{
		BruteAutocomplete bM = new BruteAutocomplete();
		String prefix = "...989778";
		assertEquals(bM.bestMatch(prefix), null);
		
	}
	@Test
	public void  matches()
	{
		BruteAutocomplete M = new BruteAutocomplete();
		String prefix = " ";
		int k = 5;
		assertArrayEquals(M.matches(prefix, k), null, 5);
		
		
	}

	private void assertArrayEquals(Iterable<String> matches, String string, int i) {
		// TODO Auto-generated method stub
		
	}

}
