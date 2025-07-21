package ATMCustomeException;
public class ATM {
	    private int accountBalance = 50000;

	    public void showBalance() {
	        System.out.println("Your account balance is: ₹" + accountBalance);
	    }

	    public void depositAmount(int amount) {
	        if (amount > 0) {
	            accountBalance += amount;
	            System.out.println("Deposited ₹" + amount);
	        } else {
	            throw new DepositAmountException();
	        }
	    }

	    public void withdrawAmount(int amount) throws WithdrawException {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else if (amount > accountBalance) {
	            throw new WithdrawException();
	        } else {
	            accountBalance -= amount;
	            System.out.println("Withdrawn ₹" + amount);
	        }
	    }

	    public int getCurrentBalance() {
	        return accountBalance;
	    }
	}
