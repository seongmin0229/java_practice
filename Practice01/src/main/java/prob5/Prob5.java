package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 99; i++) {
			int count = 0;
			if(i % 10 % 3 == 0 && i%10 > 0) {
				count++;
			}
			if((int)(i / 10) % 3 == 0 && i / 10 > 0) {
				count++;
			}
			if(count > 0) {
				System.out.print(i + " ");
				for(int j = 0; j < count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
		}
	}
}
