
public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getName() +  " " + instructor.getLastName() + " " + "kullanýcýsý baþarýyla eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getName() +  " " + instructor.getLastName() + " " + "kullanýcýsý baþarýyla silindi.");
	}
	public void addInfo(Instructor instructor) {
		System.out.println(instructor.getName() + " Ýsimli eðitmen " + 
	     instructor.getExperience() + " yýl tecrübe ile  "+  instructor.getDepartment() +  " pozisyonunda" +
				" " + " baþarýyla eklendi.");
	}
}
