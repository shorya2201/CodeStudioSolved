//Asked in Samsung , BNYMellon , Adobe , DeShaw
import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static int missingNumber(int[] arr, int n) 
    {
      int diff = Integer.MAX_VALUE;//intializing with maximum value to make it easy for further comparision
      for(int i =1;i<arr.length-1;i++){
          int localDiff = arr[i+1] - arr[i];//calculating difference between each interval
diff = Math.min(localDiff , diff);//storing the minimum value from each difference , if element is missing the difference will be more hence it will be ignored.
      }
int res = 0;
      for(int i = 0; i<arr.length-1;i++){
if(arr[i+1] - arr[i]!=diff){
    res = arr[i]+diff;//storing the missing value by adding the difference in the Ith value index.
}
      }
        return res;
    }
}

