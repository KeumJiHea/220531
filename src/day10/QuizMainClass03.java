package day10;

import java.util.TreeSet;

public class QuizMainClass03 {
	public static void main(String[] args) {

//		ArrayList arr = new ArrayList();
//		
//		for(int i=0;;i++) {
//			int ran = (int)(Math.random()*45)+1; //1~45����
//			
//			if(arr.contains(ran)==false) {//���࿡ ����Ʈ�� �ߺ����� ������
//				arr.add(ran); //����Ʈ�� ���� �߰�
//			}
//			if(arr.size()==6) //���� ����Ʈ �׸��� 6���� �Ǹ�
//				break; //����
//		}
//		arr.sort(null);
//		System.out.println(arr); //���� ���
		
		
		
		TreeSet set = new TreeSet();
		
		while(true) {
			int ran = (int)(Math.random()*45)+1;
			set.add(ran);
			
			if(set.size()==6)
				break;
		}

		System.out.println(set);
		
		
		
		
		
		
		
		
	}
}
