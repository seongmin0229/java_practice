package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		int input = scanner.nextInt();
		
		int sum = 0;
		
		if(input % 2 == 0) {
			for(int i = 0; i <= input; i+=2) {
				sum += i;
			}
		}else {
			for(int i = 1; i <= input; i+=2) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		scanner.close();
	}
}
