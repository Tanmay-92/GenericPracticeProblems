package GenericProblems;

import java.util.Scanner;

public class Generic_uc2 {

	public static Float maxofFloat (Float a1 , Float a2 , Float a3) {
		Float max= a1 ;
		if (a2.compareTo(max)> 0 )
			max=a2;
		if (a3.compareTo(max)>0)
			max=a3;
		return max ;
		}
	public static void main(String[] args) {
		System.out.println("Enter the integer");
		Scanner Num = new Scanner(System.in);
		System.out.println("enter the 1st Float No.");
		Float a1= Num.nextFloat();
		System.out.println("enter the 2nd Float No.");
		Float a2= Num.nextFloat();
		System.out.println("enter the 3rd Float No.");
		Float a3= Num.nextFloat();
		System.out.println("Max Value of Integer is :" +maxofFloat(a1 , a2 ,a3));

	}

}
