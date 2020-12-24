package Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One {
	
	static int[] list;	//����� �����
	
    private static int dp(int n) {
        if (n == 1) return 0; //1�Է��� ��
        if (list[n] > 0) return list[n]; // DP �ٽ�
        
        
        list[n] = dp(n - 1) + 1;	//����Լ� �̿� => n�� 2���� ���� ( 10�� ��� -1�� �����ϴ°��� Ƚ���� ����)
        if (n % 2 == 0) {
            int tmp = dp(n / 2) + 1;	//2�θ��� ������(+1) ����������� ȣ��
            if (list[n] > tmp) {		//temp�� �ӽ÷� �����Ͽ� 1�� ���� �� ���� �ƴѰ���� ����� ��
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
