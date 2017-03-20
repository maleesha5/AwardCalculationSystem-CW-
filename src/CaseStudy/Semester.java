package CaseStudy;

public class Semester {
	private String semesterID;
	private String Level;

	

	public Semester(String semesterID) {
		super();
		this.semesterID = semesterID;
	}

	@Override
	public String toString() {
		return "Semester [semesterID=" + semesterID + "]";
	}

	public String getSemesterID() {
		return semesterID;
	}

	public void setSemesterID(String semesterID) {
		this.semesterID = semesterID;
	}

	public String getLevel() {
		return Level;
	}

	public void setLevel(String level) {
		Level = level;
	}
	

}
