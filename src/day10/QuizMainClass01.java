package day10;

import java.util.Scanner;

public class QuizMainClass01 {
	/*
	 * �̸��� �Է¹޾� ����ϴ� ���α׷��� ��������
	 * �Է±��, ��±��, ����
	 */
	public static void main(String[] args) {
		QuizFunClass01 quiz = new QuizFunClass01();
//		
//		System.out.println("�̸��� �Է��ϼ���");
//		String name = quiz.input();
//		
//		quiz.print(name);

		String[] nameArr = quiz.input02();
		quiz.print02(nameArr);
		
	}

}
