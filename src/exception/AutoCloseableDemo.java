package exception;

import java.io.FileOutputStream;

/**
 * JDK7之后推出了一个特性:AutoCloseable
 * 该特性旨在让我们在源代码中可以以更简化的
 * 代码完成在finally中关闭流.
 * @author ta
 *
 */
public class AutoCloseableDemo {
	public static void main(String[] args) {
		try(
			/*
			 * 在这里定义的流最终会被编译器该为
			 * 在finally中关闭.
			 * 只有实现了AutoCloseable接口的类才
			 * 能在这里定义并实例化.
			 * 流和RandomAccessFile都实现了该接口
			 */
			FileOutputStream fos 
				= new FileOutputStream("fos.dat");
		){
			fos.write(1);
		}catch(Exception e) {
			System.out.println("出错了!");
		}
	}
}





