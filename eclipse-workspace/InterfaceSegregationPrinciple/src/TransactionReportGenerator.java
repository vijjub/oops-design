
public class TransactionReportGenerator {
	
	private ReportGenerator transaction;
	
	public TransactionReportGenerator(ReportGenerator aTransaction) {
		this.transaction = aTransaction;
	}
	
	
	public void getDate() {
		transaction.getDate();
	}
	
	public void prepareInvoice() {
		transaction.prepareInvoice();
	}

}
