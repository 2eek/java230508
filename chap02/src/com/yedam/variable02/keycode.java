package com.yedam.variable02;

import java.io.IOException;
import java.util.Scanner;

public class keycode {
	
public static void main(String[] args) throws IOException {
	
	//KeyCode-> 하나의 문자만 받아올 때
	System.out.println("입력>");
	int keyCode=0;
	//오류가 날 수 있다고 미리 알려줌
	keyCode=System.in.read();
	System.out.println("keyCode:"+keyCode);
	
	keyCode=System.in.read();
	System.out.println("keyCode:"+keyCode);
	
	keyCode=System.in.read();
	System.out.println("keyCode:"+keyCode);
	
	//Scanner
	Scanner scanner = new Scanner(System.in);
	System.out.println("입력>");
	
	//1.문자열 읽기
	//NextLine()
	//enter키 치기 이전까지 데이터를 받아옴
	//enter키 기준으로 데이터를 읽어온다.
	String inputData = scanner.nextLine();
	
	//2.정수 읽기 
	int data= scanner.nextInt();
	//3.
	inputData = scanner.nextLine();//공백 데이터를 넣어버림
	//nextline만 쓰자.
	//엔터키 소멸
	scanner.nextLine();
	inputData= scanner.nextLine();
	//1,2 다 입력해야됨
	System.out.println("Scanner 활용=>"+inputData);
	
	//데이터 비교-> 입력한 값 == 저장된 값 비교
	
	//기본 타입 (정수, 실수 비교 ==)
	//문자열 비교-> equals
	if(inputData.equals("yedam")) {
		System.out.println("yedam과 일치합니다.");
	}
	
}
}
