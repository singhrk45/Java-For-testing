package Oops;

public class BankLoan {
	
	private String name;
	private int age;
	private int amount;
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAgee(int age) {
		if(age >= 18 && age<= 50) {
		this.age = age;}
		else {
			System.out.println("enter the valid age");
		}
		
	}
	
	public void setAmount(int amount) {
		if(amount >= 1000 || amount<= 1000000){
		this.amount = amount;}
		else {
			System.out.println("enter the vallid amount");
		}
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAmount() {
		return amount;
	}
	

}
