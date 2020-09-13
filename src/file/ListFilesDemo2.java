package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录下指定的子项
 * File[] listFiles(FileFilter filter)
 * 将目录中符合过滤器要求的子项获取
 * @author ta
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * 获取当前目录中所有名字以"."开头的内容
		 */
		File dir = new File(".");
		if(dir.isDirectory()) {
//			MyFilter filter = new MyFilter();
			//匿名内部类定义过滤器
			FileFilter filter = new FileFilter() {
				public boolean accept(File file) {
					return file.getName().startsWith(".");
				}
			};
			
			
			
			//回调模式
			File[] subs = dir.listFiles(filter);
			System.out.println(subs.length);
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
	}
}

class MyFilter implements FileFilter{
	public boolean accept(File file) {
		String name = file.getName();
		System.out.println("正在过滤:"+name);
		return name.startsWith(".");
	}	
}






