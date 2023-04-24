package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {

		public int[] range(int[] nums,int target) {
			int leftPosition=0;
			int rightPosition=nums.length -1;
			int leftMost= -1;
			int rightMost= -1;
			
			while (leftPosition <= rightPosition) {
				int middle=(leftPosition + rightPosition)/2;
				if (nums[middle] < target) {
					leftPosition=middle +1;
				}else if (nums[middle] > target) {
					rightPosition=middle -1;
				}else {
					leftMost=middle;
					rightPosition=middle -1;
				}
			}
			
			if (leftMost == -1) {
				return new int[] {-1,-1};
			}
			leftPosition=0;
			rightPosition=nums.length -1;
			while (leftPosition <=rightPosition) {
				int middle=(leftPosition + rightPosition)/2;
				if (nums[middle] < target) {
					leftPosition=middle +1;
				}
				else if (nums[middle] >target) {
					rightPosition=middle -1;
				}else {
					rightMost=middle ;
					leftPosition=middle +1;
				}
			}
			return new int[] {leftMost,rightMost};
		}
	
	public static void main(String[] args) {

		Test test=new Test();
		
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		int[] result=test.range(nums, target);
		System.out.println(Arrays.toString(result));
		
		
		target=6;
		result=test.range(nums, target);
		System.out.println(Arrays.toString(result));
		
		nums=new int[] {};
		target=0;
		System.out.println(Arrays.toString(result));
		
	}

}
