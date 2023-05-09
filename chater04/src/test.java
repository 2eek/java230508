import java.util.Scanner;


public class test {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int randomNo= (int)(Math.random()*100)+1;
		
		for(int i=1; i<=10; i++) {
			System.out.println("번호를 입력하세요.");
			int var=Integer.parseInt(sc.nextLine());
			
			if(var== randomNo) {
				System.out.println("정답입니다"+i+"번만에 맞추셨습니다.");
				break;
			}else if(var > randomNo) {
				System.out.println("down");
			}else if(var<randomNo) {
				System.out.println("up");
			
			} if(i==10) {
			System.out.println("실패하셨습니다.");{
		
			}
			}
			
		}
	}
}
			

	
	

