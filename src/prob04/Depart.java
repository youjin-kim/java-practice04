package prob04;

public class Depart extends Employee {
	private String depart;
	
	public Depart(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}
	
	public void getInformation() {
		System.out.println( "이름:" + super.getName() + " 연봉:" + super.getSalary() + " 부서:" + depart);
	}

}
