package io;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
/**
 * ����������
 * @author ta
 */
public class OISDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*
		 * ��person.obj�ļ��еĶ����ȡ����
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












