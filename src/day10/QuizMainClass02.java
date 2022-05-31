package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMainClass02 {
	public static void main(String[] args) {
		
		QuizFunClass02 quiz = new QuizFunClass02();
//		
//		ArrayList numArr = quiz.input();
//		int sum = quiz.sum(numArr);
//		quiz.print((int)numArr.get(0), (int)numArr.get(1), sum);
		
		ArrayList arr = quiz.input();
		int sum = quiz.op(arr);
		
		quiz.print(arr, sum);
		
	}
}
