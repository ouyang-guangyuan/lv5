package string;
/**
 * int indexOf(String str)
 * 查找给定字符串在当前字符串中的位置,若当前
 * 字符串不包含给定内容则返回值为-1.
 * @author ta
 *
 */
public class IndexOfDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		int index = str.indexOf("in");
		System.out.println(index);//2
		
		/*
		 * 重载的方法允许我们从指定位置开始
		 * 查找第一次出现指定字符的位置
		 */
		index = str.indexOf("in", 3);
		System.out.println(index);//5
		
		//查找最后一次出现指定字符串的位置
		index = str.lastIndexOf("in");
		System.out.println(index);//9
		
		
	}
}






