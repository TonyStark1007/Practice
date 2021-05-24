package generic;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertyFile implements Autoconstant {
	
	public String getData(String key) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream(Propertyfilepath));
		return p.getProperty(key);
	}

}