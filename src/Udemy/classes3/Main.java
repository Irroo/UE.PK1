package Udemy.classes3;

public class Main {
	
	public static void main(String[] args) {

		
		
		Account kontoMarka = new Account(12,1100,"Marek","marek@gmail.com","69404444");
		
		Account konto = new Account();
		konto.setBalance(1000);
		konto.setName("Adam");
		System.out.println("konto"+konto.getBalance());
		System.out.println("wplacam 300");
		konto.wplata(300);
		System.out.println("konto"+konto.getBalance());
		System.out.println("wyplata 1000");
		konto.wyplata(1000);
		System.out.println("konto"+konto.getBalance());
		System.out.println("wyplata 2000");
		System.out.println("wyplacono" + konto.wyplata(2000));
		System.out.println("konto"+konto.getBalance());
		
	}
}
