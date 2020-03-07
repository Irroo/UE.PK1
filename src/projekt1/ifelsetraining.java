package projekt1;
import java.util.Scanner;

public class ifelsetraining {

	public static void main(String[] args) {
		//helper here
		//Scanner console = new Scanner(System.in);
		//System.out.println("Prosze podać cyfre do silni");
		//int input = console.nextInt();
		//console.nextLine(); //zczytanie znaku nowej lini
		
	
	Scanner console = new Scanner(System.in);
	System.out.println("Zapodaj cyfre");
	int input = console.nextInt();
	String jakaliczba;
	if (input <0 ) {
		jakaliczba ="ujemna";
	} else if (input == 0) {
		jakaliczba = "neutralna";
				} else {
					jakaliczba="dodatnia";
				}
	
	
	System.out.println("Twoja liczba jest "
	+ jakaliczba);
	
	}
	

	public static int wyniksilni(int argument) {
		int iloczyn = 1;
		for (int i = 1; i <= argument; i++) {
			iloczyn = iloczyn * i;
		}
		return iloczyn;
	}
	
	




}




