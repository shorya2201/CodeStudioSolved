/*
Problem statement
You are given a 0-indexed array ‘NUMS’ consisting of ‘N’ integers. Sort the array ‘NUMS’ in such a way that the first half of the array contains only odd numbers sorted in non-increasing order and the second half contains only even numbers sorted in non-decreasing order.

Example:
Input: ‘N’ = 4,  ‘NUMS’ = [2, 5, 3, 6] 

Output: [5, 3, 2, 6]

Sorting the odd numbers of the array ‘NUMS’ in non-increasing order, the result is 5, 3
Then, Sorting the even numbers in non-decreasing order, the result is 2, 6.
Since the final array should contain the odd numbers in non-increasing order in the first half and even numbers in non-decreasing order in the other half.
So, the final array is [5, 3, 2, 6].
*/

import java.util.* ;
import java.io.*;
public class Solution {
	public static void sortOddEven(int[] nums) {
	List even = new ArrayList<Integer>();
	List odd = new ArrayList<Integer>();

		for(int i = 0;i<nums.length;i++){
			if(nums[i]%2!=0)
				odd.add(nums[i]);
			else
				even.add(nums[i]);
			}

Collections.sort(even);
Collections.sort(odd,Collections.reverseOrder());

List al = new ArrayList<Integer>();

al.addAll(odd);
al.addAll(even);



for(int i = 0 ;i<nums.length;i++){
	nums[i] = (int)al.get(i);
}
	}  
}
