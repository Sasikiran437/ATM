package ATMCustomeException;

public class DepositAmountException extends RuntimeException{
	@Override
	public String toString() {
		return getClass()+" , Ivalide deposite amount";
	}

}
