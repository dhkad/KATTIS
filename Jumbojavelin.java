package jumbojavelin_dh;
import java.util.Scanner;


public class Jumbojavelin {

	public static void main(String[] args) {
	int sum = 0;	
	Scanner input = new Scanner(System.in);
	int n =input.nextInt();
	
	if (n>1 && n<=100) {
		for(int i=0; i<n;i++) {
			int l= input.nextInt();
			if (l>=1 && l<=50) {
				sum+=l;
			}
		}
		input.close();
		int tot=sum-(n-1);
		System.out.println(tot);
	}
	input.close();
	
	}
}

