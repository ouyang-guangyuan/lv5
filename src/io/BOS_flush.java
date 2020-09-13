package io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 缓冲输出流的缓冲区问题
 * @author ta
 */
public class BOS_flush {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("bos.txt");		
		BufferedOutputStream bos
			= new BufferedOutputStream(fos);		
		bos.write("摩擦摩擦~是魔鬼的步伐~".getBytes("UTF-8"));
		/*
		 * void flush()
		 * flush方法是OutputStream中定义的方法,
		 * 所有的输出流都具有该方法,但是只有缓冲
		 * 流的该方法有实际意义.其他的流具有该方法
		 * 的目的是在流连接中传递缓冲操作给缓冲流
		 * 
		 * flush的作用是将缓冲流中已经缓存的数据
		 * 一次性写出.
		 * 频繁的调用flush方法会提高写出的次数从而
		 * 降低写出效率,但是能保证数据写出的即时性.
		 */
//		bos.flush();		
		System.out.println("写出完毕!");		
		bos.close();
	}
}






