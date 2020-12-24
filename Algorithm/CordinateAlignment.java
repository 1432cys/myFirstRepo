package Algorithm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CordinateAlignment {
	
    public static void main(String[] args) throws IOException {        	
   	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   	   int n = Integer.parseInt(br.readLine());
   	   int[][] arr = new int[n][2];
   	   for(int i = 0; i<n; i++) {
   		   String[] s = br.readLine().split(" ");
   		   for(int j = 0; j<2; j++) {
   			   arr[i][j] = Integer.parseInt(s[j]);
   		   }
   	   }
   	   /*
   	    * 
  Open Declaration   java.util.Comparator<int[]>


@HotSpotIntrinsicCandidate


A comparison function, which imposes a total ordering on somecollection of objects. Comparators can be passed to a sort method (suchas Collections.sort or Arrays.sort) to allow precise controlover the sort order. Comparators can also be used to control the order ofcertain data structures (such as sorted sets or sorted maps), or to provide an ordering for collections ofobjects that don't have a natural ordering.

The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals if and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.

Caution should be exercised when using a comparator capable of imposing anordering inconsistent with equals to order a sorted set (or sorted map).Suppose a sorted set (or sorted map) with an explicit comparator cis used with elements (or keys) drawn from a set S. If theordering imposed by c on S is inconsistent with equals,the sorted set (or sorted map) will behave "strangely." In particular thesorted set (or sorted map) will violate the general contract for set (ormap), which is defined in terms of equals.

For example, suppose one adds two elements a and b such that (a.equals(b) && c.compare(a, b) != 0)to an empty TreeSet with comparator c.The second add operation will returntrue (and the size of the tree set will increase) because a and b are not equivalent from the tree set's perspective, even thoughthis is contrary to the specification of the Set.add method.

Note: It is generally a good idea for comparators to also implement java.io.Serializable, as they may be used as ordering methods inserializable data structures (like TreeSet, TreeMap). Inorder for the data structure to serialize successfully, the comparator (ifprovided) must implement Serializable.

For the mathematically inclined, the relation that defines the imposed ordering that a given comparator c imposes on agiven set of objects S is:
       {(x, y) such that c.compare(x, y) <= 0}.
 
The quotient for this total order is:       {(x, y) such that c.compare(x, y) == 0}.
 
It follows immediately from the contract for compare that thequotient is an equivalence relation on S, and that theimposed ordering is a total order on S. When we say thatthe ordering imposed by c on S is consistent withequals, we mean that the quotient for the ordering is the equivalencerelation defined by the objects' equals(Object) method(s):     {(x, y) such that x.equals(y)}. 

Unlike Comparable, a comparator may optionally permitcomparison of null arguments, while maintaining the requirements foran equivalence relation. 

This interface is a member of the Java Collections Framework.
Type Parameters:<T> the type of objects that may be compared by this comparatorSince:1.2Author:Josh BlochNeal GafterSee Also:Comparablejava.io.Serializable
   	    */
   	   Arrays.sort(arr, new Comparator<int[]>() {

   		/*  the value 0 if x == y; 
			a value less than 0 if x < y; 
			and a value greater than 0 if x > y 
		*/
		@Override  
		public int compare(int[] o1, int[] o2) {
			if(o1[0]==o2[0]) return Integer.compare(o1[1], o2[1]);
			return Integer.compare(o1[0], o2[0]);
		} 
   	   });
   	   
   	   
   	   for(int i = 0; i<n; i++) {
   		   for(int j = 0; j<2; j++) {
   			   System.out.print(arr[i][j]+" ");
   		   }System.out.println("");
   	   }
    }
}
