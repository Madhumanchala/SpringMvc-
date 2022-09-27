package Atmcorejavaproject;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {
	
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,###,00");
	
	HashMap<Integer, Integer> data=new HashMap<Integer, Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(23654, 987456);
				data.put(125365, 985645);

				System.out.println("Welcome to the ATM project");
				System.out.println("Enter your consumer number ");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your PIN  number ");
				setPinNumber(menuInput.nextInt());
			}
			catch(Exception e) {
				System.out.println("\n" + "Invalid charactors .Only numbers. "+"\n");
				x = 2;
			}
			
			int cn =getCustomerNumber();
			int pn =getPinNumber();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else
				System.out.println("/n" + "Wrong customer number and pin number" + "/n");
		} while(x == 1);
			}
			
			
			
	
			public void getAccountType() {
				System.out.println("Select the account you want access:");
				System.out.println("Type 1 - Checking account");
				System.out.println("Type 2 - Saving account");
				System.out.println("Type 3 - Exit");
				
				int selection=menuInput.nextInt();
				
				switch(selection) {
				case 1:
					getChecking();
					break;
					
				case 2:
					getSaving();
					break;
					
				case 3:
					System.out.println("thank you for using this atm bye, \n");
					break;
					
				default:
					System.out.println("\n" + "Invalid Choice" + "\n");
					getAccountType();
				
				}
			}
			
			public void getChecking() {
				System.out.println("Checking account:");
				System.out.println("Type 1 - View balance ");
				System.out.println("Type 2 - Withdraw Funds  ");
				System.out.println("Type 3 - Deposit Method ");
				System.out.println("Type 4 - Exit ");
				System.out.println("Choice: ");
				
				int selection=menuInput.nextInt();
				
				switch(selection) {
				case 1:
					System.out.println("Checking account balance :" + moneyFormat.format(getCheckingBalance()));
					getAccountType();
					break;
					
				case 2:
					getCheckingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getCheckingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank you for using this atm bye.");
					break;
				
				default :
					System.out.println("/n" + "Invalid Choice" + "/n");
					getChecking();		
				}
			}
			
			public void getSaving() {
				System.out.println("Saving cacount");
				System.out.println("Type 1 - View balance ");
				System.out.println("Type 2 - Withdraw Funds  ");
				System.out.println("Type 3 - Deposit Method ");
				System.out.println("Type 4 - Exit ");
				System.out.println("Choice: ");
				
				int selection=menuInput.nextInt();
				
				switch(selection) {
				case 1:
					System.out.println("Saving account balance :" + moneyFormat.format(getSavingBalance()));
					getAccountType();
					break;
					
				case 2:
					getSavingWithdrawInput();
					getAccountType();
					break;
					
				case 3:
					getSavingDepositInput();
					getAccountType();
					break;
					
				case 4:
					System.out.println("Thank you for using this atm bye.");
					break;
				
				default :
					System.out.println("/n" + "Invalid Choice" + "/n");
					getChecking();		
				}
			}
			
		
	

}
