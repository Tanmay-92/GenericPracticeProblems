package GenericProblems;

import java.util.Scanner;

public class Generic_uc3 {
	public static String maxofString (String a1 , String a2 , String a3) {
		String max= a1 ;
		if (a2.compareTo(max)> 0 )
			max =a2;
		if (a3.compareTo(max)>0)
			max=a3;
		return max ;
		}

	public static void main(String[] args) {
		System.out.println("Enter the String :");
		Scanner Word = new Scanner(System.in);
		System.out.println("Enter the 1st string :");
		String a1 = Word.next();
		System.out.println("Enter the 2nd string :");
		String a2 = Word.next();
		System.out.println("Enter the 3rd string :");
		String a3 = Word.next();
		System.out.println("Max String : " +maxofString(a1 , a2 ,a3));
	}

}
