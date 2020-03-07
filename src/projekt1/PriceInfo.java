package projekt1;
import java.util.Scanner;

public class PriceInfo {

	public static void main(String[] args) {
		double Price = 560;
		Scanner console = new Scanner(System.in);
		boolean UserAsks = true;
		while(UserAsks) {
			System.out.println("Zamawiana liczba sztuk: ");
			int NoOfProducts = console.nextInt();
			console.nextLine();
			PrintReport(Price,NoOfProducts);
			System.out.println("Czy zakończyć (t/n)?");
			String YesNoAnswer = console.nextLine();
			UserAsks = (YesNoAnswer.charAt(0)!="t".charAt(0));
			//UserAsks = YesNoAnswer!="t";
		}
		console.close();		
		System.out.println("Dziękujemy za współpracę!");
	}

	
	
	
	public static int PrintReport (double Price, int NoOfProducts) {
		double Discount = CalculateDiscount(NoOfProducts);
		double Value = Price*NoOfProducts;
		double DiscountValue = Discount*Value;
		double PriceToPay = Value-DiscountValue;
		System.out.println("Zamówiona liczba sztuk: " + NoOfProducts);
		System.out.println("Katalogowa wartość zamówienia: " + Value +" zł");
		System.out.println("Rabat: " + DiscountValue+" zł");
		System.out.println("Wartość zamówienia po rabacie: " + PriceToPay+" zł");
		return 0;
	}

	
	public static double CalculateDiscount(int NoOfProducts) {
		 if (NoOfProducts>=1 && NoOfProducts <= 100) return 0;
		 if (NoOfProducts>=101 && NoOfProducts <= 500) return 0.05;
		 if (NoOfProducts>=501 && NoOfProducts <= 1000) return 0.07;
		 if (NoOfProducts>=1001) return 0.12;
		 return 1;
	}
	
//fake comment
}




