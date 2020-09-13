package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * ��д�������������Լ�RAF����ָ��Ĳ���
 * @author ta
 *
 */
public class RafDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","rw");
		/*
		 * ��ȡRAFָ��λ��,�������0��ʼ(�ļ���
		 * һ���ֽ�λ��)
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		
		/*
		 * ���ļ���д��һ��int���ֵ
		 *                            vvvvvvvv
		 * 01111111 11111111 11111111 11111111
		 *  
		 * imax>>>24
		 * 00000000 00000000 00000000 01111111                          
		 */
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		
		raf.write(imax>>>24);
		System.out.println("pos:"+raf.getFilePointer());
		raf.write(imax>>>16);
		raf.write(imax>>>8);
		raf.write(imax);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * void writeInt(int d)
		 * ��������intֵ��Ӧ��4�ֽ�һ����д��
		 * ��ͬ�����ľ����
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("д�����!");
		
		/*
		 * void seek(long pos)
		 * �ƶ�ָ�뵽ָ��λ��
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * ������ȡ4���ֽڲ����ظ�intֵ,��������ȡ
		 * 4���ֽڵĹ����з��ֶ�ȡ�����ļ�ĩβ,��ʱ
		 * ��ֱ���׳��쳣EOFException
		 * EOF(end of file)�ļ�ĩβ
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//��ȡlongֵ
		//1�ƶ�ָ�뵽long������λ��
		raf.seek(8);
		//2��ȡlong��8�ֽڻ�ԭlongֵ
		long lon = raf.readLong();
		System.out.println(lon);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * ���ڶ���intֵ���ݸ�Ϊint��Сֵ
		 */
		//1�ƶ�ָ�뵽�ڶ���intֵ�Ŀ�ʼλ��
		raf.seek(4);
		//2��дд���µ�intֵ������ԭ����
		raf.writeInt(Integer.MIN_VALUE);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(4);
		d = raf.readInt();
		System.out.println(d);
		
		raf.close();
		
	}
}







