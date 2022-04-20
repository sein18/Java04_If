package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if~else
	//둘 중 하나를 선택하는 조건문
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i + " 은 10보다 작습니다.");
		}else {
			System.out.println(i + " 은 10보다 크거나 같습니다.");	
		}
		
	}
	//숫자를 하나 입력받아 홀수 짝수인지 출력
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력 하신 숫자는 짝수입니다.");	
		}else {
			System.out.println("입력 하신 숫자는 홀수입니다.");		
		}
		System.out.println("프로그램 종료");		
		sc.close();
	}
	
	public void test3() {
		//50보다 크거나 같은 수라면 짝수인지, 홀수인지 출력
		//50보다 작은수라면 작다 라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num >=50) {	
			if(num%2 == 0) {
				System.out.println(" 50보다 큰 짝수 ");
			}
			else {
				System.out.println(" 50보다 큰 홀수 ");
			}
		} 
		else {
			System.out.println("50보다 작다.");		
		}
		sc.close();
	}
	
	public void test4() {
		//숫자 하나 입력 받아 양수인지 음수인지 출력. 단, 0이면 "0입니다."라고 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		if(num != 0) {	
			if(num > 0) {
				System.out.println("  양수 ");
			}
			else {
				System.out.println(" 음수 ");
			}
		} 
		else {
			System.out.println("0입니다.");		
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
