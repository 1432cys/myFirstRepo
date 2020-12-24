package Algorithm;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class OX {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		// �׽�Ʈ ���̽� ���� �Է�
		int n = Integer.parseInt(br.readLine());
		// OX ���̽����� ������ ArrayList ����
		List<String> arr = new ArrayList<String>();
		
		// �Է¹��� ���̽����� List�� ����
		for(int i=0; i<n; i++) {
			arr.add(br.readLine());
		}
		
		// �׽�Ʈ ���̽��� ���ڸ�ŭ 
		for(int a=0; a<n; a++) {
			int count = 0; // O�� �������� ���� ���� ����
			int result = 0; // ���� �� �ջ�
			
			// List ����� ���̸�ŭ �ݺ�
			for(int b=0; b< arr.get(a).length(); b++) {
				// List ���� ��ҿ��� b��°�� �ִ� ���� ��ȯ �� ��
				if(arr.get(a).charAt(b) == 'O') {
					// O�� ��� count�� ����
					count++;
				}else {
					// O�� �ƴ� ��� count�� 0���� �ʱ�ȭ
					count = 0;
				}
				// ���� ������ ���� ���� ��� count���� �� = ���� �� �ջ�
				result += count;
			}
			
			// ��°� ����
			bw.write(Integer.toString(result)+"\n");
			
		}
		
		// ���
		bw.flush();
		
			
	}
	
}
