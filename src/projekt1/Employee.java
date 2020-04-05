package projekt1;



public class Employee {
	private String fullName;
	private Gender gender;
	private double salary;
	private double bonus;
	private int birthYear;
	private int hireYear;
	private Position position;
	private Department department;
	
	
	//constructor
	public Employee(String fullName, Gender gender, double salary, double bonus, int birthYear, int hireYear,
			Position position, Department department) {
		super();
		this.fullName = fullName;
		this.gender = gender;
		this.salary = salary;
		this.bonus = bonus;
		this.birthYear = birthYear;
		this.hireYear = hireYear;
		this.position = position;
		this.department = department;
		if (this.salary <  this.position.getMinSalary()) {  
			this.salary = this.position.getMinSalary();
			System.out.println("Wartość pensji poniżej dolnej wartości widełek, przyjęto wartość: "+this.salary);
		}
		if (this.salary > this.position.getMaxSalary()) {
			this.salary = this.position.getMaxSalary();
			System.out.println("Wartość pensji powyżej górnej wartości widełek, przyjęto wartość: "+this.salary);
		}
	}
	//Business method
	public String getFullNameAsOneString() {
		return this.fullName.replaceAll("\\s+","");
	}
	 
	public int getHirePeriod() {
		int thisYear = 2020;
		return thisYear - this.hireYear;
	}
	public int getAge() {
		int thisYear = 2020;
		return thisYear - this.birthYear;
	}
	public int getYearsToRetire() {
		if (this.gender.getName()=="M") return 65-this.getAge();
		else return 60-this.getAge();
	}
	public double getPaymentGross() {
		return this.getSalary()+this.getBonus();
	}	
	public double getPaymentNet() {
		return 0.82*this.getPaymentGross();
	}
	
	
	
	
	//Getters and Setters
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		if (salary <  this.position.getMinSalary()) {  
			this.salary = this.position.getMinSalary();
			System.out.println("Wartość pensji poniżej dolnej wartości widełek, przyjęto wartość: "+this.salary);
		}
		if (salary > this.position.getMaxSalary()) {
			this.salary = this.position.getMaxSalary();
			System.out.println("Wartość pensji powyżej górnej wartości widełek, przyjęto wartość: "+this.salary);
		}
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	public int getHireYear() {
		return hireYear;
	}
	public void setHireYear(int hireYear) {
		this.hireYear = hireYear;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	
}