package com.test;

public class BiggestNumber {
	
	public void getBiggestNumber() 
	{
		int[] arr= {4,14};
		int n1 = 0;
		int n2;
		String s1 = "";
		String s2 = "";
		
		for (int i = 0; i < arr.length; i++) 
		{
			n2 = n1;
			n1 = arr[i];							
			s1 = String.valueOf(n1).concat(String.valueOf(n2));		
			s2 = String.valueOf(n2).concat(String.valueOf(n1));
		}
		
		if (Integer.parseInt(s1) > Integer.parseInt(s2)) 
		{
			System.out.println("Greater Number -- "+s1);
		}
		else 
		{
			System.out.println("Greater Number -- "+s2);
		}
	}
	
	 public static void main(String[] args) {
		 BiggestNumber hw = new BiggestNumber();
	        hw.getBiggestNumber();
	    }
}