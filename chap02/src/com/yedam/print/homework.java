package com.yedam.print;

public class homework {
	public static void main(String[] args) {
		
		
		/* 문제1) 정수형 변수 2개를 선언 후 각각 37과 91로 값을 초기화 후 변수를 출력하라. 
		   출력예시) "변수명1: 변수값, 변수명2: 변수값" */
    int a=37;
    int b=91;
    System.out.println("변수명1:"+a+","+"변수명:"+b);
    

	
	// 문제2) 문제 1번의 변수를 이용하여 각 연산을 수행한 결과를 출력하라.
	  // 2.1) 91 더하기 37
	System.out.println(b+a);
	
//	   2.2) 91 빼기 37
	System.out.println(b-a);
	
//	   2.3) 91 곱하기 37
	System.out.println(b*a);
	
//	   2.4) 91 나누기 37 
	double answer1=(double) b/a;
	double test=Math.round(answer1*100)/100.0;
	System.out.println(test);

	/* 문제3) 각 변수의 값에 맞게 변수타입을 수정 후 값과 변수타입을 printf()를 사용하여 출력하세요.
	    출력예시) int a = 10; 의 경우 "10, int"로 출력. */
	
	//3-1)  byte var1 = 128;
	int var1 = 128;
    System.out.printf("%d,%s\n",var1,"int");
    
	//3-2) char var2 = "B";
    String var2 = "B";
    System.out.printf("%s,%s\n",var2,"String");
	
	//3-3) String var3 = 44032;
   int var3=44032;
    System.out.printf("%d,%s\n",var3,"int");
    
	
	//3-4) int var4 = 100000000000;
    long var4 = 100000000000L;
    System.out.printf("%d,%s\n",var4,"long");
	
	//3-5) float var5 = 43.93106;
    float var5 = 43.93106f;
    System.out.printf("%d,%s\n",var5,"float");
	
	//3-6) long var6 = 301.3;
    double var6 = 301.3;
    System.out.printf("%d,%s\n",var6,"double");
	
	
 // 문제4) 아래와 같이 변수가 초기화되어있을 경우 결과값을 저장할 변수의 타입을 지정하고 값을 변수값을 출력하세요.
 		byte a1 = 35;
 		byte b1 = 25;
 		int c1 = 463;
 		long d1 = 1000L;
 		
 		 //4-1)
 		long result1 = a1 + c1 + d1;
 		System.out.println(result1);
 		
 		
 		/* 4-2 )
 		result2 = a + b + c;
 		System.out.println(result2);
 		*/
 		long result2 = a1 + b1 + c1;
 		System.out.println(result2);

 		/* 4-3 )
 		double e = 45.31;
 		result3 = c + d + e;
 		System.out.println(result3);	
 		*/
 			double e1 = 45.31;
 		double result3 = c1 + d1 + e1;
 		System.out.println(result3);
 		  
 		/* 문제5) 아래와 같이 변수가 초기화되어있을 경우 다음과 같이 명시된데로 출력하세요.
 		    출력예시) A278번지10.0 */
 		int intValue1 = 24;
 		int intValue2 = 3;
 		int intValue3 = 8;
 		int intValue4 = 10;
 		char charValue = 'A';
 		String strValue = "번지";
 		String str1=intValue1+intValue2+String.valueOf(intValue3);
  		  System.out.println(str1);
         System.out.println(charValue+str1+strValue+Double.valueOf(intValue4));
           //System.out.println(String.valueOf(charValue)+%d(intValue1+intValue2)+String.valueOf(intValue3)+strValue+Double.valueOf(intValue4));
    
    
	}

}
