/*
Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
*/
		
public class SingleNumber 
{
	public static void RunSingleNumber (String [] args)
	{
		SingleNumber singleNumber = new SingleNumber();
		
		int [] array = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,6,7,8,9,0};
		
		System.out.println("Single Number is " + singleNumber.singleNumber (array));
	}
	public int singleNumber (int [] A)
	{
			return A.length;
	}
}
