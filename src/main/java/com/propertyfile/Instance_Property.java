package com.propertyfile;

import java.io.IOException;

public class Instance_Property {

	private Instance_Property()
	{
	
	}
	public static Property_File getInstance() throws IOException {

		Property_File pf = new Property_File();
		return pf;
		
	}
	
	
	
	
}
