package week3.day2;

public class JavaConnection implements DataBaseConnection {
	
			public void connect() {
				System.out.println("database is connected");
				
			}

			public void disconnect() {
				System.out.println("database is disconnected");
				
			}

			public void executeUpdate() {
				System.out.println("database is executed and updated");
				
			}
			public static void main(String[] args) {
				
				JavaConnection a1 = new JavaConnection();
				a1.connect();
				a1.disconnect();
				a1.executeUpdate();
			}
}
