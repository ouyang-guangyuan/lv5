package file;

import java.io.File;
import java.io.FileFilter;

/**
 * ��ȡһ��Ŀ¼��ָ��������
 * File[] listFiles(FileFilter filter)
 * ��Ŀ¼�з��Ϲ�����Ҫ��������ȡ
 * @author ta
 *
 */
public class ListFilesDemo2 {
	public static void main(String[] args) {
		/*
		 * ��ȡ��ǰĿ¼������������"."��ͷ������
		 */
		File dir = new File(".");
		if(dir.isDirectory()) {
//			MyFilter filter = new MyFilter();
			//�����ڲ��ඨ�������
			FileFilter filter = new FileFilter() {
				public boolean accept(File file) {
					return file.getName().startsWith(".");
				}
			};
			
			
			
			//�ص�ģʽ
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
		System.out.println("���ڹ���:"+name);
		return name.startsWith(".");
	}	
}






