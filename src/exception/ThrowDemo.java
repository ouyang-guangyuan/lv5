package exception;
/**
 * 异常的抛出
 * throw关键字,用于主动抛出一个异常.
 * 通常以下情况我们会主动抛出异常:
 * 1:程序遇到一个满足语法要求,但是不满足业务
 *   逻辑要求时,我们可以主动抛出异常告知调用
 *   方不应当这样做.
 * 2:程序确实出现了异常,但是该异常不应当在当前
 *   代码片段被解决时可以对外抛出给调用方解决.  
 * @author ta
 *
 */
public class ThrowDemo {
	public static void main(String[] args) {
		
		Person p = new Person();
		/*
		 * 当调用一个含有throws声明异常抛出的
		 * 方法时,编译器要求必须处理该异常,否
		 * 则编译不通过.
		 * 处理异常的方式有两种:
		 * 1:使用try-catch捕获并处理该异常
		 * 2:在当前方法上继续使用throws声明异常的抛出
		 */
		try {
			p.setAge(10);//满足语法,但是不满足业务要求
		} catch (IllegalAgeException e) {
			System.out.println("出错了!");
		}
		System.out.println(p.getAge());
		
		
	}
}







