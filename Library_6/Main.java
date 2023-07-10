package Library_6;

public class Main {
	public static void main(String[] args) {
		User user = new User("Bob");
		Persister persister = new Persister(user);
		Report report = new Report();
		report.report(user);
		persister.save();
	}
}