package day10;

import java.util.TreeSet;

public class QuizMainClass03 {
	public static void main(String[] args) {

//		ArrayList arr = new ArrayList();
//		
//		for(int i=0;;i++) {
//			int ran = (int)(Math.random()*45)+1; //1~45범위
//			
//			if(arr.contains(ran)==false) {//만약에 리스트에 중복값이 없으면
//				arr.add(ran); //리스트에 숫자 추가
//			}
//			if(arr.size()==6) //만약 리스트 항목이 6개가 되면
//				break; //멈춤
//		}
//		arr.sort(null);
//		System.out.println(arr); //숫자 출력
		
		
		
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
