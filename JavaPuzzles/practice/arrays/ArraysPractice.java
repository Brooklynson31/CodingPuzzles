package practice.arrays;

public class ArraysPractice {
	//Assignment: Write a method that can find a target integer in the nums array
	//if target value is not found then have method return negative one
	//should return index position of the value
	public static void main(String[] args) {

		int[] nums = new int[] {2,3,4,5,6};
		System.out.println(search(nums, 5));
		System.out.println(search(nums, 9));

	}
	
	public static int search(int[] nums, int target){
		for(int i: nums){
			if (i == target){
				return i;
			}
		}
		
		return -1;
	}

}
