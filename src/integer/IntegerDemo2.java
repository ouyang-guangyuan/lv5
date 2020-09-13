package integer;
/**
 * 数字类型的包装类有两个常量:
 * MAX_VALUE,MIN_VALUE分别记录了其对应的基本
 * 类型的取值范围
 * @author ta
 *
 */
public class IntegerDemo2 {
	public static void main(String[] args) {
		int imax = Integer.MAX_VALUE;
		System.out.println(imax);
		int imin = Integer.MIN_VALUE;
		System.out.println(imin);
		
		long lmax = Long.MAX_VALUE;
		System.out.println(lmax);
		long lmin = Long.MIN_VALUE;
		System.out.println(lmin);
		
		/*
		 * 包装类提供了一个功能,静态方法:parseXXX
		 * 该方法可以将字符串解析为对应的基本类型
		 * 数据,前提是该字符串能正确描述要转换的
		 * 基本类型可以保存的值.
		 */
		String str = "123";
		int a = Integer.parseInt(str);
		double dou = Double.parseDouble(str);
		System.out.println(a);//123
		System.out.println(dou);//123.123
	}
}




