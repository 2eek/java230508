package com.yedam.loof;
import java.util.Scanner;

public class forloopp {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int randomNo= (int)(Math.random()*100)+1;
		
		for(int i=1; i<=5; i++) {
			System.out.println("번호를 입력하세요.");
			int var=Integer.parseInt(sc.nextLine());
			
			if(var== randomNo) {
				System.out.println("정답입니다"+i+"번만에 맞추셨습니다.");
				break;
			}else if(var > randomNo) {
				System.out.println("down");
			}else if(var<randomNo) {
				System.out.println("up");
				
			}
		}
		System.out.println("실패하셨습니다.");
	
	
		
		// for문
		// 1~100까지의 수를 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}

		// 누적합계
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			result = result + i;
		}
		System.out.println("1~100사이의 합" + result);

		// 1~100사이의 짝, 홀수 구하기.
		// 숫자 %2 ==0 -> 짝수
		// 위의 경우가 아니라면 홀수
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "는 짝수");
			} else if (!(i % 2 == 0)) {
				System.out.println(i + "는 홀수");
			}
		}

		// 입력한 숫자에 대한 구구단 출력
		//----Scanner sc = new Scanner(System.in);

//2 -> 2*1 = 2, 2*2=4, ... 2*9=18
//		System.out.println("구구단 입력>");
//		int gugu = Integer.parseInt(sc.nextLine());
////입력하는 값이 고정. 2단-> 2가 고정, 우측 값은 +1씩 증가.(9까지)
//
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(gugu + "*" + i + "=" + (gugu * i));
//		}
		
		Scanner sc = new Scanner(System.in);
		
		//입력한 값에 대한 총합, 평균, 최대값, 최소값 구하기.
		// 몇 번 반복할건지 그 값을 입력 받는다. ex)10번을 반복한다.
		//예시. 5번 반복. 2,5,20,10,5
		
		//반복 횟수 입력 
		System.out.println("반복횟수입력");
		int count =Integer.parseInt(sc.nextLine());
		
		int total=0;//총합
		int avg=0;//평균
		int max=0;//최대
		int min=0;//최소
		
		for(int i=0; i<count; i++) {
			
		System.out.println("데이터입력>");
		int data=Integer.parseInt(sc.nextLine());
		//총 합계 -> 데이터를 입력 받는대로 누적 합계
		total += data; //total = total+ 입력한 데이터
		
		if(i==0) {
			max= data;
			min= data;// 처음 입력한 값이 최대값이자 최소값이다라는 뜻
		}else {
			//최대값-> 최대값, 입력값을 비교해서 더 큰 데이터가 최대값
			if(max<data) {
				max=data;
			}
			//최소값-> 최소값, 입력값을 비교해서 더 작은 데이터가 최소값
			if(min> data) {
				min=data;
				
			}
		}
		//평 균-> 총 합계 / 반복문 횟수(데이터를 몇 번 입력하는 가에 따라)
				//total / count 
				System.out.printf("평균: %5.2f\n",(double)total/count);
				//total을 실수로 만들었음. 결과는 실수로 나온다.
				System.out.println("최대값:"+max+"최소값:"+min);
				
				//임의의 랜덤 값(1~100) 하나 추출
				//5번 기회 안에 해당 랜덤 값을 맞추는 프로그램 구현
				// 예시 )랜덤 값:50
				//입력-> 30
				//컴퓨터:up
				//사용자: 입력 ->40
				//컴퓨터: up
				//사용자: 입력 ->60
				//컴퓨터: down
				
				//1)맞춘 경우
				//정답입니다, 몇 번만에 맞추셨습니다.
				
				//2)기회안에 못 맞춘 경우
				//모든 기회를 소진하셨습니다.
				//반복문 강제 종료-> break;
				
				int randoNo=(int)(Math.random()*100)+1;
				for() {					
					break;
				}
				
				
				

				
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}