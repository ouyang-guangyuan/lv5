package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读写基本类型数据以及RAF基于指针的操作
 * @author ta
 *
 */
public class RafDemo3 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf
			= new RandomAccessFile("raf.dat","rw");
		/*
		 * 获取RAF指针位置,创建后从0开始(文件第
		 * 一个字节位置)
		 */
		long pos = raf.getFilePointer();
		System.out.println("pos:"+pos);
		
		
		/*
		 * 向文件中写入一个int最大值
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
		 * 将给定的int值对应的4字节一次性写出
		 * 等同上面四句操作
		 */
		raf.writeInt(imax);
		System.out.println("pos:"+raf.getFilePointer());
		raf.writeLong(123L);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.writeDouble(123.123);
		System.out.println("pos:"+raf.getFilePointer());
		System.out.println("写出完毕!");
		
		/*
		 * void seek(long pos)
		 * 移动指针到指定位置
		 */
		raf.seek(0);
		System.out.println("pos:"+raf.getFilePointer());
		/*
		 * int readInt()
		 * 连续读取4个字节并返回该int值,若连续读取
		 * 4个字节的过程中发现读取到了文件末尾,此时
		 * 会直接抛出异常EOFException
		 * EOF(end of file)文件末尾
		 */
		int d = raf.readInt();
		System.out.println(d);
		System.out.println("pos:"+raf.getFilePointer());
		
		//读取long值
		//1移动指针到long的所在位置
		raf.seek(8);
		//2读取long的8字节还原long值
		long lon = raf.readLong();
		System.out.println(lon);
		System.out.println("pos:"+raf.getFilePointer());
		
		
		double dou = raf.readDouble();
		System.out.println(dou);
		System.out.println("pos:"+raf.getFilePointer());
		
		/*
		 * 将第二个int值内容改为int最小值
		 */
		//1移动指针到第二个int值的开始位置
		raf.seek(4);
		//2重写写入新的int值来覆盖原内容
		raf.writeInt(Integer.MIN_VALUE);
		System.out.println("pos:"+raf.getFilePointer());
		
		raf.seek(4);
		d = raf.readInt();
		System.out.println(d);
		
		raf.close();
		
	}
}







