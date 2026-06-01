class Employee {
	private String name;
	private double salary;
	
	public void setName(String n) {
		name = n;
	}
	public void  setSalary(double s) {
		salary = s;
	}
	public String getName() {
	return name;
	}
	public double getSalary() {
	return salary;
	}
	
	public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Varun");
        e.setSalary(52000);
        System.out.println(e.getName() + " earns " + e.getSalary());
    }
}