import java.util.*;


public class StringsPermutation {
	
	public static boolean checkIfPerm(String one, String two) {
		
		char[] ch1 = one.toCharArray();
		char[] ch2 = two.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (ch1.length != ch2.length)
			return false;
		else 
			for(int i =0; i<ch1.length; i++) {
				if(ch1[i] != ch2[i])
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
