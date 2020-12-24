package Algorithm;

import java.util.Scanner;

public class Charges {
	static int[] time = new int[20];
	/*
	 * ��ȣ�� ���Ǵ�� T ��Ż��� �� �ڵ��� �ȸӳ��� ���. ���Ǵ�� T ��Ż�� ��ȣ���� ���� �� ���� ����� �� �ϳ��� �����϶�� �ߴ�.
	 * 
	 * ���� ����� �ν� ����� ���� ������� 30�ʸ��� 10���� û���ȴ�. �� ���� ���� 29�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 10����
	 * û���ȴ�. ���� 30�ʺ��� 59�� ���̷� ��ȭ�� ������ 20���� û���ȴ�.
	 * 
	 * �ν� ������� 60�ʸ��� 15���� û���ȴ�. �� ���� ���� 59�� �Ǵ� �� ���� ���� �ð� ��ȭ�� ������ 15���� û���ȴ�. ����
	 * 60�ʺ��� 119�� ���̷� ��ȭ�� ������ 30���� û���ȴ�.
	 * 
	 * ��ȣ�� ���� �޿� ���Ǵ�� T ��Ż縦 �̿��� �� ��ȭ �ð� ����� �־����� ��� ������� ��� �ϴ� ���� �������� ����ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
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
