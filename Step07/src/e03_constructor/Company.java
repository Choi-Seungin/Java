package e03_constructor;

public class Company {
	String companyName;
	String compantTel;
	int employeeCount;
	String compantURL;

	public Company(String companyName, String compantTel, int employeeCount, String compantURL) {
		this.companyName = companyName;
		this.compantTel = compantTel;
		this.employeeCount = employeeCount;
		this.compantURL = compantURL;
	}

	public Company(String companyName, String compantTel) {
		this(companyName, compantTel, 100, "https://test.com");
	}
	
	//Alt + Shift + s -> s
	@Override
	public String toString() {
		return companyName + " / " + compantTel + " / " + employeeCount
				+ " / " + compantURL;
	}
	
	
	
}
