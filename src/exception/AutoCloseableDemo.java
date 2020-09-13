package exception;

import java.io.FileOutputStream;

/**
 * JDK7֮���Ƴ���һ������:AutoCloseable
 * ������ּ����������Դ�����п����Ը��򻯵�
 * ���������finally�йر���.
 * @author ta
 *
 */
public class AutoCloseableDemo {
	public static void main(String[] args) {
		try(
			/*
			 * �����ﶨ��������ջᱻ��������Ϊ
			 * ��finally�йر�.
			 * ֻ��ʵ����AutoCloseable�ӿڵ����
			 * �������ﶨ�岢ʵ����.
			 * ����RandomAccessFile��ʵ���˸ýӿ�
			 */
			FileOutputStream fos 
				= new FileOutputStream("fos.dat");
		){
			fos.write(1);
		}catch(Exception e) {
			System.out.println("������!");
		}
	}
}





