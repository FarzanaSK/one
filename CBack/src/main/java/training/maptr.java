package training;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class maptr {

	public static void main(String[] args) {

		Map<String,Integer> mp = new LinkedHashMap<>();
		
		mp.put("Farzana", 100);
		mp.put("Sheik",101);
		mp.put("Zia", 102);
		mp.put("Arshaan", 103);
		
		System.out.println(mp.get("Farzana"));
		System.out.println(mp);
		
		
		mp.put("Farzana", 123);
	
		System.out.println(mp);
		
		for(Entry<String,Integer> entryset:mp.entrySet())
		{
			
		}
		mp.keySet().iterator();
		
	}

}
