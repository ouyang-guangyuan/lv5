package integer;
/**
 * 包装类
 * 包装类是为了解决基本类型不能在直接参与面向
 * 对象开发的问题.
 * 8个基本类型对应8个不同的包装类,其中6个表示
 * 数字的包装类继承自java.lang.Number,其他两
 * 个继承自Object
 * @author ta
 *
 */
public class IntegerDemo1 {
	public static void main(String[] args) {
		int d = 128;
//		Integer i1 = new Integer(d);
//		Integer i2 = new Integer(d);
		/*
		 * java推荐我们使用包装类的静态方法:
		 * valueOf来将基本类型转换为包装类
		 */
		Integer i1 = Integer.valueOf(d);
		Integer i2 = Integer.valueOf(d);
		
		System.out.println(i1==i2);//false
		System.out.println(i1.equals(i2));//true
		
		
		//包装类转换为基本类型
		int i = i1.intValue();
		System.out.println(i);
		
		double dou = i1.doubleValue();
		System.out.println(dou);
		
		long lon = i1.longValue();
		System.out.println(lon);
		
		byte b = i1.byteValue();
		System.out.println(b);
	}
}






