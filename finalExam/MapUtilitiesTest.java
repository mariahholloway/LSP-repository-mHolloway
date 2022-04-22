package org.howard.edu.lsp.finalExam;

import static org.junit.jupiter.api.Assertions.*; 

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapUtilitiesTest {
	
		@Test
		@DisplayName("HashMap Junit test")
		 void testMapUtilities()throws NullMapException{
				HashMap<String, String > map1 = new HashMap<>();
				map1.put("Alice", "Healthy");
				map1.put("Mary", "Ecstatic");
				map1.put("Bob", "Happy");
				map1.put("Chuck", "Fine");
				map1.put("Felix", "Sick");
				HashMap<String, String> map2= new HashMap<>();
				map2.put("Mary", "Ecstatic");
				map2.put("Felix", "Healthy");
				map2.put("Ricardo", "Subperb");
				map2.put("Tam", "Fine");
				map2.put("Bob", "Happy");
				
				MapUtilities mapp =new MapUtilities();
				assertEquals(2, mapp.CommonKeyValuePairs(map1,map2));
}
		@Test
		@DisplayName("HashMapEmpty Junit test")
		 void testMapUtilitiesEmpty() throws NullMapException{
				HashMap<String, String > map1 = new HashMap<>();
				HashMap<String, String > map2 = new HashMap<>();
				MapUtilities mapp = new MapUtilities();
				assertEquals(0, mapp.CommonKeyValuePairs(map1,map2));
		}
		@Test
		@DisplayName("HashMapNull exception test")
		 void testMapUtilities_THROWS_NullMapException(){
				HashMap<String, String > map1 = new HashMap<>();
				HashMap<String, String > map2 = new HashMap<>();
				MapUtilities mapp = new MapUtilities();
				Exception exception = assertThrows(NullMapException.class, () -> {
					mapp.CommonKeyValuePairs(null, map2);
}
				);
		}

}

	