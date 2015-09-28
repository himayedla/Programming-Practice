package inovvapath;
import java.util.*;

public class AddElements {
	public static ArrayList<String> addElement(ArrayList<String> a1){

		a1.add("one");
		a1.add("two");
		a1.add("three");
		a1.add("four");

		return a1;
	}
	
	public static void print(ArrayList<String> a1){
		ListIterator i1;
		
		i1 = a1.listIterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
	}
	
	
   public static void printReverse(ArrayList<String> a1){
	   ListIterator i1;
		
		i1 = a1.listIterator(a1.size());
		while(i1.hasPrevious()) {
			System.out.println(i1.previous());
		}
		
	}

	
	/**
	 * @param a1
	 * @param search
	 * 
	 * @return
	 */
	public static String searchList(ArrayList<String> a1,String search){

		for(String str : a1) {
			if(str.compareTo(search) == 0) {
				System.out.println("item found");
			}
		
		}
		return search;
	}


	public static void main(String args[]){
		ArrayList<String> a2 = new ArrayList<String>();
		
		a2 =  addElement(a2);
		searchList(a2,"one");
		print(a2);
		printReverse(a2);
	}
	
//	public static void main(String[] args){
//		// Create an array list
//		ArrayList<String> al = new ArrayList<String>();
//		System.out.println("Initial Size : " + al.size());
//		
//		//Adding elements to Array list
//		al.add("A");
//		al.add("B");
//		al.add("C");
//		al.add("3");
//		
//		//Size after adding the elements
//		System.out.println("Size after adding elements : " + al.size());
//		System.out.println(al);
//		
//		//print the elements using Iterator
//		System.out.println("Array list contains :");
//		for(String str:al)
//		System.out.print(" "+ str);
//		
//		//Printing the list in Reverse order
//		ListIterator i = al.listIterator(al.size());
//		System.out.println("Reverse Order: ");
//	    while (i.hasPrevious()) {
//	    System.out.print(" "+ i.previous());
//	    }
//	    
//	  //Search for an element in the list
//	  		if(al.contains("C")){
//	  				System.out.println(" "+ "It is in the list");
//	  		}
//		
//		
		
		
		
	}

