package string;
/**
 * 字符串提供了若干的重载的valueOf方法,它们
 * 都是静态方法.
 * static String valueOf(XXX xxx)
 * 作用是将给定的内容转换为字符串
 * 
 * @author ta
 *
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		int a = 123;
		//将int值转换为String
		String str = String.valueOf(a);	
		System.out.println(str);
		
		double dou = 123.123;
		String str2 = String.valueOf(dou);
		System.out.println(str2);
		
		//任何类型与字符串连接结果都是字符串
		str = a+"";
		System.out.println(str);
	}
}






