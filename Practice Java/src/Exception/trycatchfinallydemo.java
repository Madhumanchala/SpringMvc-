package Exception;

import java.util.ArrayList;
import java.util.List;

public class trycatchfinallydemo {
	
	    public static void main (String[] args)
	    {
	         
	        // array of size 4.
	        int[] arr = new int[4];
	         
	        try
	        {
	            int i = arr[4];
	                 
	            // this statement will never execute
	            // as exception is raised by above statement
	            System.out.println("Inside try block");
	        }
	         
	        // not a appropriate handler
			
			 catch(ArrayIndexOutOfBoundsException ex) {
			  System.err.println("Caught ArrayIndexOutOfBoundsException: "+ex.getMessage());
			  }
			 
	         
	        finally
	        {
	            System.out.println("finally block executed");
	        }
	         
	        // rest program will not execute
	        System.out.println("Outside try-catch-finally clause");
	    }
	}


