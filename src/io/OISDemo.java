package io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * 对象输入流
 * @author ta
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * 将person.obj文件中的对象读取出来
		 */
		FileInputStream fis 
			= new FileInputStream("person.obj");
		ObjectInputStream ois
			= new ObjectInputStream(fis);		
		Person p = (Person)ois.readObject();
		System.out.println(p);		
		ois.close();		
	}
}












