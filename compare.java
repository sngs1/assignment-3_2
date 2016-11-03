package a7;

import java.util.Scanner;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean same=false; // initialization
		// user can give input   
		// first string
		Scanner scn=new Scanner(System.in);
		System.out.println("Input the first string,s1=");
		String S1=scn.nextLine();
		//second string
		System.out.println("Input the second string,s2=");
		String S2=scn.nextLine();
		scn.close();
		if (S1.equals(S2))                 // using for loop for comparison
		{
			same=true;
		}
		else
		{
			same=false;
		}
		System.out.println("output="+same);
		
		
		
		
	}

}
