
public class UserManager {

	public void add(User user) {
		
		//System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullan�c�s� ba�ar�yla eklendi.");
	}

	public void delete(User user) {
		System.out.println(user.getName() +  " " + user.getLastName() + " " + "kullan�c�s� ba�ar�yla silindi.");
	}
	
	 public void addMultiple(User[] users) {
	    	for(User user: users) {
	    		add(user);
	    	}
	    	
	    }
}
