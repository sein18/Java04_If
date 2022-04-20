package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void TestIf() {
		//단독 if문
		//조건식의 결과가 참이면 { }안에 코드 실행
		//      결과가 거짓이먄{ }안에 코드 무시 넘어감
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요: ");
		int num = sc.nextInt();
		
		//짝수인지 조건 확인
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");	
		}
		else {
			System.out.println("입력하신 숫자는 홀수입니다.");		
		}
		System.out.println("프로그램 종료");		
		
		 sc.close(); 
	}
}
