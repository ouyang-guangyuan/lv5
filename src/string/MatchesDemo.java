package string;
/**
 * String支持正则表达式的方法之一:
 * boolean matches(String regex)
 * 使用给定的正则表达式匹配当前字符串是否符合
 * 格式要求,符合则返回true.
 * 
 * 注意:给定的正则表达式就算不指定边界匹配符
 * 即:(^...$)也是做完全匹配验证的.
 * @author ta
 *
 */
public class MatchesDemo {
	public static void main(String[] args) {
		String email = "fancq@tedu.cn";
		/*
		 * [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
		 * 
		 */
		String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
		boolean match = email.matches(regex);
		if(match) {
			System.out.println("是邮箱");
		}else {
			System.out.println("不是邮箱");
		}
	}
}








