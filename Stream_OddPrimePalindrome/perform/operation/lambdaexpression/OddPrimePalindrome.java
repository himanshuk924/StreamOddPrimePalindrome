package perform.operation.lambdaexpression;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class OddPrimePalindrome {

	static Predicate<Integer> ispalindrome() {
		Predicate<Integer> num = number -> {
			String str = number.toString();
			StringBuilder rev = new StringBuilder(str);
			return (str.equals(rev.reverse().toString()) ? true : false);
		};
		return num;
	}

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		number.add(sc.nextInt());
		Predicate<Integer> odd = ArrayList-> ArrayList%2!=0;
		Predicate<Integer> even = ArrayList-> ArrayList%2==0;
		public static Predicate<Integer> isPalindrome()
		{
		Predicate<Integer> predicate=(element)->{
			return (Integer.toString(element)).equals(new StringBuilder(Integer.toString(element)).reverse().toString());
			};
		return predicate;
		}
		number.stream().filter(odd).forEach(i->System.out.println("true"));
		number.stream().filter(even).forEach(i->System.out.println("false"));
		number.stream().filter(PerformOperation.isPalindrome()).forEach(System.out::println);
	}
}
