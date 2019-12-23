import java.util.*;

class IdentityHashMapDemo{
	public static void main(String []args){
		
		String str1 = new String("One");
		String str2 = new String("One");
		
		IdentityHashMap<String,String> ihm = new IdentityHashMap<String,String>();
		ihm.put(str1,"Animesh");
		ihm.put(str2,"Ani");				//Here str1 and str2 are duplicate keys but as IdentityHashMap checks reference using == operator, thus str1 and str2 are different and therefore two entries are allowed

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put(str1,"Animesh");
		hm.put(str2,"Ani");				//Here also str1 and str2 are duplicate keys but HashMap checks object content using equals() method, thus str1 and str2 are same and therefore two entries are not allowed

		System.out.println("IdentityHashMap : "+ihm);
		System.out.println(ihm.get(str1));
		System.out.println(ihm.get("One"));
		System.out.println("HashMap : "+hm);
		System.out.println(hm.get(str1));
		System.out.println(hm.get("One"));
	}
}


/*
Doubt
IdentityHashMap : {One=Ani, One=Animesh}
Animesh
null
HashMap : {One=Ani}
Ani
Ani

*/