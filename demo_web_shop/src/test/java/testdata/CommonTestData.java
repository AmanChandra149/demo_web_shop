package testdata;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonTestData {

	public static String propertyFileData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commonDataFile.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key,"URL not found");
	}

}
