package file;

import java.io.File;

/**
 * 访问一个目录中的所有子项
 * @author ta
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		//获取当前目录中的所有子项
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * 判断当前File表示的是否为文件
		 * 
		 * boolean isDirectory()
		 * 判断当前File表示的是否为目录
		 */
		if(dir.isDirectory()) {
			/*
			 * File[] listFiles()
			 * 获取当前目录中的所有子项,数组中每一个
			 * 元素就是其中一个子项
			 */
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
		
		
	}
}





