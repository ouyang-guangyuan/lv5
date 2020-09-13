package object;

import java.util.Arrays;

/**
 * 测试Object相关方法
 * @author ta
 *
 */
public class Demo {
	public static void main(String[] args) {
		Point p = new Point(1,2);
		/*
		 * Object两个常被重写的方法
		 * 1:
		 * String toString()
		 * 该方法的设计意义是将一个对象转换
		 * 为一个字符串.
		 * Object本身实现的toString方法返回
		 * 的是该对象的"句柄",即该对象的引用
		 * 信息(地址).
		 * 格式为:类名@地址
		 */
		String str = p.toString();
		System.out.println(str);
		/*
		 * System.out.println(Object obj)
		 * 该方法就是将给定对象的toString方法返回
		 * 的字符串输出到控制台
		 */
		System.out.println(p);
		
		
//		Point[] arr = {new Point(2,3),new Point(1,7),new Point(5,6),new Point(9,8)};
//		System.out.println(Arrays.toString(arr));
		
		
		/*
		 * 2:
		 * boolean equals(Object obj)
		 * 该方法用于比较当前对象(this)与
		 * 参数对象obj的内容比较,当两个对象
		 * 内容相同是equals方法返回值应当为true
		 */
		Point p1 = new Point(1,2);
		
		System.out.println(p==p1);//false
		/*
		 * equals方法在不重写的情况下,Object定义
		 * 的是使用"=="比较的,那么就没有意义了
		 */
		System.out.println(p.equals(p1));//true
	}
}






