import java.util.*;


public class UniqueCharacters {
	
	public static boolean checkUnique(String word) {
		
		Map < Character, Integer> map = new HashMap<> ();
		
		for(int i=0; i< word.length(); i++) {
			
			map.put(word.charAt(i), 0);
		}
		
		for(int i=0; i< word.length(); i++) {
			
			map.put(word.charAt(i), map.get(word.charAt(i))+1);
		}
		
		
		for(int i=0; i< word.length(); i++) {
			
			System.out.println(word.charAt(i) + ""+ map.get(word.charAt(i)));
			
			//map.put(word.charAt(i), map.get(word.charAt(i)+1));
		}
		
		for(int i=0; i< word.length(); i++) {
			if(map.get(word.charAt(i)) > 1)
				return false;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String word = sc.next();
		boolean check = checkUnique(word);
		
		if(check)
			System.out.println("unique characters");
		else
			System.out.println("not unique characters");

	}

}
