import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String ans = "";
		
		for(int i=0; i<a.length(); i++){
			char b = a.charAt(i);
			
			if(Character.isUpperCase(b)){
				ans += Character.toLowerCase(b);
			}
			if(Character.isLowerCase(b)){
				ans += Character.toUpperCase(b);
			}
		}
		System.out.println(ans);
		
	}

}
