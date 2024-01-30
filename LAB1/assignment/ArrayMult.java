package LAB1.assignment;

import java.util.Arrays;

public class ArrayMult {

	
	public int[] mult(int[] array1, int[] array2) 
	{
		int[] outArray, longArray = null;
		int minlen = Math.min(array1.length, array2.length);
		
		if(array1.length <= array2.length)
		{longArray = array2;}
		else
		{longArray = array1;}
		
		
		outArray = longArray;
		for(int i = 0; i < minlen; i++)
		{
			outArray[i] = array1[i]*array2[i];
		}
		for(int j = 0; j >= minlen ; j++)
		{
			outArray[j] = longArray[j];
		}
		
		return outArray; 
	}
	
	/*public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {5,6,7,8,9};
		int[] arr3 = {4,3,2,1,0};
		
		ArrayMult arrMult = new ArrayMult();
		int[] result = arrMult.mult(arr3,arr1);
		
		System.out.println(Arrays.toString(result));
	}*/
}
