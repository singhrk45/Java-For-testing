
// overriding

package Oops;

public class CalcInterest {

	public static void main(String[] args) {
		
		AX am = new AX();
		BankOfA boa = new BankOfA();
		IciciBank ib = new IciciBank();
		
		System.out.println(am.getInterest());
		System.out.println(boa.getInterest());
		System.out.println(ib.getInterest());
		
	}

}
