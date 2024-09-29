import java.util.Scanner;
import java.util.Arrays;
public class Programmes {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Boolean arr[] = new Boolean[2*n+1];
		Arrays.fill(arr, true);
		arr[0] = false;
		arr[1] = false;
		
		for(int i=2; i<Math.sqrt(2*n); i++) {
			for(int j=i; j<=2*n; j+=i) {
				arr[j] = false;
			}
		}
		
		int count =0;
		for(int i=n+1; i<2*n; i++) {
			if(arr[i]) {
				count+=1;
			}
		}
		if(count==0) {
			System.out.println("존재하지 않습니다");
		}else {
			System.out.println(count);
			}
		
	
		
		sc.close();
	}

}
