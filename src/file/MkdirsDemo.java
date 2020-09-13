package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @author ta
 *
 */
public class MkdirsDemo {
	public static void main(String[] args) {
		/*
		 * 在当前目录下新建目录:a/b/c/d/e/f
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()) {
			//将不存在的父目录一同创建出来
			dir.mkdirs();
			System.out.println("目录已创建!");
		}else {
			System.out.println("目录已存在!");
		}
	}
}




