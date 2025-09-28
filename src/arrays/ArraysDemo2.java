package arrays;

import inheritance.Student;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
	 //method 2: using new operator
	
		int[] b=new int [10];
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		b[0]=100;
		
		b[9]=1000;
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	
	}

}
