package io;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * java io  标准的输入与输出
 * 使用java IO我们可以对外界设备已相同的方式进行
 * 读写完成数据交换. 
 * java IO将"读"与"写"按照方向进行了划分:
 * 输入:从外界到程序的方向,用于让程序获取外界数据
 *      因此输入是"读"数据的操作
 * 输出:从程序到外界的方向,用于将数据"写"出的操作. 
 * java IO以"流"的形式表示读写功能
 * java.io.InputStream 输入流,通过输入流我们可以
 * 连接上外界设备从而读取该设备数据
 * java.io.OutputStream 输出流
 * 以上两个流是所有字节输入流与输出流的超类,规定了
 * 所有输入流与输出流的基本读写功能.
 * java将流分为两大类:节点流与处理流
 * 节点流:又称为"低级流",是真实连接程序与数据源的
 * "管道",用于实际搬运数据的流. 读写一定是建立在
 * 节点流的基础上进行的.
 * 处理流:又称为"高级流",高级流不能独立存在,必须
 * 连接在其他流上,目的是当数据流经当前流时对其做
 * 某些加工处理,简化我们读写数据时的相应操作.
 * 实际使用IO时,我们通常会串联若干的高级流最终连接
 * 到低级流上,使得读写数据以流水线式的加工处理完成,
 * 这个操作称为"流的连接",也是IO的精髓所在            
 * 文件流
 * 文件流是一对低级流,作用是连接到文件上,用于读写
 * 文件数据.
 * java.io.FileOutputStream:文件输出流
 * java.io.FileInputStream:文件输入流    
 * @author ta
 */
public class FOSDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 文件流提供的构造方法:
		 * FileOutputStream(File file)
		 * FileOutputStream(String path)
		 * 以上两种创建方式,默认为覆盖写模式,即:
		 * 若指定的文件已经存在,那么会将该文件原有
		 * 数据全部删除.然后再将新数据写入文件.		  
		 * FileOutputStream(File file,boolean append)
		 * FileOutputStream(String path,boolean append)
		 * 以上两种构造器允许再传入一个boolean值类型的
		 * 参数,如果该值为true时,文件输出流就是追加写模式
		 * 即:数据中原有数据都保留,新内容会被追加到文件末		  
		 * 文件流与RAF的区别:
		 * RAF是基于指针的随机读写形式,可以对文件任意
		 * 位置进行读或写操作,可以做到对文件部分数据
		 * 覆盖等操作.读写更灵活.
		 * 文件流是基于java IO的标准读写,而IO是顺序
		 * 读写模式,即:只能向后写或读数据,不能回退.* 
		 * 单从读写灵活度来讲RAF是优于文件流的,但是
		 * 文件流可以基于java IO的流连接完成一个复杂
		 * 数据的读写,这是RAF不容易做到的.
		 */
		FileOutputStream fos
			= new FileOutputStream("./fos.txt",true);		
//		String line = "回首,掏~";
//		fos.write(line.getBytes("UTF-8"));
//		
//		fos.write("鬼刀一开看不见~走位~走位~".getBytes("UTF-8"));
		
		fos.write("手".getBytes("UTF-8"))	;	
		System.out.println("写出完毕!");
		fos.close();
	}
}











