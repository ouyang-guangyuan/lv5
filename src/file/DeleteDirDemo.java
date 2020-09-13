package file;

import java.io.File;

/**
 * 删除目录
 * @author ta
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		//删除当前目录中的demo目录
		File dir = new File("./demo");
		if(dir.exists()) {
			/*
			 * 删除目录有一个前提条件.就是该
			 * 目录是一个空目录.
			 */
			dir.delete();
			System.out.println("目录已删除!");
		}else {
			System.out.println("目录不存在!");
		}
	}
}






