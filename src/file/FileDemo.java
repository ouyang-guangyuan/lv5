package file;

import java.io.File;

/**
 * java.io.File 
 * File���ڱ�ʾ�ļ�ϵͳ�е�һ���ļ���Ŀ¼��
 * 
 * ʹ��File���ǿ���:
 * 1:�������ʾ���ļ���Ŀ¼������(����,��С��)
 * 2:����,ɾ���ļ���Ŀ¼
 * 3:����һ��Ŀ¼�е�����
 * 
 * ���ǲ��ܷ����ļ�����.
 * @author ta
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		/*
		 * ����File��Ҫָ��·��
		 * ·��������:����·�������·��
		 * ����·��ͨ��������,��Ȼ��������,
		 * �����޷�������ƽ̨.
		 * 
		 * ���·������ֱ�����ֳ�ʵ��λ��,����
		 * ����Ӧ���ֲ�ͬ���л���.
		 * ��eclipse��ִ�д���ʱ,"./"��ǰĿ¼
		 * ָ�ľ��ǵ�ǰ��ĿĿ¼
		 */
		File file = new File("./demo.txt");		
		//��ȡ�ļ���
		String name = file.getName();
		System.out.println(name);
		//��ȡ����(��λ���ֽ�)
		long len = file.length();
		System.out.println(len+"�ֽ�");
		//��ȡ����·��
		String path = file.getAbsolutePath();
		System.out.println(path);
		/*
		 * �Ƿ�ɶ�,��д,�Ƿ�Ϊ�����ļ�
		 */
		boolean cr = file.canRead();
		boolean cw = file.canWrite();
		boolean ih = file.isHidden();
		System.out.println("�ɶ�:"+cr);
		System.out.println("��д:"+cw);
		System.out.println("�����ļ�:"+ih);
		
	}
}









