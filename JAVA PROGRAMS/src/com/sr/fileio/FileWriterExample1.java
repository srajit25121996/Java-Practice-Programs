package com.sr.fileio;

import java.io.IOException;
import java.io.FileWriter;

public class FileWriterExample1 {

	public static void main(String[] args) {
		FileWriter fw;
		try {
		 fw=new FileWriter("abc.txt");
		fw.write("Shubham");
		fw.flush();
		fw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}
			}

}
