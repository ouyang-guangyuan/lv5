package integer;
/**
 * JDK5之后推出了一个新的特性:自动拆装箱
 * 该特性是编译器认可的,而不是虚拟机.
 * 编译器在看到有基本类型与包装类之间互相赋值
 * 时会添加转换代码将他们转换.
 * @author ta
 *
 */
public class IntegerDemo3 {
	public static void main(String[] args) {
		/*
		 * 这里触发了编译器的自动拆箱特性
		 * 代码会被编译器改为:
		 * int i = new Integer(1).intValue();
		 */
		int i = new Integer(1);
		/*
		 * 触发自动装箱特性,代码会被改为:
		 * Integer in = Integer.valueOf(i);
		 */
		Integer in = i;
	}
	
}
