package com.yedam.variable;

public class Variavle02 {
public static void main(String[] args) {
	
	//2진수 
	int var1= 0b1011;
	int var2= 0206;//8진수
	int var3= 365;//십진수
	int var4= 0xB3; //16진수
	System.out.println("var1: " +var1);
	System.out.println("var2: " +var2);
	System.out.println("var3: " +var3);
	System.out.println("var4: " +var4);
	
	//정수타입의 범위 p60
	//byte -> -128~127
	//byte bVar1= 200; 못 담음
	long bVar1= 200;
	//long bVar2= 200000000000; 못 담음
	//long bVar2= 200000000000L; //맨뒤에 L쓰면 가능
	
	//int 범위: -2,147,483,648~2,147,483,647
	//int bVar3= 200000000000; 못 담음
	System.out.println(bVar1);
	
	//Char
	char c1='A';
	char c2 =65;
	char c3='\u0041';//유니코드표에있는 A의 값
	char c4='가';
	char c5=44032;
	char c6= '\uac00';
	
	System.out.println(c1);
	System.out.println(c2);
	System.out.println(c3);
	System.out.println(c4);
	System.out.println(c5);
	System.out.println(c6);
	
	//이스케이프 문자
	//문자열 String
	
	String name="홍길동";
	String job="프로그래머";
	//\t: tab만큼 띄워라
	//\n:enter
	//\\:특수한 문자 사용(\)
	//\": 특수한 문자 사용(")
	
	System.out.println(name+ "\n"+job);  // \n 행 내릴 때
	System.out.println("행 단위 출력\n");   // 행 내릴 때
	System.out.println("우리는\"개발자\"입니다");//   "을 쓰고 싶을 때
	System.out.println("봄\\여름\\가을\\겨울"); //    \을 쓰고 싶을 때
	
	
	//실수 
	//float, double 
	//double이 float보다 2배 정밀도 높다
	//float
//	float fVar1=3.14f;
//	double dVar1=3.14;
	
	float fVar2= 0.1234567891234f;
	double dVar2= 0.1234567891234f;
	//https://www.youtube.com/watch?v=ZQDsWySjY6g
	System.out.println("fVar2:"+fVar2);  //부동소수점. fVar2:0.12345679 으로 나온다. 근사치에 가까운 값으로, 랜덤값으로 줌. 
	
	System.out.println("dVar2:"+dVar2);
	
	float fVar3= 3e-3f;// 3*0.001 ==10^-3
	double dVar3=3e6;//3*10^6
	
	System.out.println("fVar3:"+fVar3);
	System.out.println("dVar3:"+dVar3);
	
	//논리 타입(Boolean)
	boolean stop= true;
	if(stop) {
		System.out.println("멈춥니다.");
	}else {
		System.out.println("달립니다.");
	}
 }
}
