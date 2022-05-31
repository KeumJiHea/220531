package day10;
/*
 * 오버로딩
 * - 동일한 이름의 메소드를 만드는 것
 * - 메소드의 이름이 같은 경우 매개변수에 따라 구분
 * - 매개변수의 개수 또는 타입이 서로 다르면 다른 메소드로 인식
 */
public class MainClass04 {
	public static void main(String[] args) {
//		TestClass04 t = new TestClass04();
//		t.SumFunc(10, 20);
//		t.SumFunc(10, 20.65);
//		t.SumFunc(10);
		
		for(int i=0 ; i<5 ; i++) {
			double ran = (int)(Math.random()*3)+10; //-> 0~2 범위 // +10하면 10~12 범위
			System.out.println(ran);
		}
		

		
	}
}
