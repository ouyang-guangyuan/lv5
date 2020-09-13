package string;
/**
 * 和谐用语
 * @author ta
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|dsb|cnm|nc|nmbwcnm|mdzz|djb)";
		String message = "nmbwcnm!你是nc么?你个dsb,你就是一个djb!";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}






