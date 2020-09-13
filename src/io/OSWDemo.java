package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
/**
 * 字符流 
 * java.io.Reader和java.io.Writer
 * 上述两个类是所有字符流的超类,规定了所有字符流都
 * 必须具备的读写字符的相关方法.
 * java将流按照读写单位划分为字节流与字符流
 * 字符流以char为单位读写数据,但是底层本身还是读写
 * 字节,只是字符与字节的转换字符流自行完成.  
 * 转换流
 * java.io.InputStreamReader
 * java.io.OutputStreamWriter
 * 转换流是一对字符流,同时他们也是高级流,在实际开发
 * 时我们通常不会直接操作这两个流,但是在读写文本数据
 * 时,流连接中他们是非常重要的一环.负责衔接其他字符
 * 高级流与字节流. 
 * @author ta
 */
public class OSWDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos
			= new FileOutputStream("osw.txt");
		/*
		 * 转换流在创建时通常会传入第二个参数,这个
		 * 参数用来指定字符集,这样一来通过当前流写
		 * 出的文本数据都会按照该字符集转换为字节后
		 * 写出.
		 */
		OutputStreamWriter osw
			= new OutputStreamWriter(fos,"UTF-8");	
		osw.write("和我在成都的街头走一走~");
		osw.write("直到所有的灯都熄灭了也不停留.");		
		System.out.println("写出完毕!");
		osw.close();		
	}
}










