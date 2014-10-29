package iit.lk;

public abstract class Employee <E> {
	
	protected E name;
	protected E empType;
	protected int id;
	
	public Employee(E name, E empType, int id) {
		super();
		this.name = name;
		this.empType = empType;
		this.id = id;
	}
	
	public void setName(E name) {
		this.name = name;
	}

	public void setEmpType(E empType) {
		this.empType = empType;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract int Payments();
	
}
