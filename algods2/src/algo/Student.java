package algo;

public class Student {

	private String name;
	private int id;
	private Double Cgpa;

	public Student(String name, int id, Double cgpa) {
		super();
		this.name = name;
		this.id = id;
		Cgpa = cgpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getCgpa() {
		return Cgpa;
	}

	public void setCgpa(Double cgpa) {
		Cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", Cgpa=" + Cgpa + "]";
	}
	
	

}
