package framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class Utilities {

	
	public static String readConfig(String tagname) {
		Properties prop = new Properties();
		String value = null;
		try {
			File file = new File("D:\\PrismAutomation\\COA\\src\\configuration\\config.properties");
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}

			value = prop.getProperty(tagname);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return value;
	}

	// return random number of specific length 
	public static int getRandonNumber(int count){
		Random rand = new Random(); 
		int min = 1;
		for(int i=1; i<=count; i++){
			min = min *10;
		}
		int max = min * 9;
		int value = min + rand.nextInt(max);
		return value;
	}
	
}
