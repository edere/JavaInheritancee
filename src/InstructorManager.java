
public class InstructorManager {

	public void add(Instructor instructor) {
		System.out.println(instructor.getName() +  " " + instructor.getLastName() + " " + "kullan�c�s� ba�ar�yla eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getName() +  " " + instructor.getLastName() + " " + "kullan�c�s� ba�ar�yla silindi.");
	}
	public void addInfo(Instructor instructor) {
		System.out.println(instructor.getName() + " �simli e�itmen " + 
	     instructor.getExperience() + " y�l tecr�be ile  "+  instructor.getDepartment() +  " pozisyonunda" +
				" " + " ba�ar�yla eklendi.");
	}
}
