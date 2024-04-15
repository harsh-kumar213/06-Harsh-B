package lab2;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String st,str;
		System.out.println("Enter the String");
		st = scan.next();
		str = st.toLowerCase();
		String rev = "";
		for(int i = str.length()-1;i>=0;i--) {
			rev= rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("it is a palindrome");
		}
		else
			 System.out.println("it is not a palindrome");
		

	}

}
