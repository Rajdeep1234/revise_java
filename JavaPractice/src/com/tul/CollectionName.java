package com.tul;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollectionName {
	 String getStringval() {
		// TODO Auto-generated method stub
		return "abc";
	}

	 
	 @Test
	 public  void  unitTestt()
	 {
	 	CollectionName name =new CollectionName();
	 	assertEquals("abc",name.getStringval());
	 	
	 }
	 
}


	
