import java.util.*;
public class URLify {
	
	public static String urlify(String inp, int n) {
		
		char[] ch = inp.toCharArray();
		
		int spaces = 0;
		for(int i=0; i<n; i++) {
			if(ch[i] == ' ') {
				spaces++;
			}
		}
		
		int length = n + spaces*2;
		int index = length -1;
		for(int i = n-1; i>=0; i--) {
			if(ch[i] == ' ') {
				ch[index] = '0';
				ch[index - 1] = '2';
				ch[index - 2] = '%';
				index = index - 3;
			}
			else {
				ch[index] = ch[i];
				index--;
			}
		}
		
		String res = String.copyValueOf(ch);
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String inp = sc.nextLine();
		int n = sc.nextInt();
		
		String res = urlify(inp, n);
		
		System.out.println("output: " + res);
	}

}
