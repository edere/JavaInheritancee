
public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getName() + " " + student.getLastName() + ", " + student.getuserType() + " tipinde, " + 
				student.getOld() + " ya� bilgisi,  " + "alan� " + student.department + " ve" + " cinsiyeti " +  student.getGender() +  " olarak" +
						" " + " ba�ar�yla olu�turuldu.");
	}
    public void delete(Student student) {
		
		System.out.println(student.getName() +  " " + student.getLastName() + " " + "kullan�c�s� ba�ar�yla silindi.");
	}
    public void updateStudentAdress(Student student) {
    	System.out.println(student.getName() +  " isimli ��rencinin " +  "adresi " + student.getAdress() + " olarak g�ncellendi.");
    }
}
