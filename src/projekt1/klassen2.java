package projekt1;
import java.util.Scanner;

public class klassen2 {

	public static void main(String[] args) {
		//rob_cos();
		Scanner console = new Scanner(System.in);
		System.out.println("Prosze podać cyfre do silni");
		int input = console.nextInt();
		console.nextLine(); //zczytanie znaku nowej lini, bo inaczej zostanie w buforze po incie
		int debugujemytutaj = wyniksilni(input);
		System.out.println("wynik silni:"+wyniksilni(input));
		console.close();	
		
	}
	

	

	public static int wyniksilni(int argument) {
		int iloczyn = 1;
		for (int i = 1; i <= argument; i++) {
			iloczyn = iloczyn * i;
		}
		return iloczyn;
	}
	
	
	//to jest stary watek, z pierwszych zajec
	public static void rob_cos() {
		double[] grades = new double [17];
		grades[0] = 3;
		grades[1] = 3;
		grades[2] = 3;
		int neverusedvariable = 3;
		double[] grades2 = {3.0, 3.1, 3.2, 3.3, 5};

		for (int i = 0; i < 17; i++) {
		System.out.println("i = "+i);
		double value = grades[i];
		System.out.println("Stopień "+value);
		}

		for (int i = 0; i<grades2.length; i++) {
		System.out.println("i = "+i);
		double value = grades2[i];
		System.out.println("Stopień "+value);
		}
	}






}




