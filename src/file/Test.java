package file;

import java.io.File;
/**
 * 编写一段代码,完成1+2+3+4+...100,并输出
 * 结果.
 * 这段代码中不得出现for,while关键字
 * 
 * 
 * 买汽水,1块钱1瓶汽水,3个瓶盖可以换1瓶汽水,
 * 2个空瓶可以换一瓶,问:20块钱可以得到多少瓶?
 * 
 * 
 * @author ta
 *
 */
public class Test {
	public static void main(String[] args) {
		File dir = new File("./a");
		delete(dir);
	}
	/*
	 * 删除时首先判断file表示的是否为目录
	 * 若是文件则直接删除,若是目录则应当前
	 * 获取该目录所有子项并逐个删除后再删除
	 * 该目录.
	 */
	public static void delete(File file) {
		if(file.isDirectory()) {
			//先将该目录清空
			//1获取该目录中的所有子项
			File[] subs = file.listFiles();
			//2逐个删除子项
			for(int i=0;i<subs.length;i++) {
				File sub = subs[i];
				/*
				 * 递归调用:一个方法内部调用
				 * 自己方法的现象.
				 */
				delete(sub);
			}			
		}
		file.delete();
		
	}
}




