package string;
/**
 * boolean startsWith(String str)
 * boolean endsWith(String str)
 * 判断字符串是否是以给定的字符串开始或结尾的
 * @author ta
 *
 */
public class StartsWithDemo {
	public static void main(String[] args) {
		String str = "thinking in java";
		
		boolean starts = str.startsWith("thi");
		System.out.println(starts);
		
		boolean ends = str.endsWith("ava");
		System.out.println(ends);
	}
}





