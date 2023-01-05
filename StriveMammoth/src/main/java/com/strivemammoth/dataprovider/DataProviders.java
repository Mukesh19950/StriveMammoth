package com.strivemammoth.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.strivemammoth.utility.NewExcelLibrary;

public class DataProviders {
	
	
	NewExcelLibrary obj = new NewExcelLibrary();


		
	    @DataProvider(name = "newclients")
	    public Object[] getclientdata() {
	    	
	    	//Total rows count
	    	int rows = obj.getRowCount("Clients_Data");
	    	
	    	//Total Columns
	    	int column = obj.getColumnCount("Clients_Data");
	    	int actRows = rows - 1;
	    	
	    	
	    	Object[][] data = new Object[actRows][1];
	    	
	    	for (int i=0; i < actRows; i++)
	    	{
	    		Map<String , String> hashmap = new HashMap<>();
	    		for (int j=0; j < column; j++)
	    		{
	    			hashmap.put(obj.getCellData("Clients_Data", j, 1), obj.getCellData("Clients_Data", j, i + 2));
	    		}
	    		
	    		data[i][0]=hashmap;
	    	}
			return data;
	    	
	    	
	    	
	    }
		
		
		
		
		
		
		
}
