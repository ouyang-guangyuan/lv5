package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * �ַ��� 
 * java.io.Reader��java.io.Writer
 * �����������������ַ����ĳ���,�涨�������ַ�����
 * ����߱��Ķ�д�ַ�����ط���.
 * java�������ն�д��λ����Ϊ�ֽ������ַ���
 * �ַ�����charΪ��λ��д����,���ǵײ㱾���Ƕ�д
 * �ֽ�,ֻ���ַ����ֽڵ�ת���ַ����������.  
 * ת����
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * ת������һ���ַ���,ͬʱ����Ҳ�Ǹ߼���,��ʵ�ʿ���
 * ʱ����ͨ������ֱ�Ӳ�����������,�����ڶ�д�ı�����
 * ʱ,�������������Ƿǳ���Ҫ��һ��.�����ν������ַ�
 * �߼������ֽ���. 
 * @author ta
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * ת�����ڴ���ʱͨ���ᴫ��ڶ�������,���
		 * ��������ָ���ַ���,����һ��ͨ����ǰ��д
		 * �����ı����ݶ��ᰴ�ո��ַ���ת��Ϊ�ֽں�
		 * д��.
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");	
		osw.write("�����ڳɶ��Ľ�ͷ��һ��~");
		osw.write("ֱ�����еĵƶ�Ϩ����Ҳ��ͣ��.");		
		System.out.println("д�����!");
		osw.close();		
	}
}










