package lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Program3 {
    
	 public static void main(String[] args)
	 {
		 int[][] arr = new int[3][];
		 arr[0] = new int[4];
		 arr[1]= new int[2];
		 arr[2] = new int[5];
		 System.out.println("Enetr");
		 Scanner scan = new Scanner(System.in);
		 for(int i = 0;i<3;i++)
		 {
			 for(int j=0;j<arr[i].length;j++)
			 {
				 arr[i][j] = scan.nextInt();
			 }
		 }
		 
		System.out.println(Arrays.deepToString(arr));
}
}