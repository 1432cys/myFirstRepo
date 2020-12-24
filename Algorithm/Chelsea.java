package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Chelsea {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> paylist = new ArrayList<Integer>();
        List<String> namelist = new ArrayList<String>();
        paylist.add(0);
        namelist.add("no");
      
        for(int i=0;i<n;i++) {
        	int p = Integer.parseInt(br.readLine());    	        	
        	int key = 0;
        	paylist.set(0, 0);
    		namelist.set(0, "no");
        	for(int j=1;j<=p;j++) {        		
	        	StringTokenizer st = new StringTokenizer(br.readLine());
	        	int pay =Integer.parseInt(st.nextToken());
	        	String name = st.nextToken();
	        	paylist.add(pay);
        		namelist.add(name);
	        	if(paylist.get(j-1)<pay) {	        	
	        		paylist.set(0, pay);
	        		namelist.set(0, name);
	        		key++;
	        	}else {
	        		
	        	}
	        	
        	}        	
        	
        	System.out.println(paylist.get(0)+":"+namelist.get(0));
        }
       
        
        
    }
}
