package exception;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��IO��ʹ���쳣�������
 * @author ta
 *
 */
public class FinallyDemo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("fos.dat");
			fos.write(1);
		}catch(Exception e) {
			System.out.println("������!");
		}finally {
			try {
				if(fos!=null) {
					fos.close();
				}
			} catch (Exception e) {
			}
		}
		
	}
}




