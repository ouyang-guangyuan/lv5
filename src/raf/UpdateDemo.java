package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 完成修改昵称操作
 * 
 * 程序启动后要求输入用户名和新的昵称.然后
 * 修改user.dat文件中该用户的昵称.
 * 若输入的用户名在user.dat文件中不存在则输出
 * 提示信息:该用户不存在!
 * 
 * 
 * @author ta
 *
 */
public class UpdateDemo {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = scanner.nextLine();
		System.out.println("请输入新的昵称:");
		String nickname = scanner.nextLine();
		
		RandomAccessFile raf 
			= new RandomAccessFile("user.dat","rw");
		
		boolean updated = false;//是否修改过信息
		for(int i=0;i<raf.length()/100;i++) {
			//移动到每条记录的开始位置
			raf.seek(i*100);
			//读取用户名
			byte[] data = new byte[32];
			raf.read(data);
			String name = new String(data,"UTF-8").trim();
			if(name.equals(username)) {
				//移动指针到昵称位置
				raf.seek(i*100+64);
				data = nickname.getBytes("UTF-8");
				data = Arrays.copyOf(data, 32);
				raf.write(data);
				System.out.println("修改完毕!");
				updated = true;
				break;
			}
		}
		if(!updated) {
			System.out.println("该用户不存在!");
		}
		raf.close();
	}
}










