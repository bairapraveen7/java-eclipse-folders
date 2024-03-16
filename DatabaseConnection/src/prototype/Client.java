package prototype;

public class Client {
	
	public static void fillRegistry(StudentRegistry studentRegistry) {
		
		Student student = new Student();
		student.setBatchName("Apr23 Beginner Batch");
		student.setAverageBatchPsp(90);
		
		studentRegistry.register("Apr23BeginnerBatch",student);
		
		IntelligentStudent intelligentStudent = new IntelligentStudent();
		intelligentStudent.setBatchName("Apr23 Beginner Batch");
		intelligentStudent.setAverageBatchPsp(90);
		
		studentRegistry.register("Apr23IntelligentBatch", intelligentStudent);
		
	}
	
	public static void main(String[] args) {
		StudentRegistry st  = new StudentRegistry();
		fillRegistry(st);
		Student mrunal = st.get("Apr23BeginnerBatch").clone();
		mrunal.setName("Dhaval");
		mrunal.setPsp(98);
		
		Student dhaval = st.get("Apr23IntelligentBatch").clone();
		dhaval.setName("Dhaval");
		dhaval.setPsp(98);
		
		System.out.println("DeBUg");
	}

}
