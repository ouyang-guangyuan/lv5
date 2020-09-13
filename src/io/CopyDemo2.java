package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲流
 * java.io.BufferedOutputStream
 * java.io.BufferedInputStream
 * 缓冲流是一对高级流,在流连接中的作用是提高读写效率
 * 使得我们在进行读写操作时用单字节读写也能提高读写的
 * 效率.
 * 缓冲流之所以可以提高读写效率,是因为缓冲流内部有
 * 一个缓冲区(一个字节数组),无论我们使用缓冲流进行
 * 何种读写(单字节或块读写)最终都会被缓冲流转换为
 * 块读写来提高效率
 */
public class CopyDemo2 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis 
			= new FileInputStream("music.mp3");
		BufferedInputStream bis
			= new BufferedInputStream(fis);		
		FileOutputStream fos
			= new FileOutputStream("music_cp2.mp3");
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		int d = -1;
		while((d = bis.read())!=-1) {
			bos.write(d);
		}		
		System.out.println("复制完毕!");
		bis.close();
		bos.close();
	}
}










