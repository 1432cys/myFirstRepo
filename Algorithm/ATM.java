package Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
	static int[] p;
	static int sum;
	
	//중간합
	public static int sum(int m) {
		for (int j = 0; j < m; j++) {
			sum += p[j];
		}
		return sum;
	}
	//순서정렬
	public static void swap(int a[], int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	/**
	 * 버블정렬사용
	 * 
	 */
	public static void Sort(int a[]) {
		int size = a.length;
		for (int i = size - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					swap(a, j, j + 1);
				}
				// System.out.printf("\n\t");
				for (int v : a) {
					// System.out.printf("%3d ", v);
				}
			}
		}
		// System.out.println();
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		p = new int[n];
		String[] s = br.readLine().split(" ");

		for (int j = 0; j < n; j++) {
			p[j] = Integer.parseInt(s[j]);
		}
		Sort(p);
		for (int j = 1; j <= n; j++) {
			sum = sum(j);
		}	

	}
}
