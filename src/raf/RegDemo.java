package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 用户注册
 * 程序启动后,要求用户输入注册信息:
 * 用户名,密码,昵称,年龄
 * 其中除了年龄是int值外,其余三个是String.
 * 然后将该信息写入user.dat文件中保存.
 * 
 * 每条记录固定占用100字节.
 * 其中用户名,密码,昵称为字符串,各占用32字节.
 * 年龄为int值固定的4字节.
 * @author ta
 *
 */
public class RegDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎注册");
		
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		
		System.out.println("请输入密码:");
		String password = scanner.nextLine();
		
		System.out.println("请输入昵称:");
		String nickname = scanner.nextLine();
		
		System.out.println("请输入年龄:");
		int age = Integer.parseInt(scanner.nextLine());
		
		System.out.println(username+","+password+","+nickname+","+age);
	
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","rw");
		//首先将指针移动到文件末尾,以便追加新记录
		raf.seek(raf.length());
		
		//写入用户名
		byte[] data = username.getBytes("UTF-8");
		//扩容数组到32字节
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写密码
		data = password.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写昵称
		data = nickname.getBytes("UTF-8");
		data = Arrays.copyOf(data, 32);
		raf.write(data);
		
		//写年龄
		raf.writeInt(age);
		
		System.out.println("pos:"+raf.getFilePointer());
	
		System.out.println("注册完毕!");
		raf.close();
	}
}







