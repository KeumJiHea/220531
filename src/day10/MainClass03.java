package day10;

import java.util.Scanner;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t01 = new TestClass03();
		
		
		
		
		String s = t01.test();
		System.out.println("return: " + s);
		
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.println("수 입력");
		num1 = input.nextInt();
		System.out.println("수 입력");
		num2 = input.nextInt();
		
		int ss = t01.sumFunc(num1, num2);
		System.out.println("두 수의 합: " + ss);

	}
}
