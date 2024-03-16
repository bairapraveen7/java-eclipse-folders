package prototype;

public class Student implements Prototype {
	
	private int age;
	private String name;
	private double psp;
	private String batchName;
	private double averageBatchPsp;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPsp() {
		return psp;
	}
	public void setPsp(double psp) {
		this.psp = psp;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public double getAverageBatchPsp() {
		return averageBatchPsp;
	}
	public void setAverageBatchPsp(double averageBatchPsp) {
		this.averageBatchPsp = averageBatchPsp;
	}
	
	public Student() {
		
	}
	
	public Student(Student student) {
		this.name = student.name;
		this.age = student.age;
		this.psp = student.psp;
		this.averageBatchPsp = student.averageBatchPsp;
	}
	
	public Student clone() {
		
		return new Student(this);
	}
	

}
