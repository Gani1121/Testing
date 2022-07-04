package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configreader {
	
	Properties pro;
	public  configreader() throws IOException {
		
		try {	
	
	File file = new File ("./configration/config.property/");
	
		FileInputStream fs  = new FileInputStream(file);
		 pro = new Properties();
		 pro.load(fs);
		 
		 } catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	public String getapplicationURL() {
		return pro.getProperty("URL");
	}
	public String getUserId() {
		return pro.getProperty("UserId");
	}
	
	public String getpassword() {
		return pro.getProperty("password");
	}
		
	}
	
	
	
	
		
	
	
	
	
	
	
