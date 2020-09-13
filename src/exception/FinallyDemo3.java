package exception;
/**
 * 面试中finally常见问题
 * 
 * 请分别说明final,finally,finalize
 * 
 * finalize是Object定义的方法,该方法是当GC
 * 释放该对象资源时调用此方法,调用后该对象即
 * 被释放.
 * 注意,此方法若重写,里面不应当有耗时的操作.
 * 
 * @author ta
 *
 */
public class FinallyDemo3 {
	public static void main(String[] args) {
		System.out.println(
			test("0")+","+test(null)+","+test("")	
		);//?,?,?
	}
	
	public static int test(String str) {
		try {
			return str.charAt(0)-'0';
		} catch(NullPointerException e) {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}



