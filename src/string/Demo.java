package string;
/**
 * 字符串拼接带来的性能问题
 * @author ta
 *
 */
public class Demo {
	public static void main(String[] args) {
		String str = "a";
		for(int i=0;i<10000000;i++) {
			str = str + str;
		}
		System.out.println("执行完毕!");
	}
}






