package string;

import java.util.Arrays;

/**
 * String支持正则表达式方法二:
 * String[] split(String regex)
 * 将当前字符串中按照满足正则表达式的部分拆分
 * 然后将拆分后的字符串以数组形式返回.
 * @author ta
 *
 */
public class SplitDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		//按照数字部分拆分字符串
//		String[] data = line.split("[0-9]+");
		/*
		 * 如果拆分过程中连续匹配到两次可拆分的
		 * 内容时,中间会拆分出一个空字符串.
		 * 但是如果是在字符串末尾连续匹配上则所有
		 * 拆分出的空字符串会被忽略.
		 */
		String[] data = line.split("[0-9]");
		System.out.println(data.length);
		System.out.println(Arrays.toString(data));
	}
}







