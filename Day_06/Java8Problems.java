package Day_06;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Problems {
	public static void main(String[] args) {

		List<Integer> arr = Arrays.asList(1,25,50,42,42,78,98,166);
		arr.stream().filter(e-> e%2==0).forEach(System.out::println);
		System.out.println();
		/*Elements starts with 1*/
		arr.stream().map(e -> e+"").filter(e-> e.startsWith("1")).forEach(System.out::println);
		System.out.println();
		arr.stream().map(e -> e+"").filter(e-> e.startsWith("1")).collect(Collectors.toList()).forEach(System.out::println);

		/*duplicate in array*/
		System.out.println();
		HashSet<Integer> set = new HashSet<>();
		arr.stream().filter(e -> !set.add(e)).forEach(System.out::println);/*here !set.add()-> means
		in set it will store 1 elem then it give true & if we add duplicate then it will give false*/

		/*Find first element*/
		System.out.println();
		int first  = arr.stream().findFirst().orElse(0);
		System.out.println(first+" ");

		/*Count numbers of elem in array*/
		System.out.println();
		System.out.println(arr.stream().distinct().count());

		System.out.println();
		Integer maximum_elem = arr.stream().max((o1,o2) -> o1.compareTo(o2)).get();
		System.out.println(maximum_elem+" ");

		/*Non repeating char in this string*/
		System.out.println();
		String str ="Java Articales are boring";
		Character charac = str.chars().mapToObj(c -> (char) c).filter(e -> str.indexOf(e) == str.lastIndexOf(e))
				.findFirst().get();
		System.out.println(charac);

		/*find First repeated char in string*/
		Character character = str.chars().mapToObj(c -> (char) c).filter(e -> str.indexOf(e) != str.lastIndexOf(e))
				.findFirst().get();
		System.out.println(character);

		/*Sorted in list*/
		System.out.println();
		arr.stream().distinct().sorted().forEach(System.out::println);

		/*Reverse a list*/
		System.out.println();
		List<Integer> reverse = arr.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.print(reverse);

		/*Array size is equal or not*/
		System.out.println();
		int reduced_size = arr.stream().distinct().collect(Collectors.toList()).size();
		System.out.println(reduced_size != arr.size());

		/*Element cube greater than 50*/
		System.out.println();
		arr.stream().map(e -> e*e*e).filter(e -> e > 50).forEach(System.out::println);;

		/*Frequency of characters*/
		System.out.println();
		String s = "abacdadbc";
		Map<Character, Long> frequencyNum = s.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(frequencyNum);

		/*Find duplicates and with its count*/
		System.out.println();
		List<String> names = Arrays.asList("1AA", "2BB", "AA", "CC");
		names.stream().filter(e -> Collections.frequency(names, e)>1)
		.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
		.forEach((string,count) -> System.out.println(string +"===>"+ count));

		/*Seperate odd and even numbers*/
		Map<Boolean, List<Integer>>  evenAndodd = arr.stream().collect(Collectors.partitioningBy( i -> i%2 == 0));
		System.out.println(evenAndodd);

		/*Multiple of 5*/
		System.out.println();
		List<Integer> mulipleOfFive = arr.stream().filter(i -> i%5 == 0).collect(Collectors.toList());
		System.out.print(mulipleOfFive);

		/*Merge two unsorted arrays*/
		System.out.println();
		List<Integer> arr1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> arr2 = Arrays.asList(6, 7, 3, 9, 10);

		Stream<Integer> s1 = arr1.stream();
		Stream<Integer> s2 = arr2.stream();

		List<Integer> mergedArray = Stream.concat(s1,s2).collect(Collectors.toList());
		System.out.println(mergedArray);

		/*3 Max & Min numbers in arrays*/
		System.out.println();
		arr.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

		/*Min*/
		System.out.println();
		arr.stream().sorted().limit(3).forEach(System.out::println);

		/*Sum & Average in arrays*/
		System.out.println();
		int a[] = {4,6,7,2,1,9};
		OptionalDouble averageElem = Arrays.stream(a).average();
		System.out.println(averageElem);

		int SumElem = Arrays.stream(a).sum();
		System.out.println("Sum is :"+SumElem);

		/*Reverse an integer array*/
		System.out.println();
		int[] reverseArray = IntStream.range(0, a.length).map(i -> a[a.length-1-i]).toArray();
		System.out.println(Arrays.toString(reverseArray)); /*here we are converting array to toString to display*/

		/*Palindrome string*/
		String sentence = "madam";
		boolean pali = IntStream.range(0, sentence.length()/2)
				.noneMatch(i -> sentence.charAt(i) != sentence.charAt(sentence.length()-i-1));
		System.out.println(pali);

		/*Age of Person*/
		System.out.println();
		LocalDate bithDay = LocalDate.of(2000, 04, 06);
		LocalDate today = LocalDate.now();
		System.out.println("Your age is :" + ChronoUnit.YEARS.between(bithDay, today));

		/*Sum of 10 natural numbers*/
		System.out.println();
		int sum = IntStream.range(1, 10).sum();
		System.out.println(sum);

		/*reverse a string words*/
		/*String s = "abacdadbc";*/
		String word_reverse = Arrays.stream(s.split(" ")).map(word -> new StringBuffer(word).reverse()).collect(Collectors.joining());
		System.out.println(word_reverse);

		/*Second largest number in array*/
		System.out.println();
		Integer second = arr.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst().get();
		System.out.println(second);

		/*Anagram string*/
		System.out.println("-----");
		String str1 = "care";
		String str2 = "race";

		str1 = Stream.of(str1.split("")).map(String :: toUpperCase).sorted().collect(Collectors.joining());
		String collect2 = Stream.of(str2.split("")).map(String :: toUpperCase).sorted().collect(Collectors.joining());		
		Boolean option=Optional.ofNullable(str1).map(e ->e.equals(collect2)).get();
		System.out.println("Anagram ? :"+option);
		//		if(str1 == str2) {
		//			System.out.println("is anagaram");
		//		}
		//		else {
		//			System.out.println("not a anagaram");
		//		}

		/*Common Elements in 2 arrays*/
		System.out.println("-------");
		arr1.stream().filter(arr2::contains).forEach(System.out::println);

		/*Find Strings which starts with number*/
		names.stream().filter(string -> Character.isDigit(string.charAt(0))).forEach(System.out::println);

		/*Sum of all digits*/
		System.out.println();
		int num = 11143423;
		int total_digit = Stream.of(String.valueOf(num).split(""))
				.collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(total_digit);

		/*Fiboonacci Series*/
		System.out.println();
		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1], f[0] + f[1] }).limit(10)
		.map(f -> f[0]).forEach(i -> System.out.print(i+" "));

		/*Last elem of an array*/
		System.out.println();
		int last_elem = arr.stream().skip(arr.size()-1).findFirst().get();
		System.out.println("last element is :"+last_elem);
		
		/*Any*/
		System.out.println("**********");
		int demo = arr.stream().sorted(Comparator.reverseOrder()).distinct().skip(5).findFirst().get();
		System.out.println(arr);
		System.out.println("This is demo :" + demo);
		
		/*Preffix , suffix*/
		System.out.println();
		String pref = names.stream().collect(Collectors.joining("," , "prefix ", "Suffix "));
		System.out.println(names);
		System.out.println();
		System.out.println(pref);

	}


}
