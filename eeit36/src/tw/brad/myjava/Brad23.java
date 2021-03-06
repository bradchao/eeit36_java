package tw.brad.myjava;

import java.util.Scanner;

public class Brad23 {

	public static void main(String[] args) {
		// 1 + 2 + ... + n = ?
		System.out.println("計算: 1 + 2 + ... + n = ?");
		Scanner scanner = new Scanner(System.in);	// Stream 串流 => 水管 => 水龍頭
		System.out.print("n = ");
		int n = scanner.nextInt();
		scanner.close();
		
		int counter = 1, sum = 0;
		while (counter <= n) {
			sum += counter++;
		}
		
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		
		System.out.println("-----");
		counter = 1; sum = 0;
		for ( ;counter <= n; ) {
			sum += counter++;	
		}
		System.out.printf("1 + 2 + ... + %d = %d\n", n, sum);
		
		
	}

}
