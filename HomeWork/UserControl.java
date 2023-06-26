public class UserControl implements Preserved, Report{
	private User user;
	
	public UserControl(User user){
		this.user = user;
	}
	@Override
	public void save(){
		System.out.println("Save user: " + user.getName());
	}

	@Override
	public void report() {
		System.out.println("Report for user: " + user.getName());
	}
}