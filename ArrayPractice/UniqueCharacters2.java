import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class UniqueCharacters2 {
	
	public static boolean checkUnique(String word) {
		
		int[] binmap = new int[256] ;
		
		for(int i=0; i< word.length(); i++) {
			
			binmap[word.charAt(i)] = 0;
		}
		
		for(int i=0; i< word.length(); i++) {
			
			binmap[word.charAt(i)] ++;
		}
		
		
		
		for(int i=0; i< word.length(); i++) {
			if(binmap[word.charAt(i)] > 1)
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
