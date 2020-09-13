package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量,减少实际读写的次数
 * 可以提高读写效率.
 * 
 * 单字节读写是随机读写,效率差
 * 块读写是一组一组字节的读写,效率高
 * @author ta
 *
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile("movie.mp4","r");
		RandomAccessFile desc
			= new RandomAccessFile("movie_cp.mp4","rw");
	
		/*
		 * int read(byte[] data)
		 * 一次性从文件中读取给定数组总长度的
		 * 字节量,并将读取到的数据存入到该数组
		 * 中,返回值为实际读取到的字节量.
		 * 若返回值为-1,则表示文件末尾(本次没有
		 * 读取到任何数据)
		 * 
		 * 
		 * void write(byte[] data)
		 * 一次性将给定字节数组中所有字节写入文件
		 * 
		 * void write(byte[] data,int s,int len)
		 * 将给定字节数组从下标s处开始的连续len个
		 * 字节一次性写入文件
		 */
		//10K
		byte[] data = new byte[1024*10];
		int len = -1;//每次实际读取到的字节数
		
		long start = System.currentTimeMillis();
		while((len = src.read(data))!=-1) {
			desc.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		System.out.println("复制完毕!耗时"+(end-start)+"ms");
		src.close();
		desc.close();
	}
}






