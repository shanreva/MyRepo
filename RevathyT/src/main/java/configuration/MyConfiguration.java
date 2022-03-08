package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MyConfiguration {
	
	public static String passProperties(String myPropertyData)
	{
		FileReader myfile = null;
		
		try {
			myfile=new FileReader("C:\\Users\\shant\\eclipse-workspace\\RevathyT\\src\\main\\java\\configuration\\Config.Properties");
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Properties p =new Properties();
		try {
			p.load(myfile);
		} catch(IOException e)
		{
			e.printStackTrace();
		}	
			String myData = p.getProperty(myPropertyData);
			return myData;
		
	}

}
