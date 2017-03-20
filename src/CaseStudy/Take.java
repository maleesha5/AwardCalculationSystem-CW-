package CaseStudy;

import java.util.ArrayList;
import java.util.List;

public class Take {

	private String studentID;
	private String ModuleCode;
	private String semCode;
	private List<Marks> list=new ArrayList<Marks>();

	public Take(String studentID, String moduleCode, String semCode, List<Marks> list) {
		super();
		this.studentID = studentID;
		this.ModuleCode = moduleCode;
		this.semCode = semCode;
		this.list = list;
	}
	public String getStudentID() {
		return studentID;
	}
	public String getModuleCode() {
		return ModuleCode;
	}
	public String getSemCode() {
		return semCode;
	}
	public List<Marks> getList() {
		return list;
	}
	public void setList(List<Marks> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Take [studentID=" + studentID + ", ModuleCode=" + ModuleCode + ", semCode=" + semCode + ", list=" + list
				+ "]";
	}
	
	
	



}
