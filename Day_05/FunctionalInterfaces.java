package Day_04;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaces {
	
	/*Method-1*/
	public static boolean isCheckAge(int age) {
		if(age>18) {
			return true;
		}
		return false;
		
	}
	
	/*Method for Function Interface*/
	public static int addList(List<Integer> list) {
		return list.stream().mapToInt(Integer::intValue).sum();
	}
	
	
	/*Method -1 Consumer. Here it is accepting value*/
	public static void printText(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		Predicate<Integer> pred = FunctionalInterfaces::isCheckAge;
		boolean res = pred.test(17);
		System.out.println(res);
		
		/*Method-2*/
		Predicate<Integer> pr = x -> (x>18);
		boolean result = pr.test(25);
		System.out.println(result);
		
		/*Consumer --> only one abstract() i.e accept()*/
		Consumer<String> cons = FunctionalInterfaces::printText;
		cons.accept("Hello...");
		
		/*Function Interface*/
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(80);
		
		Function<List<Integer>, Integer> fun = FunctionalInterfaces::addList;
		/*Here in Function it will take 2 parameter.
				1 is input and another is Return type*/
		int rs = fun.apply(list);
		System.out.println(rs);
		
		
		/*Supplier --> it will supply. & having a single abstract() i.e get()*/
		 Supplier<Integer> randomNumberSupplier = () -> (int) (Math.random() * 100);
		 int randomNum = randomNumberSupplier.get();
		 System.out.println("some random Number is:"+ randomNum);
		
		 /*For time*/
		 Supplier<LocalTime> time = LocalTime::now ;
		 System.out.println(time.get());
		 
		 
	}

}
