package LogicalPrograms;

public class ArmstrongNumber {
	
	public static void main(String[] args)
	{
		int r,num=153,sum=0,temp=0;
		temp=num;
		while (num !=0)
		{
		r=num%10;
		sum=sum+r*r*r;
		num=num/10;
	}
	if(sum==temp)
	{
		System.out.println("Arsmtsromnnum ");
	}
	else {
		System.out.println("not armstrong num");
	}

}
	}
