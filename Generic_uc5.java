package GenericProblems;


import java.util.Arrays;


public class Generic_uc5<E extends Comparable<E>> {
	E[] Elements;
	public void Max_Value(E[] Elements) {
		this.Elements = Elements;
	}
	
	public static <E extends Comparable<E>> E maxOFValue(E[] Elements) {
		Arrays.sort(Elements);
		int lenght = Elements.length;
		E max = Elements[lenght - 1];
		return max;
	}

	public static void main(String[] args) {
		Integer[] intMax = { 10, 2, 15, 50, 46, 97, 180, 25 };
		System.out.println("Maximum value is: " + maxOFValue(intMax));

		Float[] floatMax = { 8.6f, 7.8f, 2.8f, 5.2f, 6.8f };
		System.out.println("Maximum value is: " + maxOFValue(floatMax));

		String[] stringMax = { "apple", "peach", "orange" , "bananna", "mango"};
		System.out.println("Maximum value is: " + maxOFValue(stringMax));

	}

}
