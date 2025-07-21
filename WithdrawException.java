package ATMCustomeException;

public class WithdrawException extends RuntimeException {
	
	public String toString() {
		return getClass()+" ,inavlid balance entered";
	}

}
