package string;
/**
 * String是不变对象,即:
 * 字符串对象创建后,表示的字符内容不可变,若
 * 改变必定创建新对象.
 * @author ta
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		/*
		 * java对于字符串有一个优化,即:
		 * 字符串常量池,这是在堆内存中开辟的
		 * 一块空间,用于保存所有使用字面量形式
		 * 创建的字符串对象,当再次使用该字面量
		 * 创建新的字符串时会直接重用而不会再
		 * 创建新的来节省内存开销.
		 */
		String s1 = "123abc";
		//s2会重用s1创建的字符串对象
		String s2 = "123abc";
		String s3 = "123abc";
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//true
		
		//修改内容会创建新对象
		s1 = s1 + "!";//s1不再指向原对象
		System.out.println("s1:"+s1);//123abc!
		System.out.println("s2:"+s2);//123abc
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//true
		
		/*
		 * new关键字很强制,一定会创建新对象
		 */
		String s4 = new String("123abc");
		System.out.println("s4:"+s4);
		/*
		 * s2与s4是两个不同的字符串对象,虽然
		 * 内容都是"123abc",但是两个变量保存
		 * 的地址不同.
		 */
		System.out.println(s4==s2);//false
		/*
		 * 通常我们比较字符串都是比较字符串的
		 * 内容,因此比较字符串时我们不会使用
		 * "==",而是使用字符串的方法equals.
		 * equals方法是用来比较两个字符串对象
		 * 所表示的内容是否相同的.
		 */
		boolean tf = s2.equals(s4);
		System.out.println(tf);//true
		/*
		 * 这里用到了编译器的一个特性:
		 * 编译器在编译源代码时,当遇到一个计算
		 * 表达式可以在编译期间确定结果时就会
		 * 直接进行计算,并将结果编译到class文件
		 * 中,这样JVM每次运行程序时就无需再计算.
		 * 比如: int a = 1+1;
		 * 编译器编译后class改为:int a = 2;
		 * 下面的字符串也是如此,会被改为:
		 * String s5 = "123abc";
		 */
		String s5 = "123"+"abc";
		System.out.println("s5:"+s5);
		System.out.println(s2==s5);//true
		
		String s = "123";
		String s6 = s + "abc";
		System.out.println("s6:"+s6);
		System.out.println(s2==s6);//false
	}
}








