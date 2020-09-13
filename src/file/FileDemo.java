package file;

import java.io.File;

/**
 * java.io.File 
 * File用于表示文件系统中的一个文件或目录的
 * 
 * 使用File我们可以:
 * 1:访问其表示的文件或目录的属性(名字,大小等)
 * 2:创建,删除文件或目录
 * 3:访问一个目录中的子项
 * 
 * 但是不能访问文件数据.
 * @author ta
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * 创建File是要指定路径
		 * 路径有两种:绝对路径和相对路径
		 * 绝对路径通常不适用,虽然清晰明了,
		 * 但是无法做到跨平台.
		 * 
		 * 相对路径不能直观体现出实际位置,但是
		 * 灵活并适应各种不同运行环境.
		 * 在eclipse中执行代码时,"./"当前目录
		 * 指的就是当前项目目录
		 */
		File file = new File("./demo.txt");		
		//获取文件名
		String name = file.getName();
		System.out.println(name);
		//获取长度(单位是字节)
		long len = file.length();
		System.out.println(len+"字节");
		//获取绝对路径
		String path = file.getAbsolutePath();
		System.out.println(path);
		/*
		 * 是否可读,可写,是否为隐藏文件
		 */
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		boolean ih = file.isHidden();
		System.out.println("可读:"+cr);
		System.out.println("可写:"+cw);
		System.out.println("隐藏文件:"+ih);
		
	}
}









