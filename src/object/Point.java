package object;
/**
 * 使用当前类测试Object相关方法的重写
 * @author ta
 *
 */
public class Point {
	private int x;
	private int y;

	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 通常我们使用一个类的toString方法,就
	 * 应当重写这个方法(java API提供的类大部分
	 * 都已经重写了,无需我们重写).
	 * 返回的字符串没有严格的格式要求,但应当
	 * 包含这个对象的属性信息,便于通过返回的
	 * 字符串了解当前对象的属性信息.
	 */
	public String toString() {
		//(1,2)
		return "(" + x + "," + y + ")";
	}
	/**
	 * 当我们需要使用某个类的equals方法判断
	 * 内容是否相同时,就应当重写这个方法.
	 * 注:java API提供的类基本都重写过了.
	 */
//	public boolean equals(Object obj) {
//		if(obj == null) {
//			return false;
//		}
//		if(obj == this) {
//			return true;
//		}
//		if(obj instanceof Point) {
//			Point p = (Point)obj;
//			return this.x==p.x&&this.y==p.y;
//			
//		}
//		return false;
//	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	
}







