package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream; 	
public class OOSDemo {
	public static void main(String[] args) throws IOException {
		String name = "����ʦ";
		int age = 18;
		String gender = "Ů";
		String[] otherInfo = {"��һ����Ա","������дë����","����һ��˫��̥","�ٽ������Ļ�����"};		
		Person p = new Person(name, age, gender, otherInfo);		
		FileOutputStream fos
			= new FileOutputStream("person.obj");
		ObjectOutputStream oos
			= new ObjectOutputStream(fos);
		oos.writeObject(p);
		System.out.println("д�����!");		
		oos.close();		
	}
}













