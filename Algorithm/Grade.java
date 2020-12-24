package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Grade {
	static double avg=0.0;
	static double sum=0.0;
	static double total=0.0;
	static double cal(double unit, String grade) {		
		double cal=0.0;
		total+=unit;
		boolean a = grade.contains("A");
		boolean b = grade.contains("B");
		boolean c = grade.contains("C");
		boolean d = grade.contains("D");		
		if(a==true) {
			cal=4.0;
		}else if(b==true) {
			cal=3.0;			
		}else if(c==true) {
			cal=2.0;
		}else if(d==true) {
			cal=1.0;
		}else {
			cal=0.0;
		}
		if(grade.contains("+")) {
			cal+=0.3;
		}
		if(grade.contains("-")) {
			cal-=0.3;
		}
		
		double res = cal*unit;
	
		return res;
		
	}

	public static void main(String[] args) throws NumberFormatException, IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0;i<num;i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		String sub = st.nextToken();
		double unit = Double.parseDouble(st.nextToken());
		String grade = st.nextToken();
		sum+=cal(unit,grade);
		
		}		
		avg=Math.round((sum/total)*100)/100.0;
		System.out.println(avg);

	}

}
