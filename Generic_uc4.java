package GenericProblems;

import java.util.Scanner;

public class Generic_uc4 {
	public static Integer maxofInteger (Integer a1 , Integer a2 , Integer a3) {
	Integer max= a1 ;
	if (a2.compareTo(max)> 0 )
		max=a2;
	if (a3.compareTo(max)>0)
		max=a3;
	return max ;
	}
	public static Float maxofFloat (Float b1 , Float b2 , Float b3) {
		Float max= b1 ;
		if (b2.compareTo(max)> 0 )
			max=b2;
		if (b3.compareTo(max)>0)
			max=b3;
		return max ;
		}
	public static String maxofString (String c1 , String c2 , String c3) {
		String max= c1 ;
		if (c2.compareTo(max)> 0 )
			max =c2;
		if (c3.compareTo(max)>0)
			max=c3;
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
		
		System.out.println("Enter the Float Number :");
		Scanner Digit = new Scanner(System.in);
		System.out.println("enter the 1st Float No.");
		Float b1= Digit.nextFloat();
		System.out.println("enter the 2nd Float No.");
		Float b2= Digit.nextFloat();
		System.out.println("enter the 3rd Float No.");
		Float b3= Digit.nextFloat();
		System.out.println("Max Value of Float is :" +maxofFloat(b1 , b2 ,b3));
		
		System.out.println("Enter the String :");
		Scanner Word = new Scanner(System.in);
		System.out.println("Enter the 1st string :");
		String c1 = Word.next();
		System.out.println("Enter the 2nd string :");
		String c2 = Word.next();
		System.out.println("Enter the 3rd string :");
		String c3 = Word.next();
		System.out.println("Max String is : " +maxofString(c1 , c2 ,c3));


	}

}
