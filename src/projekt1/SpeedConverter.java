package projekt1;

public class SpeedConverter {

	public static void main(String[] args) {
//		helper here
//		Scanner console = new Scanner(System.in);
//		System.out.println("Prosze podać cyfre do silni");
//		int input = console.nextInt();
//		console.nextLine(); //zczytanie znaku nowej lini
		
	
	
	
	//System.out.println("Wynik"	+ toMilesPerHour(100.4));
	printConversion(95.75);
	}
	
	

	public static long toMilesPerHour(double kilometersPerHour) {
		long kmph = (long) kilometersPerHour;
		if (kilometersPerHour < 0) {
			return -1;
		} else if (kilometersPerHour > 0) {
			long wynik = Math.round(kilometersPerHour/1.609);
			return wynik; 
	
			}
		return 0;
			
	
	}
	
	public static void printConversion(double kilometersPerHour) {
		if (kilometersPerHour<0) {
			System.out.println("Invalid Value");
		} else 
		System.out.println(kilometersPerHour+" km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
		
	}
	
	
	public static boolean hasEqualSum(int a, int b, int c) {
		return a+b==c;
	}
	
	public static boolean hasTeen(int a, int b, int c) {
		return ((a<=19 && a>=13)||(b<=19 && b>=13)||(c<=19 && c>=13));
	}
	
	public static boolean isLeapYear(int year) {
		if (year < 1 || year >9999) return false;
		if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ) return true;
		if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0 ) return false;
		if (year % 4 == 0 && year % 100 != 0 ) return true;
		if (year % 4 != 0 ) return false;
		return false;
	}
	
	public static boolean areEqualByThreeDecimalPlaces(double a,double b) {
	return (long) (1000*a-1000*b) == 0;
	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if (kiloBytes<0) System.out.println("Invalid Value"); 
			else { 
				if ((kiloBytes % 1024)==0) {
				//	System.out.println(kiloBytes+" KB = "+(kiloBytes/1024)+" MB and 0 KB");
				}
				System.out.println(kiloBytes+" KB = "+((kiloBytes-(kiloBytes % 1024))/1024)+" MB and "+(kiloBytes % 1024)+" KB");
			}
			
	}
	
	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if (barking && (hourOfDay==	23	|| hourOfDay==	24	||hourOfDay==	0	||hourOfDay==	1	||hourOfDay==	2	||hourOfDay==	3	||hourOfDay==	4	||hourOfDay==	5	||hourOfDay==	6	||hourOfDay==	7	)) {
			return true;
		} else {
			return false;
		}
	}
	


}




