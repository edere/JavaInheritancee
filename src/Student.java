
public class Student extends User{
 
	public String department;
	public int old;
	public String gender;
	public String adress;
	
	public Student() {
		
	}

	public Student(String department, int old, String gender, String adress) {
		this();
		this.department = department;
		this.old = old;
		this.gender = gender;
		this.adress = adress;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getOld() {
		return old;
	}

	public void setOld(int old) {
		this.old = old;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	
	
}
