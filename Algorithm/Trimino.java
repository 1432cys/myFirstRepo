package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Trimino {
	static int num=0;
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = (int) Math.pow(2,Integer.parseInt(br.readLine()));
		StringTokenizer st = new StringTokenizer(br.readLine());		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int[][]tile = new int[size][size];

	}

}
