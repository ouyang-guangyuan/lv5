package string;
/**
 * char charAt(int index)
 * ��ȡ��ǰ�ַ�����ָ��λ�ö�Ӧ���ַ�
 * @author ta
 *
 */
public class CharAtDemo {
	public static void main(String[] args) {
		//            0123456789012345
		String str = "thinking in java";
		
		char c = str.charAt(9);
		System.out.println(c);
		
		//�жϻ���          0 1 2 3 4 5 6 7 8
		String line = "�Ϻ�����ˮ���Ժ���";
		for(int i=0;i<line.length()/2;i++) {
			char c1 = line.charAt(i);
			char c2 = line.charAt(line.length()-1-i);
			if(c1!=c2) {
				System.out.println("���ǻ���!");
				/*
				 * ����������ֵ����Ϊvoidʱ,return��
				 * ���Ե���ʹ�õ�,Ŀ���ǽ�������
				 */
				return;
			}
		}
		System.out.println("�ǻ���!");

	}
}



