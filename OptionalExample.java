package sample;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class OptionalExample {

	public static void main(String[] args) {
//		String name = null;
//		System.out.println(name.toUpperCase());
		
//		Info intro = new Info();
//		System.out.println(intro.getInfoNew().getId());
		
		Optional<String> name = Optional.of("Vignesh");
		
		if(name.isPresent()) {
			System.out.println("Value exist");
		}
		
		name.ifPresentOrElse(n -> System.out.println("Name: "+n), 
				() -> System.out.println("No Name"));
		
		Optional<String> name1 = Optional.empty();
		String result = name1.orElse("John");
		System.out.println(result);
		
		Info info = new Info();
		info.setId(1);
		info.setName("Rahul");
		
//		String name2 = info.
		
//		OptionalInt result1 = IntStream.of(10,20,30).filter(n -> n > 100).findFirst();
		
		OptionalInt result1 = IntStream.of(10,20,30).filter(n -> n > 100).findFirst();
		
		if(result1.isPresent()) {
			System.out.println("present");
		}else {
			System.out.println("Not Found");
		}
		
		String data = null;
		Optional.ofNullable(data).orElseGet(() -> {  System.out.println("Null data");
				
				return null;
				});
	

	}

}
