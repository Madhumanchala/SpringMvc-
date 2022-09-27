package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String args[]) {
	int no;
	int rev=0,rem;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter to check number palindrome or not  ");
	no=sc.nextInt();
	int temp=no;
	while(temp !=0) {
		rem=temp%10;
		rev=rev*10+rem;
		temp=temp/10;
	}
	if(no==rev)
	{
		System.out.println(no+ " is palindrome ");
	}
	else
	{
		System.out.println(no+ " not palindrome ");
	}
}
}