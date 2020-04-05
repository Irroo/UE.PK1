package projekt1;

public class Department {
	private String departmentName;
	private String localisation;
	private String phoneNumber;
	
	//Constructors
	public Department(String departmentName, String localisation, String phoneNumber) {
		super();
		this.departmentName = departmentName;
		this.localisation = localisation;
		this.phoneNumber = phoneNumber;
	}
	public Department(String departmentName, String localisation) {
		super();
		this.departmentName = departmentName;
		this.localisation = localisation;
	}
	
	//Business methods
	public String getFullInfo() {
		String output = this.getDepartmentName()+" "+this.getLocalisation();
		if (this.getPhoneNumber() != null) output = output +" "+this.getPhoneNumber();
		return output;
	}

	
	
	
	//Getters and Setters
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
	
		


	
	
	

	
	
	
	
	
}
