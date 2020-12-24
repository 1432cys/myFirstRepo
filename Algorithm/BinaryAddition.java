package Algorithm;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String bin1 = sc.next();
		String bin2 = sc.next();
		
		//날먹버전
		int dec1 = Integer.parseInt(bin1, 2);
		int dec2 = Integer.parseInt(bin2, 2);
		int plus = dec1+dec2;
		
		String result = Integer.toBinaryString(plus);
		
		System.out.println("답1:"+result);
		sc.close();
		
		
		//?
		
		int len1 = bin1.length();
		int len2 = bin2.length();
		System.out.println("len:"+len1+":"+len2);
		int sum=0;
		
		//10진수변환
		for(int i=0;i<len1;i++) {
			int pow = len1-1;
				if(bin1.charAt(i)==49) {			
				int value = (int) Math.pow(2, pow);				
				sum+=value;
				pow--;
				}else 	
					pow--;
				
		
		}
		for(int j=0;j<len2;j++) {
			int pow2 = len2-1;
				if(bin1.charAt(j)==49) {			
				int value = (int) Math.pow(2, pow2);
				sum+=value;
				pow2--;
				}else pow2--;
		
		}
		//2진수변환
		String result2 = Integer.toBinaryString(sum);
		
		System.out.println("답2"+result2);
		

	}

}
