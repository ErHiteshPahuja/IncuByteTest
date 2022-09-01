package com.test;

public class HelloWorld {
	
	public void getBiggestNumber() 
	{
		int[] arr= {4,14};
		int n1 = 0;
		int n2;
		String s1;
		String s2;
		
		int n3 = 0, n4 = 0;
		
		
		for (int i = 0; i < arr.length; i++) 
		{
			n2 = n1;
			n1 = arr[i];							
			s1 = String.valueOf(n1).concat(String.valueOf(n2));	
			
			n3 = Integer.parseInt(s1);
		}
		
		System.out.println(arr.length);
		for (int i = arr.length-1; i >= 0; i--) 
		{
			n2 = n1;
			n1 = arr[i];							
			s2 = String.valueOf(n1).concat(String.valueOf(n2));	
			
			n4 = Integer.parseInt(s2);
		}
		
		if (n3 > n4) 
		{
			System.out.println("Greater Number -- "+n3);
		}
		else 
		{
			System.out.println("Greater Number -- "+n4);
		}
		
	}
	
	
	
	
	 public static void main(String[] args) {
	        HelloWorld hw = new HelloWorld();
	        hw.getBiggestNumber();
	    }
}

