package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if 구문은 다중 조건을 줄 수 있다.
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " 은" + j + " 보다 큽니다.");
		}
		else if(i==j) {
			System.out.println(i + " 은" + j + " 와 같습니다.");	
		}
		else {
			System.out.println(i + " 은" + j + " 보다 작습니다.");
			
		}	
	}
	
	public void test2() {
		//점수를 하나 입력받아 등급을 나누어 점수와 등급을 출력하시오
		//등급은, 90점 이상은 A 등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C등급
		//70점 미만 60점 이상은 D등급
		//60점 미만은 F등급으로나눈다.
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		String grade = "";
		
		if(num >= 90) {
			grade="A";
		}else if(num < 90 && num >= 80) {
			grade="B";
		}else if(num < 80 && num >= 70) {
			grade="C";
		}else if(num < 70 && num >= 60) {
			grade="D";
		}else{
			grade="F";
		}
		
		System.out.printf("당신의 점수는 %d 이고, 등급은 %s입니다.\n", num, grade);
	
		/*
		 * %d : 정수
		 * %f : 실수
		 * %s : 문자열
		 * %c : 문자 
		 * %b : 논리
		 */
	}
	public void test3() {
		//위의 문제에 각 등급별 중간 점수 이상인 경우에는
		//등급에 "+"라는 문자를 추가하여 출력
		//예)95점 이상이면 등급이 A+로 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력: ");
		int num = sc.nextInt();
		
		String grade = "";
		
		if(num >= 90) {
			grade="A";
			if(num>=95)
				grade="A+";
			else
				grade="A-";
		}else if(num >= 80) {
			grade="B";
			if(num>=85)
				grade="B+";
			else
				grade="B-";
		}else if(num >= 70) {
			grade="C";
			if(num>=75)
				grade="C+";
			else
				grade="C-";
		}else if(num >= 60) {
			grade="D";
			if(num>=65)
				grade="D+";
			else
				grade="D-";
		}else{
			grade="F";
		}
		
		System.out.printf("당신의 점수는 %d 이고, 등급은 %s입니다.\n", num, grade);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
