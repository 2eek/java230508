package com.yedam.loof;

public class forloop {

	public static void main(String[] args) {
	//중첩 for문
//		for() {
//			for() {
//				
//			}
//		}
		//2단~ 9단 출력
		for(int k =2; k<=9; k++) {
		for(int i=1; i<=9; i++ ) {
			System.out.println(k+"*"+i+"="+(k*i));
		}
	}

		
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

		//*****
		//****
		//***
		//**
		//*
		
		System.out.println();
		for(int i=5; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		
		}
		
		//while break;
		while(true) {
			int num=(int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {//6일 때 종료됨
				break;
			}
		}
		
		//중첩 for문 안에서의 break;
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=10; j++) {
				if(j==5) {
				System.out.println("i+j="+(i+j));
				break;// 작은 for문을 정지시키는 break
				}else {
					System.out.println(j); 
				}
			}
		}
		
		//for문 label break;
		
	Outter:for(char upper= 'A'; upper <='Z'; upper++) {
			for(char lower= 'a'; lower <='z'; lower++) {
				System.out.println(upper+ "-"+lower);
				if(lower=='g') {
					break Outter; //큰 for문을 종료시키는 break
				}
			}
		}
	//continue
	
	for(int i=0; i<=10; i++) {
		if(i%2==0) {
			continue;// 밑에꺼 수행하지 말고for문 수행해라
		}
		System.out.println(i);
	}
	}
		
	}
	
