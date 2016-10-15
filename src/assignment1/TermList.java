package assignment1;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.dsig.Transform;

public class TermList 
{
	ArrayList<Term> listOfTerms = new ArrayList<>(); //  //array list of terms form Term class	

	public TermList() 
	{
	}

	public void addTerms() throws Exception // // Method of split of data in string and double
	{
		File usersFile = new File("./terms.txt");	//it is adding  file with list of data
		Scanner inUsers = new Scanner(usersFile);
		String delims = "	";//each field in the file is separated(delimited) by a space.
		while (inUsers.hasNextLine()) 
		{
			// get user and rating from data source
			String userDetails = inUsers.nextLine();
			// parse user details string
			String[] userTokens = userDetails.split(delims);

			// output user data to console.
			if (userTokens.length == 2) 
			{
				Term term = new Term();
				term.weight = Double.parseDouble(userTokens[0]);   
				term.term = (userTokens[1]);
				listOfTerms.add(term);

			}else
			{
				inUsers.close();
				throw new Exception("Invalid member length: "+userTokens.length);
			}
		}	
	}

}

