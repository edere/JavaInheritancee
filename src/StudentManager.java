
public class StudentManager {

	public void add(Student student) {
		System.out.println(student.getName() + " " + student.getLastName() + ", " + student.getuserType() + " tipinde, " + 
				student.getOld() + " yaş bilgisi,  " + "alanı " + student.department + " ve" + " cinsiyeti " +  student.getGender() +  " olarak" +
						" " + " başarıyla oluşturuldu.");
	}
    public void delete(Student student) {
		
		System.out.println(student.getName() +  " " + student.getLastName() + " " + "kullanıcısı başarıyla silindi.");
	}
    public void updateStudentAdress(Student student) {
    	System.out.println(student.getName() +  " isimli öğrencinin " +  "adresi " + student.getAdress() + " olarak güncellendi.");
    }
}
