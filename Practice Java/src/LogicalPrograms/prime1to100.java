package LogicalPrograms;
import java.util.Scanner;

public class prime1to100 {
	
	public static void main(String args[]) {
	
	
	System.out.println("Prime NUmbers from 1 to 100 ");
	
	for(int num=1;num<=100;num++) {
		int temp=0;
	  for(int i=2;i<num;i++)
	        {
		if(num%i==0)
		{
			temp=temp+1;
		}
	         }
		if(temp==0)
		{
			System.out.println(num);
		}
		else {
			temp=0;
		}
	}
}}