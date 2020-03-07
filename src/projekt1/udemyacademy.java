package projekt1;
import java.util.Scanner;

public class udemyacademy {

	public static void main(String[] args) {
//		helper here
//		Scanner console = new Scanner(System.in);
//		System.out.println("Prosze podać cyfre do silni");
//		int input = console.nextInt();
//		console.nextLine(); //zczytanie znaku nowej lini
		
	
	Scanner console = new Scanner(System.in);
	System.out.println("Zapodaj cyfre");
	int input = console.nextInt();
	int cos;
	if (true) {
		 cos=input;
	}
	
	
	System.out.println("Cos ty narobil"
	+ cos);
	
	}
	

	public static int wyniksilni(int argument) {
		int iloczyn = 1;
		for (int i = 1; i <= argument; i++) {
			iloczyn = iloczyn * i;
		}
		return iloczyn;
	}
	
	




}




