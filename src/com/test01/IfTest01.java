package com.test01;

import java.util.Scanner;

public class IfTest01 {
	public void TestIf() {
		//�ܵ� if��
		//���ǽ��� ����� ���̸� { }�ȿ� �ڵ� ����
		//      ����� �����̐�{ }�ȿ� �ڵ� ���� �Ѿ
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		//¦������ ���� Ȯ��
		if(num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");	
		}
		else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");		
		}
		System.out.println("���α׷� ����");		
		
		 sc.close(); 
	}
}
