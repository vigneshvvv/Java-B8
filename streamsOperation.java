package sample;

import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOperation {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10,20,20,30,40,40);
		
		Set<Integer> result = new HashSet<Integer>();
		for(int i: numbers) {
			result.add(i);
		}

		numbers.stream().distinct().forEach(System.out::println);
		
		List<Integer> nums = numbers.stream().limit(3).collect(Collectors.toList());
		System.out.println(nums);
		
		numbers.stream().skip(2).forEach(System.out::println);
		
		List<List<Integer>> nestedList = Arrays.asList(
				
				Arrays.asList(1,2,3),
				Arrays.asList(4,5,6),
				Arrays.asList(7,8,9)
				
				);
		
		for(List<Integer> ints : nestedList) {
			for(int i: ints) {
//				System.out.println(i);
			}
		}
		
//		nestedList.stream().
//		flatMap(list -> list.stream())
//		.forEach(System.out::println);
		
		long count  = numbers.stream()
				.filter(n -> n > 20).count();
		System.out.println(count);
		
		Optional<Integer> min = numbers.stream().min(Integer:: compareTo);
		System.out.println(min.get());
		
		Optional<Integer> max = numbers.stream().max(Integer:: compareTo);
		System.out.println(max.get());
		
		Optional<Integer> findFirst = numbers.stream().filter(n -> n > 20)
										.findFirst();
		System.out.println(findFirst.get());
		
		Optional<Integer> findAny = numbers.stream().filter(n -> n>20)
				.findAny();
		System.out.println(findAny.get());
		
		boolean resultN = numbers.stream().anyMatch(n -> n > 40);
		System.out.println(resultN);
		
		boolean resultF = numbers.stream().allMatch(n -> n >0);
		
		System.out.println(resultF);
		
		boolean resultB = numbers.stream().noneMatch(n -> n < 0);
		System.out.println(resultB);
		
		int sum = numbers.stream().reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		int total = 0;
		
		for(Integer i: numbers) {
			total += i;
		}
		
		System.out.println(total);
		
		List<String> names = Arrays.asList("John", "David", "Alex");
		
		String resultS = names.stream().collect(Collectors.joining(", "));
		System.out.println(resultS);
				
		
		
		
		
		
		
		
		
		
		
		
	}

}
