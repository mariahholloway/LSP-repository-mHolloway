package org.howard.edu.lsp.assignment5.implementation;

/**
 * @author Mariah.h
 */
import java.util.*;
public class IntegerSet {
	
	  
	   public ArrayList<Integer> list= new ArrayList<>();
	   /**
	    * Default Constructor
	    * @param setA
	    * @return 
	    */
	  
	   public IntegerSet(ArrayList<Integer> list) {
	       this.list=list;
	   }
	  
	  
	  
	


	/**   clears the all representation of class
	 * 
	 */
	   public void clear() {
	       list.clear();
	   }
	  
	/**   returns the length of set
	 * 
	 * @return
	 */
	  
	   public int length() {
	       return list.size();
	   }
	  
	/**  return true if 2 lists are equal,false otherwise;
	 * Two sets are equal if they contain all the same values in ANY order
	 * 
	 * @param b
	 * @return
	 */
	   public boolean equals(IntegerSet b) {
	      
	       ArrayList<Integer> list2=b.list;
	         
	       if(list.size()!=list2.size()) {
	           return false;
	       }
	         
	       ArrayList<Integer> temp1=list;
	         
	       ArrayList<Integer> temp2=list2;
	         
	       Collections.sort(temp1);
	       Collections.sort(temp2);
	         
	       for(int i=0;i<temp1.size();i++) {
	           if(temp1.get(i)!=temp2.get(i)) {
	               return false;
	           }
	       }
	         
	       return true;
	      
	   }
	  
	  
	/**   returns a largest item and throw exception if list is empty
	 * 
	 * @return
	 * @throws Listemptyexception
	 */
	  
	   public int largestelement() throws Listemptyexception {
	      
	       if(list.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int max=0;
	      
	       for(int i=0;i<list.size();i++) {
	           if(list.get(i)>max) {
	               max=list.get(i);
	           }
	       }
	      
	       return max;
	      
	   }
	  
	/**   returns a largest item and throw exception if list is empty
	 * 
	 * @return
	 * @throws Listemptyexception
	 */
	  
	   public int smallestelement() throws Listemptyexception {
	      
	       if(list.size()==0) {
	           Listemptyexception e= new Listemptyexception();
	           throw e;
	       }
	      
	       int min=Integer.MAX_VALUE;
	      
	       for(int i=0;i<list.size();i++) {
	           if(list.get(i)<min) {
	               min=list.get(i);
	           }
	       }
	      
	       return min;
	      
	   }
	  
	/**   add item if already not exist in list
	 * 
	 * @param item
	 */
	  
	   public void addItem(int item ) {
	      
	       boolean exist=false;
	      
	       for(int i=0;i<list.size();i++) {
	          
	           if(list.get(i)==item) {
	               exist=true;
	           }
	       }
	      
	       if(exist==false) {
	           list.add(item);
	       }
	      
	   }
	  
	/**  remove item if already not exist in list
	 * 
	 * @param item
	 */
	  
	   public void removeItem(int item ) {
	      
	      
	      
	       for(int i=0;i<list.size();i++) {
	          
	           if(list.get(i)==item) {
	               list.remove(i);
	           }
	       }
	      
	   }
	  
	/**  return union of of 2 sets
	 * 
	 * @param list2
	 * @return
	 */
	   public IntegerSet union(IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       Set<Integer> set = new HashSet<>();
	       set.addAll(list);
	       set.addAll(temp);
	      
	       ArrayList<Integer> list3= new ArrayList<>(set);
	      
	       IntegerSet list4= new IntegerSet(list3);
	      
	       return list4;
	      
	   }
	  
	/**   return intersection of of 2 sets
	 * 
	 * @param list2
	 * @return
	 */
	   public IntegerSet intersection(IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       list.retainAll(temp);
	      
	IntegerSet list4= new IntegerSet(list);
	      
	       return list4;
	   }
	  
	/**   returns difference of 2 sets
	 * 
	 * @param list2
	 * @return
	 */
	   public IntegerSet difference (IntegerSet list2) {
	      
	       ArrayList<Integer> temp=list2.getlist();
	      
	       /** Remove all elements in list2 from list 
	        * 
	        */
	       list.removeAll(temp);
	      
	IntegerSet list4= new IntegerSet(list);
	      
	       return list4;
	      
	   }
	  
	   public ArrayList<Integer> getlist(){
	       return list;
	   }



	public void add(int i) {
		// TODO Auto-generated method stub
		
	}



	public boolean isEmpty() {
		Object set = null;
		if(set==null)
			   return true;//if empty return true
			   else
			   return false;//return false if not empty
			   }
	
	}
	  
	  
	


