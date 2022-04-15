package org.howard.edu.lsp.assignment6.integerset;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.Listemptyexception;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
  
   @Test
   @DisplayName("IntegerSet.isEmpty test cases")
   public void testIsEmpty() {
	   IntegerSet set = new IntegerSet(null);
	   assertTrue(set.isEmpty());
	   
	   set.addItem(1);
	   assertFalse(set.isEmpty());
   }
   @Test
   @DisplayName("IntergerSet.union test cases")
   public void testUnion() {
	   IntegerSet set1 = new IntegerSet(null);
	   set1.add(1);
	   set1.add(2);
	   
	   IntegerSet set2 = new IntegerSet(null);
	   set2.add(3);
	   
	   set1.union(set2);
	   System.out.println(set1.toString());
	   assertEquals("[1,2,3]", set1.toString());
	   assertNotEquals("[3,2,1]", set1.toString());
	   
	   
   }
   
   @Test
   public void testClear() {
       IntegerSet set = new IntegerSet(null);
       set.clear();
       assertEquals(0, 0);
   }

   @Test
   public void testLength() {
       IntegerSet set = new IntegerSet(null);
       assertEquals(0, set.length());
   }

   @Test
   public void testEqualsIntegerSet() {
       // two sets having same elements
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       IntegerSet set2 = new IntegerSet(null);
       set2.add(10);
       set2.add(20);
       set2.add(30);

       assertEquals(true, set1.equals(set2));
   }

   @Test
   public void testEqualsIntegerSet2() {
       // sets of different size
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       IntegerSet set2 = new IntegerSet(null);
       set2.add(10);
       set2.add(20);
       set2.add(30);

       assertEquals(false, set1.equals(set2));
   }

   @Test
   public void testEqualsIntegerSet3() {
       // sets of different elements
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       IntegerSet set2 = new IntegerSet(null);
       set2.add(50);
       set2.add(70);
       set2.add(80);

       assertEquals(false, set1.equals(set2));
   }



   @Test
   public void testLargest() throws Listemptyexception {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       set1.add(5);
       int expectedValue = 0;
       expectedValue = set1.largestelement();
       assertEquals(30, expectedValue);
   }

   

   @Test
   public void testSmallest() throws Listemptyexception {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       set1.add(5);
       int expectedValue = 0;
       expectedValue = set1.smallestelement();
       assertEquals(5, expectedValue);
   }



   @Test
   public void testAdd() {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       String expectedValue = "10 20 30 ";
       assertEquals(expectedValue, set1.toString());
   }

   @Test
   public void testAdd2() {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       set1.add(10);
       String expectedValue = "10 20 30 ";
       assertEquals(expectedValue, set1.toString());
   }

   @Test
   public void testRemove() {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       set1.removeItem(20);
       String expectedValue = "10 30 ";
       assertEquals(expectedValue, set1.toString());
   }



   @Test
   public void testToString() {
       IntegerSet set1 = new IntegerSet(null);
       set1.add(10);
       set1.add(20);
       set1.add(30);
       String expectedValue = "10 20 30 ";
       assertEquals(expectedValue, set1.toString());
   }

}