import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int ans[] = new int[100];
		int res[] = new int[100];
		if(m==1 || n==1) {
			
			System.out.println(Math.min(m,n));
			System.out.println(Math.max(m,n));
		}else {
			
			for(int i=2; i<=Math.min(m,n); i++) {
				while(n%i==0 && m%i==0) {
					n = n/i;
					m = m/i;
					ans[count] = i;
					res[count] = i;
					count+=1;
				}
				res[count] = n;
				res[count+1] = m;
	}
			
			int result = 1 ,answer = 1;
			for(int i=0; i<count; i++) {
				answer = answer * ans[i];
			}
			for(int i=0; i<=count+1; i++) {
				result = result * res[i];
			}
		
			System.out.println(answer);
			System.out.println(result);
		}

		
		
		sc.close();
	}

}
