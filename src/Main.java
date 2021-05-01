
public class Main {

	public static void main(String[] args) {
		
		System.out.println("**User**");
		User users = new User();
		users.setId(1);
		users.setName("Esra");
		users.setLastName("Dere");
		users.setContact("SMS");
		users.setType("Öðrenci");
		//ahajadka
		
		User users2 = new User();
		users2.setId(2);
		users2.setName("Burak");
		users2.setLastName("Koca");
		users2.setContact("E-Mail");
		users2.setType("Eðitmen");
		
		User[] addNewUser = {users, users2};
		UserManager um = new UserManager();
		um.addMultiple(addNewUser);
		System.out.println(users.getName() + " kullanýcý ismiyle " + users.getuserType() + ", " +
		users2.getName() + " kullanýcý ismiyle " + users2.userType + " tipinde kulllanýcýlar baþarýyla oluþturuldu.");
	   
		System.out.println("**Instructor**");
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Burak");
		instructor.setLastName("Koca");
		instructor.setEducation("Yazýlým Mühendisi");
		instructor.setDepartment(".NET Core Developer");
		instructor.setExperience(6);
		
		InstructorManager im = new InstructorManager();
		im.addInfo(instructor);

		System.out.println("**Student**");
		
        Student student = new Student();
        student.setId(1);
        student.setName("Esra");
        student.setLastName("Dere");
        student.setType("Öðrenci");
        student.setDepartment("JAVA");
        student.setOld(27);
        student.setGender("Kýz");
        student.setAdress("Çekmeköy");
        
        StudentManager sm = new StudentManager();
        sm.add(student);
        sm.updateStudentAdress(student);

	}

}
