package assignment1;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment1.TermList;

public class TermListTest {
	TermList termlist;// = new TermList();
			// it is a key frst part

	@Before
	public void setup()// throws FileNotFoundException
	{
		termlist = new TermList();	// it is a second 
		//termlist.addTerms();
		try 
		{
			termlist.addTerms();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
	}
	
	@After
	public void teardown() 
	{
		termlist = null;
	}


	@Test
	public void testTermListSize()// throws Exception 
	{
		assertNotEquals(termlist.getArray().size(), 0);
		assertEquals(termlist.getArray().size(), 10000);
		
		

	}
	//////
	@Test
	public void testTerm()// throws Exception 
	{
		ArrayList<Term> box = new ArrayList<>();
		box = termlist.getArray();
		assertEquals(box.get(0).weight, 5627187200.0, 0.01);
		assertEquals(box.get(0).term, "the");
		
	}
}
