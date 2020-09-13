package io;
import java.io.Serializable;
import java.util.Arrays;
/**
 * 使用当前类的实例测试对象流的对象读写操作
 * @author ta	
 */
public class Person implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private String gender;	
	private transient String[] otherInfo;
	public Person(String name, int age, String gender, String[] otherInfo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.otherInfo = otherInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getOtherInfo() {
		return otherInfo;
	}
	public void setOtherInfo(String[] otherInfo) {
		this.otherInfo = otherInfo;
	}
	
	public String toString() {
		return name+","+age+","+gender+","+
			   Arrays.toString(otherInfo);
	}
}








