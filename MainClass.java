package ATMCustomeException;
import java.util.Scanner;
public class MainClass {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ATM atm = new ATM();

	        while (true) {
	            System.out.println("\n--- ATM Menu ---");
	            System.out.println("1. Show Account Balance");
	            System.out.println("2. Deposit Amount");
	            System.out.println("3. Withdraw Amount");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            if(choice!=0) {
	                switch (choice) {
	                    case 1:
	                    	
	                        atm.showBalance();
	                        break;
	                    case 2:
	                    	
	                        System.out.print("Enter amount to deposit: ");
	                        int deposit = sc.nextInt();
	                        atm.depositAmount(deposit);
	                        break;
	                    	
	              
	                    case 3:
	                        System.out.print("Enter amount to withdraw: ");
	                        int withdraw = sc.nextInt();
	                        atm.withdrawAmount(withdraw);
	                        break;
	              
	                    	
	                    case 4:
	                        System.out.println("Thank you for using the ATM. Goodbye!");
	                        sc.close();
	                        System.exit(0);
	                    default:
	                        System.out.println("Invalid choice. Please try again.");
	     }
	            }
	                else {
	                	 new WithdrawException();
	                	 throw new DepositAmountException();
	                }
	                
	                }
	            } 
	          
	                
	            }
	        
	    
	
