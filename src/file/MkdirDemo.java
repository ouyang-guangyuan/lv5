package file;

import java.io.File;

/**
 * 创建一个目录
 * @author ta
 *
 */
public class MkdirDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录下新建一个名为demo的目录
		 */
		File dir = new File("./demo");
		if(!dir.exists()) {
			dir.mkdir();
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}




