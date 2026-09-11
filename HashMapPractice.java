package sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
	public static void main(String[] args) {
		
		Map<Integer, String> data = new HashMap<Integer, String>();
		data.put(1, "Deva");
		data.put(2, "Sathish");
		
		if(data.get(3) != null) {
			System.out.println(data.get(3));
		}
			
		data.put(2, "Pradeep");
		System.out.println(data.get(2));
		
		System.out.println(data.containsKey(4));
		System.out.println(data.containsValue("Deva"));
		data.remove(2);
		System.out.println(data);
		
		System.out.println(data.size());
		
		System.out.println(data.isEmpty());
		
		System.out.println(data.getOrDefault(2, "NotFound"));
		
		data.putIfAbsent(2, "Vignesh");
		System.out.println(data);
		
		System.out.println(data.keySet());
		System.out.println(data.values());
		
		for(Integer key: data.keySet()) {
			System.out.println(key);
		}
		
		for(Map.Entry<Integer, String> entry: data.entrySet()) {
			System.out.println(entry.getKey() + "_" + entry.getValue());
		}
		
		
		
		
		
		
		
		
		
	}

}
