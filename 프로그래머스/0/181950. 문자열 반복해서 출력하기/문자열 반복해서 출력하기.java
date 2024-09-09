import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    	
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int b = sc.nextInt();
    if(1<= a.length() && a.length()<=10) {
    	if(1<=b  && b<=5) {
    		System.out.println(a.repeat(b));
    		
    	}
    }
    
}
    
}