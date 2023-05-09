package chater041;

import java.util.Scanner;

public class four {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("성적입력>");
		

		if(sc.nextByte()>90) {
			System.out.println("A");
			}
		}
		
	
		
		//0~100
		//90이상은 A
		//80이상은 B
		//70이상은 C
		//그 이하는 D
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println((int) (Math.random()*10)+1);
		
//주사위 번호 뽑기
		//0<= x<1
		//0*6<=x*6<1*6
		//(int)0<=(int)x*6<(int) 6 다 정수임
		//(int)0+1 <= (int)x*6 <(int)6 +1  1~7사이의 정수;1,2,3,4,5,6
		
		int number=(int)(Math.random()*6)+1;
		
		if(number==1) {
				System.out.println("주사위 눈 1");
		}else if(number==2) {
				System.out.println("주사위 눈 2");
		}else if(number==3) {
				System.out.println("주사위 눈 3");
		}else if(number==4) {
				System.out.println("주사위 눈 4");
		}else if(number==5) {
				System.out.println("주사위 눈 5");
		}else {
				System.out.println("주사위 눈 만점");
		}//??
		
		//중첩 if문
		//하나의 데이터를 여러번 조건을 확인할 때
//		if(조건식) {
//			if(조건식) {
//				if(조건식) {
//			}
//		}
		
		int no=10;
		if(no%2==0) {
			if(no%5==0) {
				if(no%10==0) {
					System.out.println("2의 배수, 5의 배수, 10의 배수");
				}
			}
		}
		
		

		Scanner sc= new Scanner(System.in);
		System.out.println("점수 입력>");
		
		score= Integer.parseInt(sc.nextLine());
		
		String grade="";
		
		if(score >=90) {
			if(score>=95) {
				grade="A+";
			}else {
				grade="A";
			}
		}
		
	
		
		int score = 93;
		// if문 1개
		if (score >= 90) {
			System.out.println("점수가 90이상이고 등급A");
		}

		// if문은 한 줄만 시행한다.
		if (score > 90)
			System.out.println("점수가 90이상이고 등급A");
		System.out.println("스코어90");//독자적인 코드임. 종속 안되어있음

		if (score > 90) {
			System.out.println("점수가 90이상이고 등급A");
			System.out.println("스코어90");
			
		//if-else
			//int score = 80;
			if(score>=90) {
				System.out.println("점수가 90 이상입니다.");
			}else {
				System.out.println("점수가 90 미만입니다.");
				
				
				
			if (score>=90) {//90~
				System.out.println("등급 A");
			}
			else if (score>=80) {//80~89
				System.out.println("등급 B");
			}
			else if (score>=70) {//70~79
				System.out.println("등급 C");
			}
			else{//~69
				System.out.println("등급 D");
			}
			
			
			if (score<70) {//~70
				System.out.println("등급 D");
			}
			else if (score<80) {//70~80
				System.out.println("등급 C");
			}
			else if (score<90) {//80~90
				System.out.println("등급 B");
			}
			else{//90~
				System.out.println("등급 A");
			}
			
			
			//random()값 추출
			//Random() / 오른쪽게 더 쓰기 쉬움 Math.random()
			//Math.random()-> 실수로 나옴
			//0<= Math.random() < 1: 0~0.9xxxx, double-> int 소수점  삭제. 정수만 나옴
			//double -> int 소수점 삭제
			
			//*10해주면 ~10 이하 랜덤
			
	
			
			System.out.println( Math.random());
			
			//스캐너
			
			
			
			
						
					
				}
			}
		}
	}
