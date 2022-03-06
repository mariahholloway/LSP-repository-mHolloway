package org.howard.edu.lsp.assignment5.test;


	import java.util.*;

	import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
	import org.howard.edu.lsp.assignment5.implementation.Listemptyexception;

	public class Driver {

		   public static void main(String[] args) throws Listemptyexception {
		      
		ArrayList<Integer> list1= new ArrayList<>();
		ArrayList<Integer> list2= new ArrayList<>();
		  
		  
		/** make 2 instance of integerset class for implementation
		 * 
		 */
		IntegerSet set1= new IntegerSet(list1);
		IntegerSet set2= new IntegerSet(list2);
		/**TODO Auto-generated method sub
		 * 
		 */
		  
		set1.addItem(1);
		set1.addItem(3);
		set1.addItem(4);
		set1.addItem(6);
		set1.addItem(3);
		set1.addItem(8);
		set1.addItem(7);
		  
		set2.addItem(1);
		set2.addItem(2);
		set2.addItem(3);
		set2.addItem(4);
		set2.addItem(5);
		set2.addItem(6);
		set2.addItem(7);
		  
		System.out.println("Set 1 : "+set1.getlist());
		System.out.println("Set 2 : "+set2.getlist());
		  
		System.out.println("Is equal : "+set1.equals(set2));
		  
		System.out.println("Largest element in set1 : "+set1.largestelement());
		  
		System.out.println("Smallest element in set2 : "+set2.smallestelement());
		  
		IntegerSet setu= set1.union(set2);
		  
		System.out.println("Union : "+setu.getlist() );
		  
		IntegerSet seti= set1.intersection(set2);
		  
		System.out.println("Intersection : "+seti.getlist() );
		  

		      
		   }

	}





