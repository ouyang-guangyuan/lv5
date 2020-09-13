package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 	
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "苍老师";
		int age = 18;
		String gender = "女";
		String[] otherInfo = {"是一名演员","爱好是写毛笔字","生了一对双胞胎","促进中日文化交流"};		
		Person p = new Person(name, age, gender, otherInfo);		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		oos.writeObject(p);
		System.out.println("写出完毕!");		
		oos.close();		
	}
}













