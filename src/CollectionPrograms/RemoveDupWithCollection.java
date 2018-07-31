package CollectionPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDupWithCollection {

	public static void main(String[] args) {
		List<String>  arraylist = new ArrayList<String>();
	    
	    arraylist.add("java");
	    arraylist.add("php");
	    arraylist.add("java");
	    arraylist.add("c++");
	      
	    
	    HashSet<String> hashset = new HashSet<String>();
	    
	    /* Adding ArrayList elements to the HashSet
	     * in order to remove the duplicate elements and 
	     * to preserve the insertion order.
	     */
	    hashset.addAll(arraylist);
	 
	    // Removing ArrayList elements
	    arraylist.clear();
	 
	    // Adding LinkedHashSet elements to the ArrayList
	    arraylist.addAll(hashset);
	 
	    System.out.println(arraylist);
	 

	}

}
