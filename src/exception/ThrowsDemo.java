package exception;

import java.awt.AWTException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * ������д���ຬ��throws�����쳣�׳��ķ���ʱ
 * ��throws����д����
 * @author ta
 *
 */
public class ThrowsDemo {
	public void dosome()
			throws IOException,AWTException {
		
	}
}

class SubClass extends ThrowsDemo{
//	public void dosome()
//			throws IOException,AWTException {
//		
//	}
	//�������׳��κ��쳣
//	public void dosome(){
//		
//	}
	
	//������׳������쳣
//	public void dosome()
//			throws IOException{
//		
//	}
	
	//�����׳����෽���׳��쳣���������쳣
//	public void dosome()
//			throws FileNotFoundException {
//		
//	}
	
	/*
	 * �������׳������쳣,��:
	 * ���෽��û�е��쳣,Ҳ�����ڼ̳й�ϵ���쳣
	 */
//	public void dosome()
//			throws SQLException{
//		
//	}
	/*
	 * �������׳����෽���׳��쳣�ĸ������쳣
	 */
//	public void dosome()
//			throws Exception{
//		
//	}
} 




