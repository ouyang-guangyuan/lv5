package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �û�ע��
 * ����������,Ҫ���û�����ע����Ϣ:
 * �û���,����,�ǳ�,����
 * ���г���������intֵ��,����������String.
 * Ȼ�󽫸���Ϣд��user.dat�ļ��б���.
 * 
 * ÿ����¼�̶�ռ��100�ֽ�.
 * �����û���,����,�ǳ�Ϊ�ַ���,��ռ��32�ֽ�.
 * ����Ϊintֵ�̶���4�ֽ�.
 * @author ta
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ӭע��");
		
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		
		System.out.println("����������:");
		String password = scanner.nextLine();
		
		System.out.println("�������ǳ�:");
		String nickname = scanner.nextLine();
		
		System.out.println("����������:");
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println(username+","+password+","+nickname+","+age);
	
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","rw");
		//���Ƚ�ָ���ƶ����ļ�ĩβ,�Ա�׷���¼�¼
		raf.seek(raf.length());
		
		//д���û���
		byte[] data = username.getBytes("UTF-8");
		//�������鵽32�ֽ�
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//д����
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//д�ǳ�
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//д����
		raf.writeInt(age);
		
		System.out.println("pos:"+raf.getFilePointer());
	
		System.out.println("ע�����!");
		raf.close();
	}
}







