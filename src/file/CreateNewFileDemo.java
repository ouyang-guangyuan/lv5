package file;

import java.io.File;
import java.io.IOException;

/**
 * 使用File创建一个文件
 * @author ta
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 在当前项目目录下新建一个文件test.txt
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * 判断当前File表示的文件或目录是否
		 * 已经存在,存在则返回true
		 */
		if(!file.exists()) {
			//创建该文件
			file.createNewFile();
			System.out.println("文件已创建!");
		}else {
			System.out.println("文件已存在!");
		}
		
	}
}




