package com.yedam.variable;

public class Variable01 {
	public static void main(String[] args) {
		int value = 0;
		int result= value +10;
		System.out.println(result);
	
	
	


//변수사용 
int hour=3;
int minute= 5;
System.out.println(hour+"시간"+minute+"분");

int totalMinute=(hour*60)+minute;
System.out.println("총"+totalMinute+"분");



//변수 복사
int x=3;
int y;
y=x;

System.out.println("바꾸기 전:"+ x);
System.out.println("바꾼 후:"+ x+y);

//swap
//x와 y의 값을 바꾼다.
//x=y는 x의 값과 y값이 같아지는 것임. 
//대신 담아줄 수 있는 변수를 사용한다. z를 사용한다.
x=3;
y=5;
int z= 0;
//1) x->z(z=3)
//2)y->x(x= 3->5)
//3)z->z(y=5->3)

z=x;//1) x->z(z=3)
x=y;//2)y->x(x= 3->5)
y=z;//3)z->z(y=5->3)

//변수의 사용 범위
int v1=15;
if(v1>10) {
//	int v2;
	//v2=v1-10;
	// if문 안의 v2임. 지역변수?
}
int v3=v1+5; //여기서는 v2사용 못함 
System.out.println(v3);
char c=65;
System.out.println(c);

char var1='A';
System.out.println(var1);









	}
}