package CaseStudy;

public class Student implements java.io.Serializable {
	private static String firstName;//declaring variables
	private static String lastName;
	private static String studentId;
	private Integer Module1, Module2, Module3, Module4, Module5, Module6;
	

	public Integer getModule1() {//generating getters and setters
		return Module1;
	}

	public void setModule1(Integer module1) {
		Module1 = module1;
	}

	public Integer getModule2() {
		return Module2;
	}

	public void setModule2(Integer module2) {
		Module2 = module2;
	}

	public Integer getModule3() {
		return Module3;
	}

	public void setModule3(Integer module3) {
		Module3 = module3;
	}

	public Integer getModule4() {
		return Module4;
	}

	public void setModule4(Integer module4) {
		Module4 = module4;
	}

	public Integer getModule5() {
		return Module5;
	}

	public void setModule5(Integer module5) {
		Module5 = module5;
	}

	public Integer getModule6() {
		return Module6;
	}

	public void setModule6(Integer module6) {
		Module6 = module6;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	

	public Student(String firstName, String lastName, String studentId, Integer module1, Integer module2,
			Integer module3, Integer module4, Integer module5, Integer module6) {//generating constructor
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentId = studentId;
		Module1 = module1;
		Module2 = module2;
		Module3 = module3;
		Module4 = module4;
		Module5 = module5;
		Module6 = module6;
	}

	public static String getFirstName() {
		return firstName;
	}

	public static String getLastName() {
		return lastName;
	}

	public static String getStudentId() {
		return studentId;
	}

	@Override
	public String toString() {//generating to String
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", studentId=" + studentId + ", Module1="
				+ Module1 + ", Module2=" + Module2 + ", Module3=" + Module3 + ", Module4=" + Module4 + ", Module5="
				+ Module5 + ", Module6=" + Module6 + "]";
	}
	
	
	

}
