import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> primeNumbersTillN(int N) 
	{ 
	 ArrayList<Integer> ar = new ArrayList<>();
	for(int i = 2;i<=N;i++){
	boolean flag= true;
	for(int j = 2;j<=Math.sqrt(i);j++){
if(i%j==0){
	flag = false;
}

	}
	if(flag== true)
	ar.add(i);
	
	}
	return ar;
	

	}
}
