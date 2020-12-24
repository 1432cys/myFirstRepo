package Algorithm;

import java.util.Scanner;

public class Charges {
	static int[] time = new int[20];
	/*
	 * 동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.
	 * 
	 * 영식 요금제 민식 요금제 영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이
	 * 청구된다. 만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.
	 * 
	 * 민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다. 만약
	 * 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.
	 * 
	 * 동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을
	 * 작성하시오.
	 */
	public static int ys(int i) {
		int p=0;
		for(int j=0;j<i;j++) {
			if(time[j]%30==0) {
				p+=time[j]/30;
			}else
				p+=time[j]/30+1;
		}	
		return 10*p;
	}
	public static int ms(int i) {
		int p=0;
		for(int j=0;j<i;j++) {
			if(time[j]%60==0) {
				p+=time[j]/60;
			}else
				p+=time[j]/60+1;
		}	
		return 15*p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		String result = "";
		for(int i=0;i<n;i++) {
			time[i] = sc.nextInt();			
		}
		
		if(ys(n)==(ms(n))) {
			sb.append("Y"+" "+"M "+ys(n));
		}else {
			result = ys(n)<ms(n)?"Y "+ys(n):"M "+ms(n);
			sb.append(result);
		}		
		
		System.out.println(sb);
		
		

	}

}
