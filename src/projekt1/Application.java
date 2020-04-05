package projekt1;

public class Application {
	
	public static void main(String[] args) {
		//Genders
		Gender m = new Gender("M");
		Gender f = new Gender("F");
		
		//Positions
		Position prezes = new Position("Prezes", 18000, 25000);
		Position dyrektor = new Position("Dyrektor", 12000, 15000);
		Position ekspert = new Position("Ekspert", 7000, 9000);
		Position starszyspec = new Position("Starszy specjalista", 5000, 7000);
		Position spec = new Position("Specjalista", 3500, 5000);
		Position mlodszyspec = new Position("Młodszy specjalista",2000,3500);
		
		//Departments
		Department zarzad = new Department("Zarząd", "4. piętro");
		Department marketing = new Department("Marketing", "3. piętro, open space", "856 94 00");
		Department sprzedaz = new Department("Sprzedaż", "2. piętro, pokoje 2.11 - 2.30", "856 70 00");
		Department ksiegowosc = new Department("Księgowość", "2. piętro, pokoje 2.1 - 2.10", "856 91 00");
		Department administracja = new Department("Adminitracja", "1. pietro", "856 80 00");
		Department it = new Department("IT", "Podziemia","856 80 00");
		
		//Employees
	
		Employee employee[] = new Employee[10];
		employee[0] = new Employee("Jan Nowak", m, 22000, 0, 1955, 1990, prezes, zarzad);
		employee[1] = new Employee("Anna Maria Mucha", f, 14000, 0, 1968, 1991, dyrektor, sprzedaz);
		employee[2] = new Employee("Karol Marek Śrubka", m, 7500, 2000, 1972, 2010, ekspert, sprzedaz);
		employee[3] = new Employee("Urszula Truczyńska", f, 5000, 1000, 1992, 2009, spec, sprzedaz);
		employee[4] = new Employee("Aniela Kornelia Natolik", f, 13000, 0, 1977, 2001, dyrektor, ksiegowosc);
		employee[5] = new Employee("Karolina Handke", f, 6800, 1500, 1985, 2017, starszyspec, ksiegowosc);
		employee[6] = new Employee("Maria Banasik", f, 4800, 1200, 1995, 2005, spec, ksiegowosc);
		employee[7] = new Employee("Adam Jan Pieczynski", m, 2600, 9000, 2000, 2020, mlodszyspec, ksiegowosc);
		employee[8] = new Employee("Tomasz Michał Głuszek", m, 8000, 2000, 1990, 2011, ekspert, it);
		employee[9] = new Employee("Klara Matecka", f, 15000, 0, 1983, 2014, dyrektor, it);
	
		//printouts for employee business method
		for (int i = 0; i < employee.length; i++) {
			printOutEmployee(employee[i]);
		}
		
		//printouts for Department business method
		printDepartments(zarzad);
		printDepartments(marketing);
		printDepartments(sprzedaz);
		printDepartments(ksiegowosc);
		printDepartments(administracja);
		printDepartments(it);
	
		//Fool proof testing constructor and setter (salary ranges validation)
		Employee employeeToLowSalary = new Employee("Jan Kowalski", m, 300, 50, 1999, 2020, spec, it);
		Employee employeeToHighSalary = new Employee("Anna Kowalska", f, 30000, 0, 1999, 2020, ekspert, sprzedaz);
		printOutEmployee(employeeToLowSalary);
		printOutEmployee(employeeToHighSalary);
		employee[1].setSalary(999);
		employee[7].setSalary(9999);
	
	}
	
			
	public static void printOutEmployee(Employee a) {
	String printout = "Full name: "+a.getFullName()+", Full name as one string: "+a.getFullNameAsOneString()
	+", Hire period: "+a.getHirePeriod()+", Age: "+a.getAge()+", Years to retire: "+a.getYearsToRetire()
	+", Payment gross: "+a.getPaymentGross()+", Payment Net:"+a.getPaymentNet();
	System.out.println(printout);
	}
	
	public static void printDepartments(Department a) {
		System.out.println(a.getFullInfo());
	}
	
}
