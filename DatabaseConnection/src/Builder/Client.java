package Builder;

public class Client {
	public static void main(String[] args) {
		
		
		Student student = Student
				.createBuilder()
				.setName("Praveen")
				.setAge(26)
				.setGender(Gender.MALE)
				.setPhoneNumber("+91-9652797340")
				.setPsp(99).build(); // I am asking student to give bulder object
		
		System.out.println(student.hashCode());
		
	}
}
