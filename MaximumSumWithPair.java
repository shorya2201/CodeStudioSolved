import java.util.* ;
import java.io.*; 
public class Solution {

    public static int oneIteration(int[] A) {
      Arrays.sort(A);
      return A[A.length-1]+A[A.length-2];
      

    }
}
