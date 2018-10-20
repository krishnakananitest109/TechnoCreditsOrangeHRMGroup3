package com.technocredits.orangeHRM.Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.technocredits.orangeHRM.CONSTANT.CONSTANT;

public class PropertyFileReader {
	public Properties initalizePropertyFile(String propFileName){
		File file = new File(CONSTANT.PROPERTIES+ File.separator +propFileName + ".properties");
		Properties prop = null;
		try {
			FileInputStream input = new FileInputStream(file);
			prop = new Properties();
			prop.load(input);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
	}

}
