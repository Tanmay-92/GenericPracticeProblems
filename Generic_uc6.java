package GenericProblems;
import java.util.Arrays;


public class Generic_uc6<K extends Comparable<K>> {
	 
		K[] Elements ;
		
		
		public void Max_Value(K[] Elements) {
			this.Elements = Elements;
		}
		
		public static <K> void printMax(K[] Elements, K max) {
			for (K element : Elements) {
				System.out.println(Elements);
			}
			System.out.printf("%d of %d is: ", max, Elements);
		}
		public static <K extends Comparable<K>> K maxOFValue(K[] Elements) {
			Arrays.sort(Elements);
			int lenght = Elements.length;
			K max = Elements[lenght - 1];
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


