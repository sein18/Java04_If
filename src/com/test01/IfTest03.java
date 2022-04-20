package com.test01;

import java.util.Scanner;

public class IfTest03 {
	//else if ������ ���� ������ �� �� �ִ�.
	
	public void test() {
		int i = 10;
		int j = 20;
		
		if(i > j) {
			System.out.println(i + " ��" + j + " ���� Ů�ϴ�.");
		}
		else if(i==j) {
			System.out.println(i + " ��" + j + " �� �����ϴ�.");	
		}
		else {
			System.out.println(i + " ��" + j + " ���� �۽��ϴ�.");
			
		}	
	}
	
	public void test2() {
		//������ �ϳ� �Է¹޾� ����� ������ ������ ����� ����Ͻÿ�
		//�����, 90�� �̻��� A ���
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C���
		//70�� �̸� 60�� �̻��� D���
		//60�� �̸��� F������γ�����.
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �ϳ� �Է��ϼ���: ");
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
		
		System.out.printf("����� ������ %d �̰�, ����� %s�Դϴ�.\n", num, grade);
	
		/*
		 * %d : ����
		 * %f : �Ǽ�
		 * %s : ���ڿ�
		 * %c : ���� 
		 * %b : ��
		 */
	}
	public void test3() {
		//���� ������ �� ��޺� �߰� ���� �̻��� ��쿡��
		//��޿� "+"��� ���ڸ� �߰��Ͽ� ���
		//��)95�� �̻��̸� ����� A+�� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
		
		System.out.printf("����� ������ %d �̰�, ����� %s�Դϴ�.\n", num, grade);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
