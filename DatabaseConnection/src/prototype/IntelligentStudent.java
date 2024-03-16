package prototype;

public class IntelligentStudent extends Student {
	private int iq;
	
    public IntelligentStudent() {
		super();
	}

	public IntelligentStudent(IntelligentStudent student) {
		super(student);
		this.iq = student.iq;
		
	}
	

	
	public IntelligentStudent clone() {
		return new IntelligentStudent(this);
	}
}
