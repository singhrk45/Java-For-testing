package Oops;

public class ICICIBankLoan extends BankLoan{

	public static void main(String[] args) {
		BankLoan loan = new BankLoan();
		
		loan.setAgee(200);
		loan.setName("Ritesh");
		loan.setAmount(1000000);
		
		System.out.println(loan.getName());
		System.out.println(loan.getAge());
		System.out.println(loan.getAmount());

	}

}
