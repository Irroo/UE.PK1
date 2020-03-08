package Udemy.classes3;

public class Account {

	private double balance;
	private double number;
	private String name;
	private String email;
	private String phoneNumber;
	
	//if empty is called then 
	public Account() {
		this(12345,12000,"Default_user","example@example.com","694058745");
		System.out.println("Empty constructor called");
		
	}
	
	public Account(double number, double balance, String name, String email, String phoneNumber) {
		this.balance=balance;
		this.number=number;
		this.email= email;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}
	
	
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void wplata(double kwota) {
		this.balance+=kwota;
	}
	public double wyplata(double kwota) {
		if (this.balance<kwota) return 0;
		this.balance-=kwota;
		return this.balance;
		
	}
	
}
