package com.yedam.io;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Name입력하세요");
		String name = scn.nextLine();
		System.out.println("숫자 입력하세요");
		int age = scn.nextInt();
		System.out.println("키를 입력하세요");
		double height = scn.nextDouble();
		
		System.out.println(name+" ,"+age+", "+height);

	}

}
