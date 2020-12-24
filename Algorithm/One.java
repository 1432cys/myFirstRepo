package Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
	
	static int[] list;	//계산결과 저장용
	
    private static int dp(int n) {
        if (n == 1) return 0; //1입력일 때
        if (list[n] > 0) return list[n]; // DP 핵심
        
        
        list[n] = dp(n - 1) + 1;	//재귀함수 이용 => n은 2부터 적용 ( 10의 경우 -1을 먼저하는것이 횟수가 적음)
        if (n % 2 == 0) {
            int tmp = dp(n / 2) + 1;	//2로먼저 나누고(+1) 나머지계산결과 호출
            if (list[n] > tmp) {		//temp에 임시로 저장하여 1을 먼전 뺀 경우와 아닌경우의 결과값 비교
                list[n] = tmp;
            }
        }
        if (n % 3 == 0) {
            int tmp = dp(n / 3) + 1;
            if (list[n] > tmp) {
                list[n] = tmp;
            }
        }
        return list[n];
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int n =Integer.parseInt(br.readLine());
		
		list= new int[n+1];		
		
		System.out.println(dp(n));
		
		br.close();	

	}

}
