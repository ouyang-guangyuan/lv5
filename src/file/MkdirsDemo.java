package file;

import java.io.File;

/**
 * ����һ���༶Ŀ¼
 * @author ta
 *
 */
public class MkdirsDemo {
	public static void main(String[] args) {
		/*
		 * �ڵ�ǰĿ¼���½�Ŀ¼:a/b/c/d/e/f
		 */
		File dir = new File("./a/b/c/d/e/f");
		if(!dir.exists()) {
			//�������ڵĸ�Ŀ¼һͬ��������
			dir.mkdirs();
			System.out.println("Ŀ¼�Ѵ���!");
		}else {
			System.out.println("Ŀ¼�Ѵ���!");
		}
	}
}




