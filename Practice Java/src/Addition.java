import java.util.Scanner;

public class Addition {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);

	 int a,b,c = 0;
	 char ch;
	 
	 System.out.println("Enter a Number ");
	 a=sc.nextInt();
	 System.out.println("Enter second Number ");
	 b=sc.nextInt();
	 
	 System.out.println("Enter an operator (+, -, *, /): ");
	 ch =sc.next().charAt(0);
	 if(ch == '+')  c= a+b;
	 else if(ch == '-') c=a-b;
	 else if(ch == '*') c=a*b;
	 else if(ch == '/') c=a/b;
	 else {
		 System.out.println("Invalid input");
	 }
	 System.out.println("Result is :"+c);
 }
}
