
/*
Kevin Damazyn

Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of the two groups is the same, with these constraints: 
all the values that are multiple of 5 must be in one group, and all 
the values that are a multiple of 3 (and not a multiple of 5) must be 
in the other. (No loops needed.) 

split53({1,1}) → true
split53({1, 1, 1}) → false
split53({2, 4, 2}) → true

*/

public class split53 {

	public static void main(String[] args) {
		int[] nums = {1,1};
		System.out.println(split53(nums));
		int[] nums1 = {1,1,1};
		System.out.println(split53(nums1));
		int[] nums2 = {2,4,2};
		System.out.println(split53(nums2));
	}

	public static boolean split53(int[] nums) {
  		int index = 0;
  		int sumOf5 = 0;
  		int sumOf3 = 0;
  		return splitArray(nums,index,sumOf3,sumOf5);
	}

	public static boolean splitArray(int[] nums,int index,int sumOf3, int sumOf5){
		if(index >= nums.length){
			return sumOf3==sumOf5;
		}
		int number = nums[index];
		if(number%5==0){
			return splitArray(nums,index+1,sumOf3,sumOf5+number);
		}else if(number%3==0){
			return splitArray(nums,index+1,sumOf3+number,sumOf5);
		}else {
			return splitArray(nums,index+1,sumOf3,sumOf5+number) || 
				splitArray(nums,index+1,sumOf3+number,sumOf5);
		}
	}
}


