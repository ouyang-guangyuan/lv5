package file;

import java.io.File;

/**
 * ����һ��Ŀ¼�е���������
 * @author ta
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		//��ȡ��ǰĿ¼�е���������
		File dir = new File(".");
		/*
		 * boolean isFile()
		 * �жϵ�ǰFile��ʾ���Ƿ�Ϊ�ļ�
		 * 
		 * boolean isDirectory()
		 * �жϵ�ǰFile��ʾ���Ƿ�ΪĿ¼
		 */
		if(dir.isDirectory()) {
			/*
			 * File[] listFiles()
			 * ��ȡ��ǰĿ¼�е���������,������ÿһ��
			 * Ԫ�ؾ�������һ������
			 */
			File[] subs = dir.listFiles();
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				System.out.println(sub.getName());
			}
		}
		
		
	}
}





