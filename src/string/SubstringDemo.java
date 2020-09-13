package string;
/**
 * String substring(int start,int end)
 * 截取当前字符串中指定范围内的字符串.
 * 
 * 注:java API中,通常使用两个数字表示范围时,
 * 都是含头不含尾的.
 * @author ta
 *
 */
public class SubstringDemo {
	public static void main(String[] args) {
		//             01234567890
		String line = "www.tedu.cn";
		
		String sub = line.substring(4,8);
		System.out.println(sub);
		
		//从指定位置开始截取到字符串末尾
		sub = line.substring(4);
		System.out.println(sub);
	}
}







