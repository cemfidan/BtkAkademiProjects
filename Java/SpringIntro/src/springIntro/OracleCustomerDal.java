package springIntro;

public class OracleCustomerDal implements ICustomerDal {

	String connectionString;

	@Override
	public void add() {
		System.out.println("Connection String: " + this.connectionString);
		System.out.println("Added to Oracle database");
	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
