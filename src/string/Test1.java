package string;
/**
 * 实现方法,完成截取给定地址中的域名
 * @author ta
 *
 */
public class Test1 {
	public static void main(String[] args) {
		String name1 
			= getHostName("www.tedu.cn");
		String name2 
			= getHostName("http://www.google.cn");
		String name3
			= getHostName("doc.tedu.com.cn");
		System.out.println(name1);//tedu
		System.out.println(name2);//google
		System.out.println(name3);//tedu
	}
	
	public static String getHostName(String line) {
		//第一个"."之后第一个字符的位置
		int start = line.indexOf(".")+1;
		//第二个"."的位置
		int end = line.indexOf(".",start);
		return line.substring(start,end);
	}
}


