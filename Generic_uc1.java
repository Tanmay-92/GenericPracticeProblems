package GenericProblems;

import java.util.Scanner;

public class Generic_uc1 {
	
	
	public static Integer maxofInteger (Integer a1 , Integer a2 , Integer a3) {
	Integer max= a1 ;
	if (a2.compareTo(max)> 0 )
		max=a2;
	if (a3.compareTo(max)>0)
		max=a3;
	return max ;
	}

	public static void main(String[] args) {
		System.out.println("Enter the integer");
		Scanner Num = new Scanner(System.in);
		System.out.println("enter the 1st integer");
		Integer a1= Num.nextInt();
		System.out.println("enter the 2nd integer");
		Integer a2= Num.nextInt();
		System.out.println("enter the 3rd integer");
		Integer a3= Num.nextInt();
		System.out.println("Max Value of Integer is :" +maxofInteger(a1 , a2 ,a3));
	}
	

}
