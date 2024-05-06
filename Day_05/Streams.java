package Day_04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(1,2,4,3,5);
		List<Integer> l2 = Arrays.asList(6,7,3,9,1);
		
		Optional<Integer> first = l1.stream().filter(ele -> ele%2==0).findFirst();
		System.out.println(first);/*if no elements are occurred*/
		
		Stream<Integer> s1 = l1.stream();
		Stream<Integer> s2 = l2.stream();
		
		/*concating 2 streams1*/
		List<Integer> res = Stream.concat(s1, s2).collect(Collectors.toList());
		System.out.println(res);
		
		res.stream().distinct().forEach(System.out::print);
		
		
	}

}
