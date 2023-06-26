public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		UserControl userControl = new UserControl(user);
		userControl.report();
		userControl.save();
	}
}