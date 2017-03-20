package CaseStudy;

public class Module {
	private String moduleCode;
	private  String moduleName;
	private int creditValue;
	public Module(String moduleCode, String moduleName, int creditValue) {
		super();
		this.moduleCode = moduleCode;
		this.moduleName = moduleName;
		this.creditValue = creditValue;
	}
	public String getModuleCode() {
		return moduleCode;
	}
	public  String getModuleName() {
		return moduleName;
	}

	public int getCreditValue() {
		return creditValue;
	}
	@Override
	public String toString() {
		return "Module [moduleCode=" + moduleCode + ", moduleName=" + moduleName + 
				 ", creditValue=" + creditValue + "]";
	}
	


}
