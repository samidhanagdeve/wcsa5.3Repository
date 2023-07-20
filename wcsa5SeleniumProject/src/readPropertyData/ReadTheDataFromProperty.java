package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadTheDataFromProperty {
	public static void main(String[] args) throws IOException {
		
		
	FileInputStream fis =new FileInputStream("./data/config.properties");
	Properties prop = new Properties();
	
	prop.load(fis);
	
	String data = prop.getProperty("Browser");
			System.out.println(data);
	}

}
