package projekt1;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class InvoiceInfo {

	public static void main(String[] args) {
		//rob_cos();
		Scanner console = new Scanner(System.in);
		System.out.println("Wprowadź liczbe faktur:");
		int N_Invoices = console.nextInt();
		console.nextLine();
		double[] InvoiceValues = new double[N_Invoices];
		for (int i = 0; i < Array.getLength(InvoiceValues); i++) {
			System.out.println("Wprowadź wartosc faktury nr "+(i+1));
			InvoiceValues[i] = console.nextInt();
			console.nextLine();
		}
		console.close();	

		//outputs
		System.out.println("Całkowita kwota do zapłaty: "+Arrays.stream(InvoiceValues).sum()+" zł");
		System.out.println("Średnia wartość faktury: "+Arrays.stream(InvoiceValues).average().orElse(Double.NaN)+" zł");
	}
	
//fake koment

}




