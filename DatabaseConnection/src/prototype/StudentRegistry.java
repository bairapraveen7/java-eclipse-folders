package prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
	
	Map<String,Student>map = new HashMap<>();
	
	public void register(String key,Student value) {
		map.put(key,value);
	}
	
	public Student get(String key) {
		if(map.containsKey(key)) {
			return map.get(key);
		}
		return null;
	}

}
