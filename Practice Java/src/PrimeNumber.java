import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String args[]) {
	int num, temp=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Number you want to check prime or not ");
	num=sc.nextInt();
	for(int i=2;i<num;i++)
	{
		if(num%i==0)
		{
			temp=temp+1;
		}
	}
		if(temp>0)
		{
			System.out.println(num+ " Not a prime number ");
		}
		else {
			System.out.println(num+" prime number ");
	}
}}