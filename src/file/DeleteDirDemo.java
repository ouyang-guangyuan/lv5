package file;

import java.io.File;

/**
 * ɾ��Ŀ¼
 * @author ta
 *
 */
public class DeleteDirDemo {
	public static void main(String[] args) {
		//ɾ����ǰĿ¼�е�demoĿ¼
		File dir = new File("./demo");
		if(dir.exists()) {
			/*
			 * ɾ��Ŀ¼��һ��ǰ������.���Ǹ�
			 * Ŀ¼��һ����Ŀ¼.
			 */
			dir.delete();
			System.out.println("Ŀ¼��ɾ��!");
		}else {
			System.out.println("Ŀ¼������!");
		}
	}
}






