
public class Instructor extends User{

	public String education;
	public String department;
	public int experience;
	
	public Instructor(){
		
	}

	public Instructor(String education, String department, int experience) {
		this();
		this.education = education;
		this.department = department;
		this.experience = experience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
}
