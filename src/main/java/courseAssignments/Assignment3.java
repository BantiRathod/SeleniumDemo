package courseAssignments;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		System.out.println("Enter n ele with comma seperated");
		String f = sc.next();
		System.out.println("Enter again n ele with comma seperated");
		String s = sc.next();
		
		char []a = f.toCharArray();
		char []b = s.toCharArray();
		
		int c[] = new int[n];
		
		int j=0;
		for(int i=0; i<a.length; i+=2)
		{
			c[j++] = (a[i]-'0')*(b[i]-'0'); 
		}
		
		int sum=0;
		for(int i =0 ; i<n; i++)
			sum+=c[i];
		
		System.out.println("sum is: "+sum);
		
	}

}
