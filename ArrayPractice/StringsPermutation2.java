import java.util.*;


public class StringsPermutation2 {
	
	public static boolean checkIfPerm(String one, String two) {
		
		if (one.length() != two.length())
			return false;
		
		Map <Character, Integer> map = new HashMap<>();
		
		
		char[] ch1 = one.toCharArray();
		char[] ch2 = two.toCharArray();
		
		for(int i =0; i< ch1.length; i++) {
			if(map.containsKey(ch1[i])) {
				int v = map.get(ch1[i]);
				map.put(ch1[i], v+1);
			}
			else
				map.put(ch1[i], 1);
		}
		
		/* for (Character k : map.keySet()) {
			System.out.println(k + "" + map.get(k));	
		} */
		
		for(int i =0; i< ch1.length; i++) {
			if(map.containsKey(ch2[i])) {
				int v = map.get(ch2[i]); 
				if (v == 0)
					return false;
				v--;
				map.put(ch2[i], v);
			}
			else
				return false; //if a character is not present in one
		}
		
		for (Character k : map.keySet()) {
			System.out.println(k + "" + map.get(k));	
		}
		
		//Set keys = map.keySet();
		for (Character k : map.keySet()) {
			if(map.get(k) != 0)
				return false;	
		}
		
		
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String one");
		String one = sc.next();
		System.out.println("Enter String one");
		String two = sc.next();
		
		boolean check = checkIfPerm(one, two);
		
		if(check)
			System.out.println("true");
		else
			System.out.println("false");
		
		

	}

}
