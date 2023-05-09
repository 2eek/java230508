package com.yedam.print;
import java.util.Scanner;

public class printExample {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
	System.out.println("1.글 보기 2.글 수정 3.글 삭제 4. 뒤로 가기");
	int selecrtNo= Integer.parseInt(sc.nextLine());
	
	switch(selecrtNo) {
	case 1:
		System.out.println("글 보는 기능");
		break;
	case 2:
		System.out.println("글 수정하는 기능");
		break;
	case 3:
		System.out.println("글 삭제하는 기능");
		break;
	case 4:
		System.out.println("글 뒤로 가기 기능");
		break;
		}

	}
}
