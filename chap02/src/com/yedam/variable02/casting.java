package com.yedam.variable02;

public class casting {
public static void main(String[] args) {
	//자동타입변환
	byte bValue=10;
	int iValue=bValue;//int변환
System.out.println("iValue:"+ iValue);

char charVal='가';
iValue= charVal;
System.out.println("가의 유니코드:"+ iValue);

iValue=50;
long lValue = iValue;
System.out.println("lValue:"+lValue);

double dValue=lValue;
System.out.println("dValue:"+ dValue);

//강제 타입 변환
int iVar= 127;// int는 정수값 넣음
byte bVar= (byte)iVar;// int를 byte로 넣자

int iVar2=44032;
char charVar=(char)iVar2;
System.out.println("charVar:"+iVar2);

//실수 <-> 정수 강제 타입 변환
//자동타입변환: int(3)-> double= 3.0
//강제타입변환: double(3.5)-> int=소수점 아래 내용을 제외 후 정수 변환
double dVar=3.14;
iVar2=(int)dVar;

System.out.println("iVar2:"+ iVar2);

}
}