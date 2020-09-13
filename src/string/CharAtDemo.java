package string;
/**
 * char charAt(int index)
 * 获取当前字符串中指定位置对应的字符
 * @author ta
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		char c = str.charAt(9);
		System.out.println(c);
		
		//判断回文          0 1 2 3 4 5 6 7 8
		String line = "上海自来水来自海上";
		for(int i=0;i<line.length()/2;i++) {
			char c1 = line.charAt(i);
			char c2 = line.charAt(line.length()-1-i);
			if(c1!=c2) {
				System.out.println("不是回文!");
				/*
				 * 当方法返回值类型为void时,return是
				 * 可以单独使用的,目的是结束方法
				 */
				return;
			}
		}
		System.out.println("是回文!");

	}
}



