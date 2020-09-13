package string;
/**
 * String支持正则表达式方法三:
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为
 * 给定的内容
 * @author ta
 *
 */
public class ReplaceAllDemo {
	public static void main(String[] args) {
		String line = "abc123def456ghi789jkl";
		/*
		 * 将字符串中的数字部分替换为"#NUMBER#"
		 */
		line = line.replaceAll("[0-9]+", "#NUMBER#");
		System.out.println(line);
		
	}
}
