package assignment1;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import assignment1.TermList;

public class TermListTest {
	TermList termlist;// = new TermList();


	@Before
	public void setup()// throws FileNotFoundException
	{
		termlist = new TermList();
		//termlist.addTerms();
	}

	@Test
	public void test()// throws Exception 
	{
		assertEquals(termlist.getArray().size(), 0);
		try 
		{
			termlist.addTerms();
		} 
		catch (FileNotFoundException e) {
			System.out.println("error");
		}
		assertEquals(termlist.getArray().size(), 10000);
		
		

	}
	  @After
	  public void tearDown()
	  {
	    termlist = null;
	  }
}
