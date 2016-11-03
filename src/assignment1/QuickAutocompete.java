package assignment1;

import java.util.ArrayList;

public class QuickAutocompete
{
	public static ArrayList<String> getColectionK() {
		colectionK.addAll(colectionK);
		return getColectionK();
	}
	static ArrayList<String> colectionK = new ArrayList<>();
public  int quickAutocompete( String colectionK[], int start, int end)
{
        // index for the "left-to-right scan"
        int i = start;
        // index for the "right-to-left scan"
        int j = end;

        // only examine arrays of 2 or more elements.
        if (j - i >= 1)
        {
            // The pivot point of the sort method is arbitrarily set to the first element int the array.
            String pivot = colectionK[i];
            // only scan between the two indexes, until they meet.
            while (j > i)
            {
                // from the left, if the current element is lexicographically less than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the right or an element that is lexicographically greater than the pivot String.
                while (colectionK[i].compareTo(pivot) < 0 && i <= end && j > i){
                    i++;
                }
                // from the right, if the current element is lexicographically greater than the (original)
                // first element in the String array, move on. Stop advancing the counter when we reach
                // the left or an element that is lexicographically less than the pivot String.
                while (colectionK[j].compareTo(pivot) > 0 && j >= start && j >= i){
                    j--;
                }
                // check the two elements in the center, the last comparison before the scans cross.
                if (j > i)
                    swap(colectionK, i, j);
            }
            // At this point, the two scans have crossed each other in the center of the array and stop.
            // The left partition and right partition contain the right groups of numbers but are not
            // sorted themselves. The following recursive code sorts the left and right partitions.

            // Swap the pivot point with the last element of the left partition.
            swap(colectionK, start, j);
            // sort left partition
            quickAutocompete(colectionK, start, j - 1);
            // sort right partition
            quickAutocompete(colectionK, j + 1, end);
        }
        
        return i;
    }
    /**
     * This method facilitates the quickSort method's need to swap two elements, Towers of Hanoi style.
     */
    private static void swap(String[] colectionK, int i, int j)
    {
    String temp = colectionK[i];
    colectionK[i] = colectionK[j];
    colectionK[j] = temp;
    }
    
}
	// metoda do posortowania listy w szyku alfabetycznym







////////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\



////	BruteAutocomplete bruteAutocomplete = new BruteAutocomplete();
//	ArrayList<Term> colectionOfQuick = new ArrayList<>();
//	int left;
//	int right;
////	private double result;
////	private String result2;
//	TermList termlist = new TermList();	
//	public QuickAutocompete() 
//	{
//		try 
//		{
//			ArrayList<Term> listOfTerms = termlist.addTerms();
//		} 
//		catch (FileNotFoundException e) {
//			System.out.println("error");
//		}
//
//	}
//	
//	@SuppressWarnings("unused")
//	public void quickSort(String inuptterm)
//	{
//		int index = partition (colectionOfQuick, left, right );
//		
//		if (left < index - 1)
//			colectionOfQuick2 (colectionOfQuick, left, right);
//	}
//
//	
//
//	
//	
//	private void colectionOfQuick2(ArrayList<Term> colectionOfQuick2, int left2, int right2) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private int partition(ArrayList<Term> colectionOfQuick2, int left2, int right2) {
//	
//		return 0;
//	}

//}
