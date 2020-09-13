package doc;
/**
 * 文档注释
 * 文档注释只在三个地方使用:类,方法,常量
 * 
 * 文档注释是功能级注释,在类上使用是用来说明
 * 这个类的设计意图和功能介绍
 * 
 * @author ta
 * @version 1.11  版本号
 * @see java.lang.String   参考
 * @since JDK1.5 始于那个java版本
 *
 */
public class ApiDocDemo {
	/**
	 * sayHello方法中的问候语
	 */
	public static final String INFO = "你好!";
	
	/**
	 * 对给定的用户添加问候语
	 * @param name 给定的用户名
	 * @return	含有问候语的字符串
	 */
	public String sayHello(String name) {
		return "你好!"+name;
	}
}





