package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Swindler {
	static float sum=0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int[]score;
		float temp;
		int n = sc.nextInt();
		score=new int[n];		
		
		for(int i=0;i<n;i++) {
			score[i] = sc.nextInt();			
		}
		
		Arrays.sort(score);
		int m = score[n-1];
	
		
		for(int j=0;j<n;j++) {
			temp = score[j];
			temp = temp/m*100;
			sum+=temp;			
			
		}
	
		
		System.out.println(sum/n);
		sc.close();
	}
	
	

}
