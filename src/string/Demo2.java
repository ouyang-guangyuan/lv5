package string;
/**
 * ��г����
 * @author ta
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		String regex = "(wqnmlgb|dsb|cnm|nc|nmbwcnm|mdzz|djb)";
		String message = "nmbwcnm!����ncô?���dsb,�����һ��djb!";
		message = message.replaceAll(regex, "***");
		System.out.println(message);
	}
}






