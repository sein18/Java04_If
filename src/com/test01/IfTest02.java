package com.test01;

import java.util.Scanner;

public class IfTest02 {
	//if~else
	//�� �� �ϳ��� �����ϴ� ���ǹ�
	public void test() {
		int i = 20;
		
		if(i<10) {
			System.out.println(i + " �� 10���� �۽��ϴ�.");
		}else {
			System.out.println(i + " �� 10���� ũ�ų� �����ϴ�.");	
		}
		
	}
	//���ڸ� �ϳ� �Է¹޾� Ȧ�� ¦������ ���
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է� �Ͻ� ���ڴ� ¦���Դϴ�.");	
		}else {
			System.out.println("�Է� �Ͻ� ���ڴ� Ȧ���Դϴ�.");		
		}
		System.out.println("���α׷� ����");		
		sc.close();
	}
	
	public void test3() {
		//50���� ũ�ų� ���� ����� ¦������, Ȧ������ ���
		//50���� ��������� �۴� ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num >=50) {	
			if(num%2 == 0) {
				System.out.println(" 50���� ū ¦�� ");
			}
			else {
				System.out.println(" 50���� ū Ȧ�� ");
			}
		} 
		else {
			System.out.println("50���� �۴�.");		
		}
		sc.close();
	}
	
	public void test4() {
		//���� �ϳ� �Է� �޾� ������� �������� ���. ��, 0�̸� "0�Դϴ�."��� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		if(num != 0) {	
			if(num > 0) {
				System.out.println("  ��� ");
			}
			else {
				System.out.println(" ���� ");
			}
		} 
		else {
			System.out.println("0�Դϴ�.");		
		}
		sc.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
