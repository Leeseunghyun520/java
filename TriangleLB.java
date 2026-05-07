package jump2java;
import java.util.Scanner;
public class TriangleLB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("높이: ");
		int num = sc.nextInt();
		
		for(int i =1; i <= num ; i++) {
			for(int j = 1; j <= i ; j++) {
				System.out.println("*");
			}
			System.out.println("");
		}
        sc.close();
        
	}

}
