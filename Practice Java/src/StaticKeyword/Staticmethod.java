package StaticKeyword;

public class Staticmethod {
	 
	     int rollno;  
	     String name;  
	     static String college = "ITS";  
	     
	     //static method to change the value of static variable  
	     static void change(){  
	     college = "BBDIT";  
	     }  
	     
	     //constructor to initialize the variable  
	     Staticmethod(int r, String n){  
	     rollno = r;  
	     name = n;  
	     }  
	     //method to display values  
	     void display(){System.out.println(rollno+" "+name+" "+college);}  

	//Test class to create and display the values of object  
	    public static void main(String[] args){  
	    Staticmethod.change();//calling change method  
	    //creating objects  
	    
	    Staticmethod s1 = new Staticmethod(111,"Karan");  
	    Staticmethod s2 = new Staticmethod(222,"Aryan");  
	    Staticmethod s3 = new Staticmethod(333,"Sonoo");  
	    //calling display method  
	    s1.display();  
	    s2.display();  
	    s3.display();  
	    }  

}
