package Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class tile {
	static int count;

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 테스트 케이스 숫자 입력
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		// 입력받은 케이스들을 List에 저장
		char c[][] = new char[n+1][m+1];
		
		for(int i=0;i<n;i++) {			
			String s = br.readLine();
			for(int j=0;j<m;j++) {
				c[i][j] = s.charAt(j);
						
			}
			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(c[i][j]!=c[i][j+1]&&c[i][j+1]!='-'||c[i][j+1]!='|') {
					count++;
				}
				
				if(c[i][j]!=c[i+1][j]&&c[i+1][j]!='-'||c[i+1][j]!='|') {
					count++;
				}
			}
		}
		
	
		System.out.println(count+1);
	
		
		
	}
	
}
