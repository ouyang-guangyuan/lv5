package exception;
/**
 * 使用当前类测试异常的抛出
 * @author ta
 *
 */
public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws IllegalAgeException{
		if(age<0||age>100) {
			/*
			 * 当一个方法中使用throw抛出一个异常
			 * 时就要在当前方法上使用throws声明
			 * 该异常的抛出告知调用者去解决该异常
			 * 注:
			 * 只有抛出RuntimeException及其子类型
			 * 异常时可以不这样做
			 */
			throw new IllegalAgeException("年龄不合法");
		}
		this.age = age;
	}
	
	
}
