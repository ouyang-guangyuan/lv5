package file;

import java.io.File;
/**
 * ��дһ�δ���,���1+2+3+4+...100,�����
 * ���.
 * ��δ����в��ó���for,while�ؼ���
 * 
 * 
 * ����ˮ,1��Ǯ1ƿ��ˮ,3��ƿ�ǿ��Ի�1ƿ��ˮ,
 * 2����ƿ���Ի�һƿ,��:20��Ǯ���Եõ�����ƿ?
 * 
 * 
 * @author ta
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/*
	 * ɾ��ʱ�����ж�file��ʾ���Ƿ�ΪĿ¼
	 * �����ļ���ֱ��ɾ��,����Ŀ¼��Ӧ��ǰ
	 * ��ȡ��Ŀ¼����������ɾ������ɾ��
	 * ��Ŀ¼.
	 */
	public static void delete(File file) {
		if(file.isDirectory()) {
			//�Ƚ���Ŀ¼���
			//1��ȡ��Ŀ¼�е���������
			File[] subs = file.listFiles();
			//2���ɾ������
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				/*
				 * �ݹ����:һ�������ڲ�����
				 * �Լ�����������.
				 */
				delete(sub);
			}			
		}
		file.delete();
		
	}
}




