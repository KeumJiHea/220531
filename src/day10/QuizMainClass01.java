package day10;

import java.util.Scanner;

public class QuizMainClass01 {
	/*
	 * 이름을 입력받아 출력하는 프로그램을 만ㄷ세요
	 * 입력기능, 출력기능, 메인
	 */
	public static void main(String[] args) {
		QuizFunClass01 quiz = new QuizFunClass01();
//		
//		System.out.println("이름을 입력하세요");
//		String name = quiz.input();
//		
//		quiz.print(name);

		String[] nameArr = quiz.input02();
		quiz.print02(nameArr);
		
	}

}
