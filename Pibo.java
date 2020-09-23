import java.util.Scanner;

public class Pibo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("입력");
		int input =Integer.parseInt(sc.nextLine()); // 8개 출력
					System.out.println(fibo(input));

		

	}

	public static int fibo(int n) {
		if (n <= 1)
			return n;
		else
			return fibo(n - 2) + fibo(n - 1);

	}

}
