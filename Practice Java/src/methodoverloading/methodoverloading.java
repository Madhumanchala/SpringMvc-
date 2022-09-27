package methodoverloading;

public class methodoverloading {

	public int add(int a,int b)
	{
		return a+b;
	}  
	public int add(int a,int b,int c)
	{
		return a+b+c;
		}  
	 
	public double multiply(double a,double b)
	{
		return (a*b);
	}  

	public static void main(String[] args)
	{  
		methodoverloading ob=new methodoverloading();
	System.out.println(ob.add(2,10));  
	System.out.println(ob.add(3,2,5));  
	System.out.println(ob.multiply(2,10)); 

	}}
