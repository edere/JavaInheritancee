
public class UserManager {

	public void add(User user) {
		
		//System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullanıcısı başarıyla eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullanıcısı başarıyla silindi.");
	}
	
	 public void addMultiple(User[] users) {
	    	for(User user: users) {
	    		add(user);
	    	}
	    	
	    }
}
