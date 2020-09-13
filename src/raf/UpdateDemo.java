package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * ����޸��ǳƲ���
 * 
 * ����������Ҫ�������û������µ��ǳ�.Ȼ��
 * �޸�user.dat�ļ��и��û����ǳ�.
 * ��������û�����user.dat�ļ��в����������
 * ��ʾ��Ϣ:���û�������!
 * 
 * 
 * @author ta
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = scanner.nextLine();
		System.out.println("�������µ��ǳ�:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","rw");
		
		boolean updated = false;//�Ƿ��޸Ĺ���Ϣ
		for(int i=0;i<raf.length()/100;i++) {
			//�ƶ���ÿ����¼�Ŀ�ʼλ��
			raf.seek(i*100);
			//��ȡ�û���
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			if(name.equals(username)) {
				//�ƶ�ָ�뵽�ǳ�λ��
				raf.seek(i*100+64);
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("�޸����!");
				updated = true;
				break;
			}
		}
		if(!updated) {
			System.out.println("���û�������!");
		}
		raf.close();
	}
}










