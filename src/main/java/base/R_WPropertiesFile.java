package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class R_WPropertiesFile {

	public Properties rwProperties(String path) throws IOException {
		InputStream input = new FileInputStream(path);
		Properties pro = new Properties();
		pro.load(input);
		return pro;

	}

}
