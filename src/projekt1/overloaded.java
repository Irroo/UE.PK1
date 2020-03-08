package projekt1;

public class overloaded {

	public static void main(String[] args) {
//		helper here
//		Scanner console = new Scanner(System.in);
//		System.out.println("Prosze podać cyfre do silni");
//		int input = console.nextInt();
//		console.nextLine(); //zczytanie znaku nowej lini
			//printYearsAndDays(1440);
	//printEqual(4, 5, 5);
	isCatPlaying(true, 10);
	isCatPlaying(false, 35);
	isCatPlaying(false, 36);
	}
	
	

	public static double area(double a) {
	if (a<0) return -1; else return a*a*Math.PI;
	}
	
	
	public static double area(double a, double b) {
		if (a<0||b<0) return -1; else return a*b;
	}
	
	public static void printYearsAndDays(long minutes) {
		if (minutes<0) {
			System.out.println("Invalid Value");
		}
		else {
			double yy; double dd;
			if (minutes % (60*365*24) == 0) {
				yy=minutes/(60*365*24);
			} else {
				yy=Math.floor(minutes/(60*365*24));
			}
			double minutesleft=-(yy*365*60*24-minutes);
			if (minutesleft % (60*24) == 0) {
				dd=minutesleft/(60*24);
			} else {
				dd=Math.floor(minutesleft/(60*24));
			}
		System.out.println(minutes+" min = "+Math.round(yy)+" y and "+Math.round(dd)+" d");
			
		}
	}

	public static void printEqual(int a, int b, int c) {
	if (a<0 || b<0 || c<0) {
		System.out.println("Invalid Value");
	} else if (a==b && c==b){
		System.out.println("All numbers are equal");
	} else if ((a!=b && b!=c && c!=a)) {
		System.out.println("All numbers are different");
	} else {
		System.out.println("Neither all are equal or different");
	}
	}
	
	
	public static boolean isCatPlaying(boolean summer, int temperature) {
		if (summer) {
			if (temperature>=25 && temperature<=45) {
				return true;
			}
		} else if ((temperature>=25 && temperature<=35)) {
			return true;
			}
		return false;
		}
	
}
	
	
	





