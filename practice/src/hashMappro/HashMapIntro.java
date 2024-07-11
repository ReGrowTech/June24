package hashMappro;

import java.util.HashMap;

public class HashMapIntro {

	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap<>();
		hm.put("Asif",95);
		hm.put("shahbaz",85);
		hm.put("saqlain",96);
		hm.put("washi",75);
		
		for(String key :hm.keySet())
		{
			System.out.println(key+ "----->" + hm.get(key));
		}
	}

}
