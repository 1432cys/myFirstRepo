package Algorithm;
import java.util.Arrays;
import java.util.Scanner;

public class Skiplog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int inp[] = new int[n];
			for (int i = 0; i < n; i++) {
				inp[i] = sc.nextInt();
			}
			Arrays.sort(inp);
			int res = 0;
			int tmp = 0;
			if (inp.length % 2 == 1) {
				for (int i = 0; i + 2 < n; i += 2) {
					tmp = Math.abs(inp[i] - inp[i + 2]);
					 res= tmp > res ? tmp : res;
				}
				for (int i = inp.length - 2; i - 2 >= 1; i -= 2) {
					tmp = Math.abs(inp[i] - inp[i - 2]);
					res = tmp > res ? tmp : res;
				}
			} else {
				for (int i = 0; i + 2 < n - 1; i += 2) {
					tmp = Math.abs(inp[i] - inp[i + 2]);
					res = tmp > res ? tmp : res;
				}
				for (int i = inp.length - 1; i - 2 >= 1; i -= 2) {
					tmp = Math.abs(inp[i] - inp[i - 2]);
					res = tmp > res ? tmp : res;
				}
			}
			//정점
			tmp = Math.abs(inp[inp.length - 1] - inp[inp.length - 2]);
			res = tmp > res ? tmp : res;
			//끝점과 끝점
			tmp = Math.abs(inp[0] - inp[1]);
			res = tmp > res ? tmp : res;
			System.out.println(res);
		}
	}
}