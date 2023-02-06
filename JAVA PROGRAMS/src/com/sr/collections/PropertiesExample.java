package com.sr.collections;

import java.util.Properties;
import java.io.*;

public class PropertiesExample {

	public static void main(String[] args) throws Exception {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\JAVA PROGRAMS\\src\\abc.properties");
		p.load(fis);
		System.out.println(p);
		p.setProperty("Name", "Dzone");
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\shubh\\\\eclipse-workspace\\\\JAVA PROGRAMS\\\\src\\\\abc.properties");
p.store(fos, "Developer Shubham");

	}

}
