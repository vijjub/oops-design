
public class AccountsReceivable {

	private Receivable transaction;

	public AccountsReceivable(Receivable transaction) {
		this.transaction = transaction;
	}
	
	public void getName() {
		
		transaction.getName();
		
	}
	
	public void getProductBreakdown() {
		
		transaction.getProductBreakdown();
	}
	
	public void chargeCustomer() {
		transaction.chargeCustomer();
	}
}
