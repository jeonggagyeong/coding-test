import java.util.Scanner;
public class Programmes {
	
	private static int gcd(int a, int b) {
		if(a%b==0) {
			return b;
		}else {
			return gcd(b,a%b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[100];
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int first = arr[0];
		for(int i=1; i<n; i++) {
			first = gcd(first,arr[i]);
		}
		System.out.println(first);
		
		
		sc.close();
	}

}
