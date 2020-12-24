package Algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BugKing {
	final static String bug = "BUG";
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("text.txt");
		String str;		
		StringBuilder sb = new StringBuilder();
		
		
		while((str=fr.read())!=null) {
			
			
			sb.append(str);
		}
		
		
		
		

	}

}
