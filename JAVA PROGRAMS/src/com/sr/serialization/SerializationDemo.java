package com.sr.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	int i=10;
	
	int j=30;
	Dog(){
		super();
		System.out.println("Dog Class");
	}
}
public class SerializationDemo {

	public static void main(String[] args) throws IOException,ClassNotFoundException{
		Dog d=new Dog();
		//Serialization
		FileOutputStream fos=new FileOutputStream("abc.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d);
		System.out.println(d);
		//De-serialization
		FileInputStream fis=new FileInputStream("abc.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2=(Dog)ois.readObject();
		System.out.println(d2.i);
		
		
		

	}

}
