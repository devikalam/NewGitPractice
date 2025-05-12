package excelutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {
	public String getDataFromPropertyFile(String key) throws Throwable {
		FileInputStream fis=new FileInputStream("./src/test/resources/jupiterdata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String data = pro.getProperty(key);
		return data;
		
		
	}

}
