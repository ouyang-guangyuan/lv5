package file;

import java.io.File;
import java.io.IOException;

/**
 * ʹ��File����һ���ļ�
 * @author ta
 *
 */
public class CreateNewFileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * �ڵ�ǰ��ĿĿ¼���½�һ���ļ�test.txt
		 */
		File file = new File("./test.txt");
		/*
		 * boolean exists()
		 * �жϵ�ǰFile��ʾ���ļ���Ŀ¼�Ƿ�
		 * �Ѿ�����,�����򷵻�true
		 */
		if(!file.exists()) {
			//�������ļ�
			file.createNewFile();
			System.out.println("�ļ��Ѵ���!");
		}else {
			System.out.println("�ļ��Ѵ���!");
		}
		
	}
}




