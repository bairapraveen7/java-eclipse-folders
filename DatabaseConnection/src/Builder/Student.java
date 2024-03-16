package Builder;

public class Student {
	private String name;
	private int age;
	private Gender gender;
	private String universityName;
	private String phoneNumber;
	private double psp;
	
	private Student(Builder b) {
		this.name = b.getName(); 
		this.universityName = b.getUniversityName();
		this.age = b.getAge();
		this.gender = b.getGender();
		this.phoneNumber = b.getPhoneNumber();
		this.psp = b.getPsp();
		
	}
	
	public static Builder createBuilder() {
		return new Builder();
	}
	

	public static class Builder {
		private String name;
		private int age;
		private Gender gender;
		private String universityName;
		private String phoneNumber;
		private double psp;
		public String getName() {
			return name;
		}
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		public int getAge() {
			return age;
		}
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		public Gender getGender() {
			return gender;
		}
		public Builder setGender(Gender gender) {
			this.gender = gender;
			return this;
		}
		public String getUniversityName() {
			return universityName;
		}
		public Builder setUniversityName(String universityName) {
			this.universityName = universityName;
			return this;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public Builder setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		public double getPsp() {
			return psp;
		}
		public Builder setPsp(double psp) {
			this.psp = psp;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}

}
