
import java.util.Scanner;

public class Validation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1 or 0を入力してください。＞");
		int num = sc.nextInt();
		sc.close();
		
		if (num == 1 ) {
			System.out.println("真です");
		} 
		else if(num == 0){
			System.out.println("偽です");
		} else {
			System.out.println("1 or 0 を入力してください。");
		}
		
	}
}
