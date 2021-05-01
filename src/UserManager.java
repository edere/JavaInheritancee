
public class UserManager {

	public void add(User user) {
		
		//System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullanýcýsý baþarýyla eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullanýcýsý baþarýyla silindi.");
	}
	
	 public void addMultiple(User[] users) {
	    	for(User user: users) {
	    		add(user);
	    	}
	    	
	    }
}
