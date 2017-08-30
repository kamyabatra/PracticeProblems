import java.lang.reflect.Array;
import java.util.Arrays;

public class StringEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String one = "red";
		String two = "der";
		
		char[] ch = one.toCharArray();
		
		Arrays.sort(ch);
		
		for(int i =0; i<one.length(); i++) {
			System.out.println(ch[i]);
		}

	}

}
