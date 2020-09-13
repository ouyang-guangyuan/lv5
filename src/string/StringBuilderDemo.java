package string;
/**
 * String的优化措施仅照顾重用性,因此频繁修改
 * 字符串会带来内存开销大,运行效率差的结果.
 * 对此,java提供了一个专门用于修改字符串的API
 * java.lang.StringBuilder
 * 其内部维护一个可变的char数组,所有的修改都是
 * 在这个数组中进行的,因此开销小,性能好.
 * 并且其提供了便于修改字符串的一系列方法,包
 * 括了:增,删,改,插等基本操作.
 * @author ta
 *
 */
public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "好好学习java";
		
		StringBuilder builder 
			= new StringBuilder(str);
		/*
		 * 好好学习java
		 * 好好学习java,为了找个好工作! 		
		 */
		builder.append(",为了找个好工作!");
		System.out.println(str);
		//获取StringBuilder内部的字符串
		str = builder.toString();
		System.out.println(str);
		/*
		 * 好好学习java,为了找个好工作! 	
		 * 好好学习java,就是为了改变世界!
		 */
		builder.replace(9, 16, "就是为了改变世界");
		System.out.println(builder);
		
		/*
		 * 好好学习java,就是为了改变世界!
		 * ,就是为了改变世界!
		 */
		builder.delete(0, 8);
		System.out.println(builder);
		
		/*
		 * ,就是为了改变世界!
		 * 活着,就是为了改变世界!
		 */
		builder.insert(0, "活着");
		System.out.println(builder);
	}
}





