package training;

import java.util.HashMap;
import java.util.Map;

public class charcountmap {

	public static void main(String[] args) {

		String str = "aa bbb cccc";
		int count =1;
		
		Map<Character, Integer> m = new HashMap<>();
		
		for(int i =0 ;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(m.containsKey(c))
			{
				//count=count+1;
				m.put(c, count+1);
			}
			
				m.put(c, count);
			
			
		}
		System.out.println(m);
		
	}

}
