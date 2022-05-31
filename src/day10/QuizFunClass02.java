package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizFunClass02 {

//	public ArrayList input() {
//		
//		ArrayList numArr = new ArrayList();
//		Scanner input = new Scanner(System.in);
//		
//		System.out.print("수 입력: ");
//		int num = input.nextInt();
//		numArr.add(num);
//		
//		System.out.print("수 입력: ");
//		num = input.nextInt();
//		numArr.add(num);
//
//		return numArr;
//	}
//	
//	public int sum(ArrayList numArr) {
//		int sum=0;
//
//		sum+=(int)numArr.get(0)+(int)numArr.get(1);
//
//		return sum;
//	}
//	
//	public void print(int a, int b, int sum) {
//		System.out.print(a + "+" + b + "=" + sum);
//	}
	
	public ArrayList input() {
		Scanner input = new Scanner(System.in);
		ArrayList arr = new ArrayList();
		
		int value;
		System.out.println("수 입력");
		value = input.nextInt();
		arr.add(value);
		
		System.out.println("수 입력");
		arr.add(input.nextInt());
		
		return arr;
	}
	
	
	public int op(ArrayList arr) {
		int sum = (int)arr.get(0) + (int)arr.get(1);
		return sum;
	}
	
	public void print(ArrayList arr, int s) {
		System.out.println(arr.get(0) + "+" + arr.get(1) + "=" + s);
	}

}
